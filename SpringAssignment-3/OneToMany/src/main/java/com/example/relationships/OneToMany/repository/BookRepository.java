package com.example.relationships.OneToMany.repository;

import com.example.relationships.OneToMany.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BookRepository extends JpaRepository<Book, Long> {
}
