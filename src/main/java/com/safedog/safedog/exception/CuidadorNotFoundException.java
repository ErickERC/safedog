package com.safedog.safedog.exception;

public class CuidadorNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	// Método constructor va a recibir un parámetro para poder evaluar y lanzar la Excepción
	public CuidadorNotFoundException(Long id) {
		super("El cuidador con el Id: " + id + " no existe." );
	}
}
