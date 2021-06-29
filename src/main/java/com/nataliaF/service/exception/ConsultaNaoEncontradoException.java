package com.nataliaF.service.exception;

public class ConsultaNaoEncontradoException extends RuntimeException {
	public ConsultaNaoEncontradoException(Integer id) {
		super("Consulta não encontrado. ID = " + id);
	}
}