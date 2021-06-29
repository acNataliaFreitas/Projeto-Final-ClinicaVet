package com.nataliaF.service.exception;

public class DoencaNaoEncontradoException extends RuntimeException {
	public DoencaNaoEncontradoException(Integer id) {
		super("Doenca não encontrado e/ou nao listada. ID = " + id);
	}
}
