package ru.hogwards.school.Controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwards.school.Service.FacultyService;
import ru.hogwards.school.model.Faculty;
import ru.hogwards.school.model.Student;

import java.util.List;

@RestController
@RequestMapping("faculties")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("{id}")
    public Faculty get(@PathVariable Long id) {
        return facultyService.get(id);
    }

    @PostMapping
    public Faculty add(@RequestBody Faculty faculty) {
        return facultyService.add(faculty);
    }

    @PutMapping("{id}")
    public Faculty update(@PathVariable Long id, @RequestBody Faculty faculty) {
        return facultyService.update(id, faculty);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        facultyService.delete(id);
    }

    @GetMapping
    public List<Faculty> getByColor(@RequestParam String color) {
        return facultyService.getByColor(color);


    }

    @GetMapping("getByNameOrColorIgnoreCase")
    public List<Faculty> getByNameOrColorIgnoreCase(
            @RequestParam String name,
            @RequestParam String color
    ){
        return facultyService.getByNameOrColorIgnoreCase(name, color);
    }
    @GetMapping("{id}/students")
    public List<Student> getStudents(@PathVariable Long id){
        return facultyService.getStudents(id);
    }

}
