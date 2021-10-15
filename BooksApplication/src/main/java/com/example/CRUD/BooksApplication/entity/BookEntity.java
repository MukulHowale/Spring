package com.example.CRUD.BooksApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookEntity {

    @Id
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublication;
    private String bookCategory;
    private String bookPages;
    private String bookPrice;


    public BookEntity(String bookId, String bookName, String bookAuthor, String bookPublication, String bookCategory, String bookPages, String bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublication = bookPublication;
        this.bookCategory = bookCategory;
        this.bookPages = bookPages;
        this.bookPrice = bookPrice;
    }

    public BookEntity(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublication='" + bookPublication + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                ", bookPages='" + bookPages + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                '}';
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublication() {
        return bookPublication;
    }

    public void setBookPublication(String bookPublication) {
        this.bookPublication = bookPublication;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookPages() {
        return bookPages;
    }

    public void setBookPages(String bookPages) {
        this.bookPages = bookPages;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public List bookNotPresent(){
        List list = new ArrayList();
        list.add("Id Not Present");
        return list;
    }


//    INSERT INTO BOOK_ENTITY(BOOK_ID, BOOK_AUTHOR, BOOK_CATEGORY, BOOK_NAME, BOOK_PAGES, BOOK_PRICE, BOOK_PUBLICATION)
//    VALUES('1', 'Iron Man', 'Sci-Fi', 'Love You 3000', '3000', '3000', 'Avengers')
}
