package com.example.Assingment4.RestFullServices.controller;

import com.example.Assingment4.RestFullServices.dto.BookDTO;
import com.example.Assingment4.RestFullServices.service.BookService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    BookService bookService;

    @GetMapping("/author/books")
    public ResponseEntity getAllBooks(){

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookService.getAllBooks());

        mappingJacksonValue.setFilters(filtering());

        return ResponseEntity.ok(mappingJacksonValue);
    }

    @GetMapping("/author/books/{id}")
    public ResponseEntity getBookById(@PathVariable("id") Long bookId){

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookService.getBookById(bookId));

        mappingJacksonValue.setFilters(filtering());

        return new ResponseEntity(mappingJacksonValue , HttpStatus.OK);
    }

    @PostMapping("/author/books")
    public ResponseEntity addBook(@RequestBody BookDTO bookDTO){

        BookDTO bookDTO1 = bookService.addBook(bookDTO);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bookDTO1.getBookId())
                .toUri();

        return ResponseEntity.created(location).body("Book added by author");
    }

    @DeleteMapping("/author/books/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") Long bookId){

        bookService.deleteBook(bookId);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/..")
                .build()
                .normalize()
                .toUri();

        return ResponseEntity.accepted()
                .header("Location",String.valueOf(location))
                .body("Book is deleted by author");
    }

    @PutMapping("/author/books/{id}")
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
