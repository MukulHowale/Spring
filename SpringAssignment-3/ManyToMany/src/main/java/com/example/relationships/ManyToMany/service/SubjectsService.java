package com.example.relationships.ManyToMany.service;

import com.example.relationships.ManyToMany.entiry.Subjects;
import com.example.relationships.ManyToMany.repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsService {

    @Autowired
    SubjectsRepository subjectsRepository;

    public List<Subjects> getAllSubjects() {
        return subjectsRepository.findAll();
    }
}
