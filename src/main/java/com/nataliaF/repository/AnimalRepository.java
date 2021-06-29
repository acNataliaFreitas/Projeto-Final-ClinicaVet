package com.nataliaF.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nataliaF.domain.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Integer>{

}
