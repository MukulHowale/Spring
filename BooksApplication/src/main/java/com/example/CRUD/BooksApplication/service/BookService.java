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
//        BookEntity bookEntity = bookRepository.getById(bookId);

        Optional<BookEntity> bookEntity = bookRepository.findById(bookId);

        if (bookEntity.isEmpty()){
            BookEntity bookEntity2 = new BookEntity();
            return bookEntity2.bookNotPresent();
        }

        List<BookEntity> bookEntities = new ArrayList<>();
        bookEntities.add(bookEntity.get());

        return bookEntities;

//        bookEntity.setBookAuthor("IronMan");

//        return bookEntity.getBookAuthor();
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

        bookRepository.delete(bookEntity.get());

        List<BookEntity> bookEntity1 = bookRepository.findAll();
        return bookEntity1;
    }

    public List updateBook(String bookId, BookEntity bookEntity) {
        List<BookEntity> bookEntities = getBookById(bookId);

        BookEntity bookEntity1 = bookEntities.get(0);

        if (bookEntity1.equals("Id Not Present")) {
            return bookEntities;
        }
        else{
            if (bookEntity.getBookName() != null){
                bookEntity1.setBookName(bookEntity.getBookName());
            }
            if(bookEntity.getBookAuthor() != null){
                bookEntity1.setBookAuthor(bookEntity.getBookAuthor());
            }
            if(bookEntity.getBookPublication() != null){
                bookEntity1.setBookPublication(bookEntity.getBookPublication());
            }
            if(bookEntity.getBookCategory() != null){
                bookEntity1.setBookCategory(bookEntity.getBookCategory());
            }
            if(bookEntity.getBookPages() != null){
                bookEntity1.setBookPages(bookEntity.getBookPages());
            }
            if(bookEntity.getBookPrice() != null){
                bookEntity1.setBookPrice(bookEntity.getBookPrice());
            }
        }
        bookEntities.add(bookEntity1);
        return bookEntities;
    }
}
