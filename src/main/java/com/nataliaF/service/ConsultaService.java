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
	
	public Consulta findById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new ConsultaNaoEncontradoException(id));
	}

	public List<Consulta> todos() {
		return repo.findAll();
	}

	public Consulta save(Consulta entity) {
		return repo.save(entity);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Consulta atualiza(Integer id, Consulta entity) {
		entity.setId(id);
		return repo.save(entity);
	}
}
