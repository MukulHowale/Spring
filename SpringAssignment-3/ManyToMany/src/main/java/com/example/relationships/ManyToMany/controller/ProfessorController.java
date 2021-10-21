package com.example.relationships.ManyToMany.controller;

import com.example.relationships.ManyToMany.entiry.Professor;
import com.example.relationships.ManyToMany.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @GetMapping("/professors")
    public List<Professor> getAllProfessors(){
        return professorService.getAllProfessors();
    }
    @GetMapping("/professor/{id}")
    public Professor getProfessorById(@PathVariable("id") Long professorId){
        return professorService.getProfessorById(professorId);
    }
}
