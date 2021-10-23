package com.example.relationships.ManyToMany.controller;

import com.example.relationships.ManyToMany.entiry.Professor;
import com.example.relationships.ManyToMany.entiry.Subjects;
import com.example.relationships.ManyToMany.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Object getProfessorById(@PathVariable("id") Long professorId){
        return professorService.getProfessorById(professorId);
    }

    @GetMapping("/professor/{id}/subject/{s_id}")
    public Object assignSubjectToProfessor(@PathVariable("id") Long professorId,
                                              @PathVariable("s_id") Long subjectId){
        return professorService.assignSubjectToProfessor(professorId,subjectId);
    }

    @PostMapping("/professor/{id}/subject")
    public Object addSubjectAndAssignProfessor(@PathVariable("id") Long professorId,
                                               @RequestBody Subjects subjects){
        return professorService.addSubjectAndAssignProfessor(professorId, subjects);
    }
}
