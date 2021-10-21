package com.example.relationships.ManyToMany.controller;

import com.example.relationships.ManyToMany.entiry.Professor;
import com.example.relationships.ManyToMany.entiry.Subjects;
import com.example.relationships.ManyToMany.service.ProfessorService;
import com.example.relationships.ManyToMany.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectsController {

    @Autowired
    SubjectsService subjectsService;

    @GetMapping("/subjects")
    public List<Subjects> getAllSubjects(){
        return subjectsService.getAllSubjects();
    }
}
