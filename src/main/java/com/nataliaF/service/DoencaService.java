package com.nataliaF.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Doenca;
import com.nataliaF.repository.DoencaRepository;
import com.nataliaF.service.exception.DoencaNaoEncontradoException;

@RestController
@RequestMapping("/doenca")
public class DoencaService {
	
	@Autowired
	DoencaRepository repo;
	
	public Doenca DoencafindById(Integer id) {
		return repo.findById(id).
				orElseThrow(() -> new DoencaNaoEncontradoException(id));
	}
	
	public List<Doenca> DoencaAll(){
		return repo.findAll();
	}
	
	public Doenca DoencaSave(Doenca entity) {
		return repo.save(entity);
	}
	
	public void DoencaDelete(Integer id) {
		repo.deleteById(id);
	}
	
	public Doenca DoencaUpdate(Integer id, Doenca entity) {
		entity.setId(id);
		return repo.save(entity);
	}
}
