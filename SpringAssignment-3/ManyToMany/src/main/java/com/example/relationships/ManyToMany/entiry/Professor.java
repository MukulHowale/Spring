package com.example.relationships.ManyToMany.entiry;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Professor {

    @Id
    Long professorId;
    String professorName;
    String professorAge;
    String professorAddress;


    @JoinTable(name = "Professor_Subjects",
            joinColumns = @JoinColumn(name = "Professor_Id"),
            inverseJoinColumns = @JoinColumn(name = "Subjects_Id"))
    @JsonManagedReference
    @ManyToMany
    List<Subjects> subjects = new ArrayList<>();

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects.add(subjects);
    }
}
