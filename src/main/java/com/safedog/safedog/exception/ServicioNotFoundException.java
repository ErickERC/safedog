package com.safedog.safedog.exception;

public class ServicioNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ServicioNotFoundException(Long id) {
		super("El servicio con el Id: " + id + " no existe." );
	}
}
