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

import com.nataliaF.domain.Exame;
import com.nataliaF.service.ExameService;

@RestController
@RequestMapping("/exame")
public class ExameController {
	@Autowired
	ExameService service;
	
	@GetMapping("{/id}")
	public Exame anamnese(@PathVariable Integer id) {
		return service.ExamefindById(id);
	}

	@GetMapping
	public List<Exame> animais() {
		return service.ExameAll();
	}

	@PostMapping
	public ResponseEntity<String> newDoenca(@Valid @RequestBody Exame entity) {
		service.ExameSave(entity);
		return ResponseEntity.ok("Exame cadastrado com sucesso.");
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.ExameDelete(id);
	}

	@PutMapping("/{id}")
	public Exame atualiza(@PathVariable Integer id, @RequestBody Exame entity) {
		return service.ExameUpdate(id, entity);
	}

}
