package com.example.CRUD.student_review.service;

import com.example.CRUD.student_review.entiry.Student;
import com.example.CRUD.student_review.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

//    Help while testing corner case data and on that we check our logic
//    Dependency Injection
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){

        List<Student> studentInfo = studentRepository.findAll();
        return studentInfo;
    }
}
