package com.safedog.safedog.dto;

public class CuidadorCardDTO {
	private Integer idCuidador;
    private String nombre;
    private String ciudad;
    private String presentacion;
    private String urlFotoPerfil;
    
    
	public CuidadorCardDTO(Integer idCuidador, String nombre, String ciudad, String presentacion,
			String urlFotoPerfil) {
		super();
		this.idCuidador = idCuidador;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.presentacion = presentacion;
		this.urlFotoPerfil = urlFotoPerfil;
	}


	public Integer getIdCuidador() {
		return idCuidador;
	}


	public void setIdCuidador(Integer idCuidador) {
		this.idCuidador = idCuidador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPresentacion() {
		return presentacion;
	}


	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}


	public String getUrlFotoPerfil() {
		return urlFotoPerfil;
	}


	public void setUrlFotoPerfil(String urlFotoPerfil) {
		this.urlFotoPerfil = urlFotoPerfil;
	}

	@Override
	public String toString() {
		return "CuidadorCardDTO [idCuidador=" + idCuidador + ", nombre=" + nombre + ", ciudad=" + ciudad
				+ ", presentacion=" + presentacion + ", urlFotoPerfil=" + urlFotoPerfil + "]";
	}
	 
}
