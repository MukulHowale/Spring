package com.example.relationships.ManyToMany.entiry;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Subjects {

    @Id
    Long subjectId;
    String subjectName;
    String subjectTiming;
    String subjectDuration;
    String subjectRoomNumber;


    @JsonBackReference
    @ManyToMany(mappedBy = "subjects")
    List<Professor> professor = new ArrayList<>();

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor.add(professor);
    }
}
