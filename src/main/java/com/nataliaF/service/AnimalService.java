package com.nataliaF.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Animal;
import com.nataliaF.repository.AnimalRepository;
import com.nataliaF.service.exception.AnimalNaoEncontradoException;



@RestController
@RequestMapping("/animal")
public class AnimalService {
	@Autowired
	 private AnimalRepository repo;
	
	public Animal AnimalfindById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new AnimalNaoEncontradoException(id));
	}

	public List<Animal> AnimalAll() {
		return repo.findAll();
	}

	public Animal AnimalSave(Animal entity) {
		return repo.save(entity);
	}

	public void Animaldelete(Integer id) {
		repo.deleteById(id);
	}

	public Animal AnimalUpdate(Integer id, Animal entity) {
		entity.setId(id);
		return repo.save(entity);
	}
	
	ResponseEntity<String> addUser(@Valid @RequestBody Animal animal) {
		return ResponseEntity.ok("Animal cadastrado com sucesso");
	}
}
