package com.example.relationships.OneToMany.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {

    @Id
    Long authorId;
    String authorName;
    Integer authorAge;
    String authorAddress;


    @OneToMany(mappedBy = "author")
    List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks(){
        return books;
    }

    public void setBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }
}
