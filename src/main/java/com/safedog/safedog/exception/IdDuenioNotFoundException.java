package com.safedog.safedog.exception;

public class IdDuenioNotFoundException extends RuntimeException {
	private static final long serialVersionUID=1L;
	
	public IdDuenioNotFoundException (Long idDuenio) {
		super("El dueño con el Id: "+ idDuenio + " no existe");
	}
}
