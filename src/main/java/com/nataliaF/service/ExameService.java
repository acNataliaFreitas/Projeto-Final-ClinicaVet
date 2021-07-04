package com.nataliaF.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Exame;
import com.nataliaF.repository.ExameRepository;
import com.nataliaF.service.exception.ExameNaoEncontradoException;

@RestController
@RequestMapping("/exame")
public class ExameService {
	@Autowired
	 ExameRepository repo;
	
	public Exame ExamefindById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new ExameNaoEncontradoException(id));
	}

	public List<Exame> ExameAll() {
		return repo.findAll();
	}

	public Exame ExameSave(Exame entity) {
		return repo.save(entity);
	}

	public void ExameDelete(Integer id) {
		repo.deleteById(id);
	}

	public Exame ExameUpdate(Integer id, Exame entity) {
		entity.setId(id);
		return repo.save(entity);
	}

}
