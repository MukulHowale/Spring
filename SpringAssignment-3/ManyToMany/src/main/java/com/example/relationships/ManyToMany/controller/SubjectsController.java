package com.example.relationships.ManyToMany.controller;

import com.example.relationships.ManyToMany.entiry.Professor;
import com.example.relationships.ManyToMany.entiry.Subjects;
import com.example.relationships.ManyToMany.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectsController {

    @Autowired
    SubjectsService subjectsService;

    @GetMapping("/subjects")
    public List<Subjects> getAllSubjects(){
        return subjectsService.getAllSubjects();
    }

    @GetMapping("/subject/{id}")
    public Object getSubjectById(@PathVariable("id") Long subjectId){
        return subjectsService.getSubjectById(subjectId);
    }
}
