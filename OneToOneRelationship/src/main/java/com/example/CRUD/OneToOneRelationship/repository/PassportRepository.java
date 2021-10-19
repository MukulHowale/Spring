package com.example.CRUD.OneToOneRelationship.repository;

import com.example.CRUD.OneToOneRelationship.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PassportRepository extends JpaRepository<Passport, Long> {

}
