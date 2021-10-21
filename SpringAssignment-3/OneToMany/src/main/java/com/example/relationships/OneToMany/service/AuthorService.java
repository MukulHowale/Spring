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
import java.util.Optional;


@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    static final Logger log = LoggerFactory.getLogger(OneToManyApplication.class);

    public Object assignBookToAuthor(Long authorId, List<Book> book) {
        Optional<Author> author = authorRepository.findById(authorId);

        if(author.isEmpty()){
            return new Messages("Author with this ID not present");
        }

        Author author1 = author.get();

        for(Book book1 : book) {
            if(bookRepository.findById(book1.getBookId()).isPresent()){
                return new Messages("Duplicate book Id not allowed, try different Id");
            }
            author1.setBook(book1);
            book1.setAuthor(author1);
            bookRepository.save(book1);
            authorRepository.save(author1);
        }

        return author1;
    }

    public Object addAuthor(Author author) {
        if(authorRepository.findById(author.getAuthorId()).isPresent()){
            return new Messages("Duplicate book Id not allowed, try different Id");
        }
        authorRepository.save(author);

        return new Messages("Author added");
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Object getAuthorById(Long authorId) {
        Optional<Author> author = authorRepository.findById(authorId);

        if(author.isEmpty()){
            return new Messages("No book found with this Id, try another one");
        }

        return author.get();
    }
}
