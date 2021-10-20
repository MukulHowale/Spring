package com.example.relationships.OneToMany.service;

import com.example.relationships.OneToMany.Messages;
import com.example.relationships.OneToMany.OneToManyApplication;
import com.example.relationships.OneToMany.entity.Author;
import com.example.relationships.OneToMany.entity.Book;
import com.example.relationships.OneToMany.repository.AuthorRepository;
import com.example.relationships.OneToMany.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    static final Logger log = LoggerFactory.getLogger(OneToManyApplication.class);

    public Object assignBookToAuthor(Long authorId, List<Book> book) {
        Author author = authorRepository.findById(authorId).get();

        for(Book book1 : book) {
            if(bookRepository.findById(book1.getBookId()).isPresent()){
                return new Messages("Duplicate book Id not allowed, try different Id");
            }
            author.setBook(book1);
            book1.setAuthor(author);
            bookRepository.save(book1);
            authorRepository.save(author);
        }

        return author;
    }

    public Object addAuthorAndBook(Author author) {
        if(authorRepository.findById(author.getAuthorId()).isPresent()){
            return new Messages("Duplicate book Id not allowed, try different Id");
        }
        authorRepository.save(author);

        return new Messages("Author added");
    }
}
