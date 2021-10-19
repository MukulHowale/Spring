package com.example.CRUD.OneToOneRelationship.repository;

import com.example.CRUD.OneToOneRelationship.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentRepository extends JpaRepository<Student, Long> {

}
