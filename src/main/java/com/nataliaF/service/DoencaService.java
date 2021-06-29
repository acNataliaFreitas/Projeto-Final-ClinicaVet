package com.nataliaF.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nataliaF.domain.Doenca;
import com.nataliaF.repository.DoencaRepository;
import com.nataliaF.service.exception.DoencaNaoEncontradoException;

public class DoencaService {
	@RestController
	@RequestMapping("/doenca")
	public class ExameService {
		@Autowired
		DoencaRepository repo;

		public Doenca findById(Integer id) {
			return repo.findById(id).orElseThrow(() -> new DoencaNaoEncontradoException(id));
		}

		public List<Doenca> todos() {
			return repo.findAll();
		}

		public Doenca save(Doenca entity) {
			return repo.save(entity);
		}

		public void delete(Integer id) {
			repo.deleteById(id);
		}

		public Doenca atualiza(Integer id, Doenca entity) {
			entity.setId(id);
			return repo.save(entity);
		}
	}
}
