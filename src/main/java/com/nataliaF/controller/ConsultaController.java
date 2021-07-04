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

import com.nataliaF.domain.Consulta;
import com.nataliaF.service.ConsultaService;


@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	@Autowired
	 ConsultaService service;
	
	@GetMapping("{/id}")
	public Consulta anamnese(@PathVariable Integer id) {
		return service.ConsultafindById(id);
	}

	@GetMapping
	public List<Consulta> animais() {
		return service.ConsultaAll();
	}

	@PostMapping
	public ResponseEntity<String> newConsulta(@Valid @RequestBody Consulta entity) {
		service.ConsultaSave(entity);
		return ResponseEntity.ok("Consulta cadastrada com sucesso.");
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.AnimalDelete(id);
	}

	@PutMapping("/{id}")
	public Consulta atualiza(@PathVariable Integer id, @RequestBody Consulta entity) {
		return service.AnimalUpdate(id, entity);
	}

}
