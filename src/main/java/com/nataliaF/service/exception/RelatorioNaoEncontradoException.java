package com.nataliaF.service.exception;

public class RelatorioNaoEncontradoException extends RuntimeException {
	public RelatorioNaoEncontradoException(Integer id) {
		super("Consulta não encontrado. ID = " + id);
	}
}