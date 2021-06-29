package com.nataliaF.service.exception;

public class ExameNaoEncontradoException extends RuntimeException {
	public ExameNaoEncontradoException(Integer id) {
		super("Exame não encontrado. ID = " + id);
	}
}