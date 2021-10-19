package com.example.CRUD.OneToOneRelationship.service;

import com.example.CRUD.OneToOneRelationship.entity.Passport;
import com.example.CRUD.OneToOneRelationship.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService {
    @Autowired
    PassportRepository passportRepository;

    public List<Passport> insertPassport(Passport passport) {
        passportRepository.save(passport);

        return passportRepository.findAll();
    }
}
