package com.example.osorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.osorio.model.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Long> {

}
