package com.example.relationships.OneToMany.controller;

import com.example.relationships.OneToMany.entity.Author;
import com.example.relationships.OneToMany.entity.Book;
import com.example.relationships.OneToMany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Object getBookById(@PathVariable("id") Long bookId){
        return bookService.getBookById(bookId);
    }

    @GetMapping("/book/{id}/author")
    public Object getAuthorByBookId(@PathVariable("id") Long bookId){
        return bookService.getAuthorByBookId(bookId);
    }


}
