package com.example.relationships.ManyToMany.service;

import com.example.relationships.ManyToMany.entiry.Subjects;
import com.example.relationships.ManyToMany.message.Message;
import com.example.relationships.ManyToMany.repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectsService {

    @Autowired
    SubjectsRepository subjectsRepository;

    public List<Subjects> getAllSubjects() {
        return subjectsRepository.findAll();
    }

    public Object getSubjectById(Long subjectId) {

        Optional<Subjects> subjects = subjectsRepository.findById(subjectId);

        if(subjects.isEmpty()){
            return new Message("Student Id not found");
        }

        return subjects.get();
    }
}
