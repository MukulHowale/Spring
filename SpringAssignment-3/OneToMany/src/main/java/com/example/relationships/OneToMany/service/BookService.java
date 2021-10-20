package com.example.relationships.OneToMany.service;

import com.example.relationships.OneToMany.Messages;
import com.example.relationships.OneToMany.entity.Book;
import com.example.relationships.OneToMany.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Object getBookById(Long bookId) {

        Optional<Book> book = bookRepository.findById(bookId);

        if(book.isEmpty()){
            return new Messages("No book found with this Id, try another one");
        }

        return book.get();
    }

    public Object getAuthorByBookId(Long bookId) {

        Optional<Book> book = bookRepository.findById(bookId);

        if(book.isEmpty()){
            return new Messages("No book found with this Id, try another one");
        }

        return book.get().getAuthor();
    }

}
