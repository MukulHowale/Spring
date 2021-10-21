package com.example.relationships.ManyToMany.repository;

import com.example.relationships.ManyToMany.entiry.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface SubjectsRepository extends JpaRepository<Subjects, Long> {

}
