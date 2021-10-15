package com.example.CRUD.BooksApplication.controller;

import com.example.CRUD.BooksApplication.entity.BookEntity;
import com.example.CRUD.BooksApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/bookservice/books")
    public List<BookEntity> getBooks(){
        List<BookEntity> bookEntities = bookService.getBooks();
        return bookEntities;
    }

    @GetMapping("/bookservice/books/{id}")
    public List<BookEntity> getBookById(@PathVariable("id") String bookId){
        List<BookEntity> bookEntity = bookService.getBookById(bookId);
        return bookEntity;
//        String bookEntity = bookService.getBookById(bookId);
//        return bookEntity;
    }

    @PostMapping("/bookservice/books")
    public List<BookEntity> addBook(@RequestBody List<BookEntity> bookEntity){
        List<BookEntity> bookEntity1 = bookService.addBook(bookEntity);
        return bookEntity1;
    }

    @DeleteMapping("/bookservice/books/{id}")
    public List<BookEntity> deleteBook(@PathVariable("id") String bookId){
        List<BookEntity> bookEntityList = bookService.deleteBook(bookId);
        return bookEntityList;
    }

    @PutMapping("/bookservice/books/{id}")
    public List<BookEntity> updateBook(@PathVariable("id") String bookId, @RequestBody BookEntity bookEntity){
        List<BookEntity> bookEntity1 = bookService.updateBook(bookId,bookEntity);
        return bookEntity1;
    }
}
