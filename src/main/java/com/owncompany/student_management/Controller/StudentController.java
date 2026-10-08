package com.owncompany.student_management.Controller;

import com.owncompany.student_management.Service.StudentService;
import com.owncompany.student_management.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student getNewStudent(Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getById(id);
    }
}
