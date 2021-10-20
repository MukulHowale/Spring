package com.example.CRUD.OneToOneRelationship.controller;

import com.example.CRUD.OneToOneRelationship.entity.Passport;
import com.example.CRUD.OneToOneRelationship.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportController {

    @Autowired
    PassportService passportService;

    @GetMapping("/passports")
    public List<Passport> getAllPassports(){
        return passportService.getAllPassports();
    }

    @PostMapping("/passport")
    public List<Passport> insertPassport(@RequestBody Passport passport){
        return passportService.insertPassport(passport);
    }
}
