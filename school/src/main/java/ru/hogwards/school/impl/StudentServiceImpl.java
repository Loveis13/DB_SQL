package ru.hogwards.school.impl;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ru.hogwards.school.Service.StudentService;
import ru.hogwards.school.model.Faculty;
import ru.hogwards.school.model.Student;
import ru.hogwards.school.repository.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public Student add(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student get(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student update(Long id, Student student) {
       return studentRepository.findById(id).map(studentFromDb ->{
            studentFromDb.setName(student.getName());
            studentFromDb.setAge(student.getAge());
           return studentRepository.save(studentFromDb);

        }).orElse(null);

    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);

    }

    @Override
    public List<Student> getByAge(int age) {
        return studentRepository.findAll()
                .stream().filter(it->it
                        .getAge() == age)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> getByAgeBetWeen(int ageFrom, int ageTo) {
        return studentRepository.findByAgeBetween(ageFrom, ageTo);
    }

    @Override
    public Faculty getFaculty(Long id) {
        return studentRepository.findById(id).map(student -> {
            return student.getFaculty();
        }).orElse(null);
    }
}
