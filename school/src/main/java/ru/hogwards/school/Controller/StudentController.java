package ru.hogwards.school.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwards.school.Service.StudentService;
import ru.hogwards.school.model.Faculty;
import ru.hogwards.school.model.Student;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{id}")
    public Student get(@PathVariable Long id) {
        return studentService.get(id);
    }

    @PostMapping
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @PutMapping("{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id) {
         studentService.delete(id);
         return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<Student> getByAge(@RequestParam int age) {
        return studentService.getByAge(age);


    }
    @GetMapping("getByAgeBetWeen")
    public List<Student> getByAgeBetWeen(@RequestParam int ageFrom,@RequestParam int ageTo){
    return studentService.getByAgeBetWeen(ageFrom,ageTo);
    }
    @GetMapping("{id}/Faculty")
    public Faculty getFaculty(@PathVariable Long id ){
    return studentService.getFaculty(id);
    }
}
