package com.example.Assingment4.RestFullServices.repository;

import com.example.Assingment4.RestFullServices.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book , Long> {
}
