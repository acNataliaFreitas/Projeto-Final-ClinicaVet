package com.nataliaF.service.exception;

public class AnimalNaoEncontradoException extends RuntimeException {
	public AnimalNaoEncontradoException(Integer id) {
		super("Animal não encontrado. ID = " + id);
	}
}
