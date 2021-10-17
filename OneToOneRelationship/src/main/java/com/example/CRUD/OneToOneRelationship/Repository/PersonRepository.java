package com.example.CRUD.OneToOneRelationship.Repository;

import com.example.CRUD.OneToOneRelationship.Entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
