package com.safedog.safedog.dto;

import java.sql.Date;

public class CuidadorDTO {
	private Integer idCuidador;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String ciudad;
	private Date fechaNacimiento;
	private String urlFotoTrabajo;
	private String urlIne;
	private String urlFotoPerfil;
	private String presentacion;
	private String experiencia;
	private String urlCertificacion;
	private String urlCartaPresentacion;
	private String urlReferencia;
	private String especificacion;
	private Long contactoEmergencia;
	private Long servicio;
	private Long preguntaCerrada;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getUrlFotoTrabajo() {
		return urlFotoTrabajo;
	}
	public void setUrlFotoTrabajo(String urlFotoTrabajo) {
		this.urlFotoTrabajo = urlFotoTrabajo;
	}
	public String getUrlIne() {
		return urlIne;
	}
	public void setUrlIne(String urlIne) {
		this.urlIne = urlIne;
	}
	public String getUrlFotoPerfil() {
		return urlFotoPerfil;
	}
	public void setUrlFotoPerfil(String urlFotoPerfil) {
		this.urlFotoPerfil = urlFotoPerfil;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getUrlCertificacion() {
		return urlCertificacion;
	}
	public void setUrlCertificacion(String urlCertificacion) {
		this.urlCertificacion = urlCertificacion;
	}
	public String getUrlCartaPresentacion() {
		return urlCartaPresentacion;
	}
	public void setUrlCartaPresentacion(String urlCartaPresentacion) {
		this.urlCartaPresentacion = urlCartaPresentacion;
	}
	public String getUrlReferencia() {
		return urlReferencia;
	}
	
	public void setUrlReferencia(String urlReferencia) {
		this.urlReferencia = urlReferencia;
	}
	
	public String getEspecificacion() {
		return especificacion;
	}
	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}
	public Long getContactoEmergencia() {
		return contactoEmergencia;
	}
	
	public void setContactoEmergencia(Long contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}
	
	public Long getServicio() {
		return servicio;
	}
	
	public void setServicio(Long servicio) {
		this.servicio = servicio;
	}
	
	public Long getPreguntaCerrada() {
		return preguntaCerrada;
	}
	
	public void setPreguntaCerrada(Long preguntaCerrada) {
		this.preguntaCerrada = preguntaCerrada;
	}
	
	@Override
	public String toString() {
		return "CuidadorDTO [idCuidador=" + idCuidador + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
				+ correo + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento + ", urlFotoTrabajo="
				+ urlFotoTrabajo + ", urlIne=" + urlIne + ", urlFotoPerfil=" + urlFotoPerfil + ", presentacion="
				+ presentacion + ", experiencia=" + experiencia + ", urlCertificacion=" + urlCertificacion
				+ ", urlCartaPresentacion=" + urlCartaPresentacion + ", urlReferencia=" + urlReferencia
				+ ", especificacion=" + especificacion + ", contactoEmergencia=" + contactoEmergencia + ", servicio="
				+ servicio + ", preguntaCerrada=" + preguntaCerrada + "]";
	}
	
}
