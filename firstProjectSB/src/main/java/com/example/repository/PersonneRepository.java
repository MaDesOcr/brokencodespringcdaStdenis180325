package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Personne;

public class PersonneRepository extends CrudRepository<Personne, Long>{

}
