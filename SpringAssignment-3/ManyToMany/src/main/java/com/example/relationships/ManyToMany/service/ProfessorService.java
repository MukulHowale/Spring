package com.example.relationships.ManyToMany.service;

import com.example.relationships.ManyToMany.entiry.Professor;
import com.example.relationships.ManyToMany.entiry.Subjects;
import com.example.relationships.ManyToMany.message.Message;
import com.example.relationships.ManyToMany.repository.ProfessorRepository;
import com.example.relationships.ManyToMany.repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    SubjectsRepository subjectsRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Object getProfessorById(Long professorId) {

        Optional<Professor> professor = professorRepository.findById(professorId);

        if(professor.isEmpty()){
            return new Message("Professor ID not found");
        }

        return professor.get();
    }


    public Object assignSubjectToProfessor(Long professorId, Long subjectId) {
        Optional<Professor> professor = professorRepository.findById(professorId);

        Optional<Subjects> subjects = subjectsRepository.findById(subjectId);

        if(professor.isEmpty()){
            return new Message("Professor not found");
        }
        else if(subjects.isEmpty()){
            return new Message("Subject not found");
        }

        Professor professor1 = professor.get();
        Subjects subjects1 = subjects.get();

        professor1.setSubjects(subjects1);
        subjects1.setProfessor(professor1);

        professorRepository.save(professor1);
        subjectsRepository.save(subjects1);

        return professor1;
    }

    public Object addSubjectAndAssignProfessor(Long professorId, Subjects subjects) {

        Optional<Professor> professor = professorRepository.findById(professorId);

        if(professor.isEmpty()){
            return new Message("Professor Id not found");
        }

        if(subjectsRepository.findById(subjects.getSubjectId()).isPresent()){
            return new Message("Duplicate Id not allowed");
        }

        subjectsRepository.save(subjects);

        professor.get().setSubjects(subjects);

        professorRepository.save(professor.get());

        return professor;
    }
}
