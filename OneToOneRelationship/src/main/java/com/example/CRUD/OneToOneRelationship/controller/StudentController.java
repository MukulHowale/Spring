package com.example.CRUD.OneToOneRelationship.controller;

import com.example.CRUD.OneToOneRelationship.entity.Passport;
import com.example.CRUD.OneToOneRelationship.entity.Student;
import com.example.CRUD.OneToOneRelationship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/student")
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @PutMapping("/student/{id}/passport")
    public Student assignPassport(@PathVariable("id") Long studentId, @RequestBody Passport passport){
        return studentService.assignPassport(studentId,passport);
    }
}
