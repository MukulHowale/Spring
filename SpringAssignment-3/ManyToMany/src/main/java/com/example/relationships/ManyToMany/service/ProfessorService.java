package com.example.relationships.ManyToMany.service;

import com.example.relationships.ManyToMany.entiry.Professor;
import com.example.relationships.ManyToMany.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Professor getProfessorById(Long professorId) {

        return professorRepository.findById(professorId).get();
    }
}
