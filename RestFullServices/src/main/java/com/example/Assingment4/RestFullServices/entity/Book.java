package com.example.Assingment4.RestFullServices.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    Long bookId;
    String bookName;
    String bookAuthor;
    String bookPublication;
    String bookCategory;
    String bookPages;
    Long bookPrice;
    String bookRegisNo;
    String bookAuthorNo;
}
