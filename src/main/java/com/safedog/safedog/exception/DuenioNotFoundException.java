package com.safedog.safedog.exception;

public class DuenioNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DuenioNotFoundException(String correo){
	     super("El dueño con el correo: " + correo + "no existe.");
	}

}
