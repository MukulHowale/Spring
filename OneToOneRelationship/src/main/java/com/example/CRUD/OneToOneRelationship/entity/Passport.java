package com.example.CRUD.OneToOneRelationship.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Passport {

    @Id
    Long passportId;
    String passportNumber;


    @JsonIgnore
    @OneToOne(mappedBy = "passport")
    Student student;
}
