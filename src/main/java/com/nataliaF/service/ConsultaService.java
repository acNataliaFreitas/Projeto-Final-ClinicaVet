package com.nataliaF.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Consulta;
import com.nataliaF.repository.ConsultaRepository;
import com.nataliaF.service.exception.ConsultaNaoEncontradoException;


@RestController
@RequestMapping("/consulta")
public class ConsultaService {
	@Autowired
	 ConsultaRepository repo;
	
	public Consulta ConsultafindById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new ConsultaNaoEncontradoException(id));
	}

	public List<Consulta> ConsultaAll() {
		return repo.findAll();
	}

	public Consulta ConsultaSave(Consulta entity) {
		return repo.save(entity);
	}

	public void AnimalDelete(Integer id) {
		repo.deleteById(id);
	}

	public Consulta AnimalUpdate(Integer id, Consulta entity) {
		entity.setId(id);
		return repo.save(entity);
	}
}
