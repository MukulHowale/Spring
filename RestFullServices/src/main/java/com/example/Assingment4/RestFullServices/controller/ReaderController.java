package com.example.Assingment4.RestFullServices.controller;

import com.example.Assingment4.RestFullServices.dto.BookDTO;
import com.example.Assingment4.RestFullServices.service.BookService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReaderController {

    @Autowired
    BookService bookService;

    @GetMapping("/reader/books")
    public ResponseEntity getAllBooks(){

        List<BookDTO> bookDTO = bookService.getAllBooks();

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookDTO);

        mappingJacksonValue.setFilters(filtering());

        return ResponseEntity.ok(mappingJacksonValue);
    }

    @GetMapping("/reader/books/{id}")
    public ResponseEntity getBookById(@PathVariable("id") Long bookId){

        BookDTO bookDTO = bookService.getBookById(bookId);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bookDTO);

        mappingJacksonValue.setFilters(filtering());

        return ResponseEntity.ok(mappingJacksonValue);
    }

    private FilterProvider filtering(){
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("bookName","bookAuthor","bookPublication",
                        "bookCategory","bookPages","bookPrice");

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("BookFilter", filter);

        return filterProvider;
    }
}
