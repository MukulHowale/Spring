package com.example.relationships.OneToMany.repository;

import com.example.relationships.OneToMany.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
