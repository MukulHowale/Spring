package com.example.relationships.ManyToMany.repository;

import com.example.relationships.ManyToMany.entiry.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
