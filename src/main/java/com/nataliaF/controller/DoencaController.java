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

import com.nataliaF.domain.Doenca;
import com.nataliaF.service.DoencaService;

@RestController
@RequestMapping("/doenca")
public class DoencaController {
	
	@Autowired
	DoencaService service;
	
	@GetMapping
	public Doenca doenca(@PathVariable Integer id) {
		return service.DoencafindById(id);	
	}
	
	@GetMapping
	public List<Doenca> doenca(){
		return service.DoencaAll();
	}
	
	@PostMapping
	public ResponseEntity<String> newDoenca(@Valid @RequestBody Doenca entity) {
		service.DoencaSave(entity);
		return ResponseEntity.ok("Doença cadastrada com sucesso.");
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.DoencaDelete(id);
	}
	
	@PutMapping("/{id}")
	public Doenca update(@PathVariable Integer id, @RequestBody Doenca entity) {
		return service.DoencaUpdate(id, entity);
	}
}
