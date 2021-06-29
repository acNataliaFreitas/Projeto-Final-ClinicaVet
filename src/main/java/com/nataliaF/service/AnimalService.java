package com.nataliaF.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public Animal findById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new AnimalNaoEncontradoException(id));
	}

	public List<Animal> todos() {
		return repo.findAll();
	}

	public Animal save(Animal entity) {
		return repo.save(entity);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Animal atualiza(Integer id, Animal entity) {
		entity.setId(id);
		return repo.save(entity);
	}
}
