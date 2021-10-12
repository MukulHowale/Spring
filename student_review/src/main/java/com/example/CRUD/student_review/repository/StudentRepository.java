package com.example.CRUD.student_review.repository;


import com.example.CRUD.student_review.entiry.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentRepository extends JpaRepository<Student, String> {

}
