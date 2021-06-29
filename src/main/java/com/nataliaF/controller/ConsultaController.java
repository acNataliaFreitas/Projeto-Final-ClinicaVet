package com.nataliaF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		return service.findById(id);
	}

	@GetMapping
	public List<Consulta> animais() {
		return service.todos();
	}

	@PostMapping
	public Consulta novo(@RequestBody Consulta entity) {
		return service.save(entity);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

	@PutMapping("/{id}")
	public Consulta atualiza(@PathVariable Integer id, @RequestBody Consulta entity) {
		return service.atualiza(id, entity);
	}

}
