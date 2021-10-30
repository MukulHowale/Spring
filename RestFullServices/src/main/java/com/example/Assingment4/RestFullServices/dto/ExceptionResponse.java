package com.example.Assingment4.RestFullServices.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ExceptionResponse {

    private Date date;
    private String message;
    private String details;
}
