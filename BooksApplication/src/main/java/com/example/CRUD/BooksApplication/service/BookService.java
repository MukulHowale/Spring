package com.example.CRUD.BooksApplication.service;

import com.example.CRUD.BooksApplication.entity.BookEntity;
import com.example.CRUD.BooksApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<BookEntity> getBooks() {
        List<BookEntity> bookEntities = bookRepository.findAll();
        return bookEntities;
    }

    public List getBookById(String bookId) {
        Optional<BookEntity> bookEntity = bookRepository.findById(bookId);

        if (bookEntity.isEmpty()){
            BookEntity bookEntity2 = new BookEntity();
            return bookEntity2.bookNotPresent();
        }

        List<BookEntity> bookEntities = new ArrayList<>();
        bookEntities.add(bookEntity.get());

        return bookEntities;
    }

    public List<BookEntity> addBook(List<BookEntity> bookEntity) {
        for (BookEntity i : bookEntity) {
            bookRepository.save(i);
        }

        List<BookEntity> bookEntities = bookRepository.findAll();
        return bookEntities;
    }

    public List deleteBook(String bookId) {
        Optional<BookEntity> bookEntity = bookRepository.findById(bookId);

        if (bookEntity.isEmpty()){
            BookEntity bookEntity2 = new BookEntity();
            return bookEntity2.bookNotPresent();
        }

        List<BookEntity> bookEntity1 = bookRepository.findAll();
        return bookEntity1;
    }
}
