package com.example.Assingment4.RestFullServices.service;

import com.example.Assingment4.RestFullServices.RestFullServicesApplication;
import com.example.Assingment4.RestFullServices.dto.BookDTO;
import com.example.Assingment4.RestFullServices.entity.Book;
import com.example.Assingment4.RestFullServices.exception.BookIdExist;
import com.example.Assingment4.RestFullServices.exception.BookNotFound;
import com.example.Assingment4.RestFullServices.exception.NoBodyFound;
import com.example.Assingment4.RestFullServices.modelmapper.ModelMapperClass;
import com.example.Assingment4.RestFullServices.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ModelMapperClass modelMapperClass;

    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();

        if (books.isEmpty()){
            throw new BookNotFound("No books found in the database");
        }

        ModelMapper modelMapper = modelMapperClass.modelMapper();

        List<BookDTO> bookDto
                = modelMapper.map(books, new TypeToken<List<BookDTO>>() {}.getType());

        return bookDto;
    }


    public BookDTO getBookById(Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);

        if (book.isEmpty()){
            throw new BookNotFound("Book not found");
        }

        BookDTO bookDTO = modelMapperClass.modelMapper().map(book.get(), new TypeToken<BookDTO>() {}.getType());

        return bookDTO;
    }


    public BookDTO addBook(BookDTO bookDTO) {

        Book book = modelMapperClass.modelMapper().map(bookDTO, new TypeToken<Book>() {}.getType());

        if(bookRepository.findById(book.getBookId()).isPresent()){
            throw new BookIdExist("Book ID already exists");
        }

        bookRepository.save(book);

        return bookDTO;
    }


    public void deleteBook(Long bookId) {

        Optional<Book> book = bookRepository.findById(bookId);

        if (book.isEmpty()){
            throw new BookNotFound("Book not found");
        }

        bookRepository.delete(book.get());
    }


    public BookDTO updateBookById(Long bookId, BookDTO bookDTO) {
        Book book = modelMapperClass.modelMapper().map(bookDTO, new TypeToken<Book>() {}.getType());

        Book book1 = bookRepository.findById(bookId).get();

        modelMapperClass.modelMapper().map(book,book1);

        bookRepository.save(book1);

        return modelMapperClass.modelMapper().map(book1, new TypeToken<BookDTO>() {}.getType());
    }
}
