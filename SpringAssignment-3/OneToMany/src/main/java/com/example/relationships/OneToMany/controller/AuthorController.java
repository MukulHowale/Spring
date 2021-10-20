package com.example.relationships.OneToMany.controller;

import com.example.relationships.OneToMany.OneToManyApplication;
import com.example.relationships.OneToMany.entity.Author;
import com.example.relationships.OneToMany.entity.Book;
import com.example.relationships.OneToMany.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    static final Logger log = LoggerFactory.getLogger(OneToManyApplication.class);

    @PostMapping("/author/book")
    public Object addAuthor(@RequestBody Author author){
        return authorService.addAuthorAndBook(author);
    }

    @PostMapping("/author/{id}/book")
    public Object assignBookToAuthor(@PathVariable("id") Long authorId,
                                   @RequestBody List<Book> book){
        return authorService.assignBookToAuthor(authorId,book);
    }
}
