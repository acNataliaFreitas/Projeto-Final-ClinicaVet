package com.nataliaF.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Anamnese;
import com.nataliaF.repository.AnamneseRepository;
import com.nataliaF.service.exception.RelatorioNaoEncontradoException;

@RestController
@RequestMapping("/anamnese")
public class AnamneseService {
	@Autowired
	AnamneseRepository repo;

	public Anamnese findById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new RelatorioNaoEncontradoException(id));
	}

	public List<Anamnese> todos() {
		return repo.findAll();
	}

	public Anamnese save(Anamnese entity) {
		return repo.save(entity);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Anamnese atualiza(Integer id, Anamnese entity) {
		entity.setId(id);
		return repo.save(entity);
	}
	
	
}
