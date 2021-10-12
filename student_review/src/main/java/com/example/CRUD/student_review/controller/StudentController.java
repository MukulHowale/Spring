package com.example.CRUD.student_review.controller;


import com.example.CRUD.student_review.entiry.Student;
import com.example.CRUD.student_review.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> studentInfo = studentService.getAllStudents();
        return studentInfo;
    }
}
