package com.example.Assingment4.RestFullServices.controller;

import com.example.Assingment4.RestFullServices.dto.BookDTO;
import com.example.Assingment4.RestFullServices.entity.Book;
import com.example.Assingment4.RestFullServices.service.BookService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/bookservice/books")
    public ResponseEntity getAllBooks(){

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookService.getAllBooks());

        mappingJacksonValue.setFilters(filtering());

        return ResponseEntity.ok(mappingJacksonValue);
    }

    @GetMapping("/bookservice/books/{id}")
    public ResponseEntity getBookById(@PathVariable("id") Long bookId){

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookService.getBookById(bookId));

        mappingJacksonValue.setFilters(filtering());

        return ResponseEntity.ok(mappingJacksonValue);
    }

    @PostMapping("/bookservice/books")
    public ResponseEntity addBook(@RequestBody BookDTO bookDTO){

        BookDTO book1 = bookService.addBook(bookDTO);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(book1.getBookId())
                .toUri();


        // One of the way to send ResponseEntity
//        return new ResponseEntity<>(location, HttpStatus.CREATED);

        return ResponseEntity.created(location).body("Book has been added");
    }

    @DeleteMapping("/bookservice/books/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") Long bookId){

        bookService.deleteBook(bookId);

        // .normalize() removes the end of the path defined
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/..")
                .build()
                .normalize()
                .toUri();

        // Here it sends body, location and status code could be changed
        return ResponseEntity.accepted()
                .header("Location", String.valueOf(location))
                .body("Book has been deleted");


        // Here it can 'created status code' and status could not be changed
//        return ResponseEntity.created(location).body("Book has been deleted");
    }

    @PutMapping("/bookservice/books/{id}")
    public ResponseEntity updateBookById(@PathVariable("id") Long bookId,
                                  @RequestBody BookDTO bookDTO){

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookService.updateBookById(bookId,bookDTO));

        mappingJacksonValue.setFilters(filtering());

        return ResponseEntity.ok(mappingJacksonValue);
    }

    private FilterProvider filtering(){
        SimpleBeanPropertyFilter filter =  SimpleBeanPropertyFilter.serializeAllExcept();

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("BookFilter" ,filter);

        return filterProvider;
    }
}
