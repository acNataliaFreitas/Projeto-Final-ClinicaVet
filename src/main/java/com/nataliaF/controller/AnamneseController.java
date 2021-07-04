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

import com.nataliaF.domain.Anamnese;
import com.nataliaF.service.AnamneseService;

@RestController
@RequestMapping("/anamnese")
public class AnamneseController {
	@Autowired
	AnamneseService service;
	
	@GetMapping("{/id}")
	public Anamnese anamnese(@PathVariable Integer id) {
		return service.AnamnesefindById(id);
	}

	@GetMapping
	public List<Anamnese> animais() {
		return service.AnamneseAll();
	}

	@PostMapping
	public ResponseEntity<String> newAnamnese(@Valid @RequestBody Anamnese entity) {
		service.AnamneseSave(entity);
		return ResponseEntity.ok("Anamese cadastrada com sucesso."); 
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.AnamneseDelete(id);
	}

	@PutMapping("/{id}")
	public Anamnese atualiza(@PathVariable Integer id, @RequestBody Anamnese entity) {
		return service.AnamneseUpdate(id, entity);
	}

}
