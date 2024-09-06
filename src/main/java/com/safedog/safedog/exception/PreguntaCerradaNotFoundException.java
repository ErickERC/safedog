package com.safedog.safedog.exception;

public class PreguntaCerradaNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PreguntaCerradaNotFoundException(Long id) {
		super("El conjunto de preguntas cerradas con el Id: " + id + " no existe." );
	}
}
