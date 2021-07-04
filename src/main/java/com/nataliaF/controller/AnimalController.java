package com.nataliaF.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Animal;
import com.nataliaF.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	@Autowired
	private AnimalService service;

	@GetMapping("{/id}")
	public Animal animal(@PathVariable Integer id) {
		return service.AnimalfindById(id);
	}

	@GetMapping
	public List<Animal> animais() {
		return service.AnimalAll();
	}

	@PostMapping
	public ResponseEntity<String> newAnimal(@Valid @RequestBody Animal entity) {
		service.AnimalSave(entity);
		return ResponseEntity.ok("Animal cadastrado com sucesso."); 
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.Animaldelete(id);
	}

	@PutMapping("/{id}")
	public Animal atualiza(@PathVariable Integer id, @RequestBody Animal entity) {
		return service.AnimalUpdate(id, entity);
	}
}