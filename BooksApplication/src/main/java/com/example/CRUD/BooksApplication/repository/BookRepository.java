package com.example.CRUD.BooksApplication.repository;

import com.example.CRUD.BooksApplication.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface BookRepository extends JpaRepository<BookEntity, String> {

}
