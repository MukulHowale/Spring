package com.example.CRUD.OneToOneRelationship.service;

import com.example.CRUD.OneToOneRelationship.entity.Passport;
import com.example.CRUD.OneToOneRelationship.entity.Student;
import com.example.CRUD.OneToOneRelationship.repository.PassportRepository;
import com.example.CRUD.OneToOneRelationship.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PassportRepository passportRepository;

    public Student insertStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public Student assignPassport(Long studentId, Passport passport) {
        Student student  = studentRepository.findById(studentId).get();

        passportRepository.save(passport);

        student.setPassport(passport);

        studentRepository.save(student);

        return student;
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
