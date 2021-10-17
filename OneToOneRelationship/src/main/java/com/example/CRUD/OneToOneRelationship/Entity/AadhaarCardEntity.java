package com.example.CRUD.OneToOneRelationship.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AadhaarCardEntity {

    @Id
    Long aadhaarID;
    Long aadhaarNumber;
}
