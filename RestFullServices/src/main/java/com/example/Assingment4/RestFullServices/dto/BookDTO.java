package com.example.Assingment4.RestFullServices.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonFilter("BookFilter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublication;
    private String bookCategory;
    private String bookPages;
    private Long bookPrice;
    private String bookRegisNo;
    private String bookAuthorNo;

}
