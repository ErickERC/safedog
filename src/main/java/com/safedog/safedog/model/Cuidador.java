package com.safedog.safedog.model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cuidadores")
public class Cuidador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cuidador")
	private Integer idCuidador;
	@Column(name = "nombre", length = 100, nullable = false, unique = false)
	private String nombre;
	@Column(name = "apellido", length = 100, nullable = false, unique = false)
	private String apellido;
	@Column(name = "telefono", length = 12, nullable = false, unique = true)
	private String telefono;
	@Column(name = "correo", length = 100, nullable = false, unique = true)
	private String correo;
	@Column(name = "ciudad", length = 100, nullable = false, unique = false)
	private String ciudad;
	@Column(name = "fecha_nacimiento", nullable = false, unique = false)
	private Date fechaNacimiento;
	@Column(name = "url_foto_trabajo", length = 255, nullable = false, unique = false)
	private String urlFotoTrabajo;
	@Column(name = "url_ine", length = 255, nullable = false, unique = true)
	private String urlIne;
	@Column(name = "url_foto_perfil", length = 255, nullable = false, unique = true)
	private String urlFotoPerfil;
	@Column(name = "presentacion", length = 255, nullable = false, unique = false)
	private String presentacion;
	@Column(name = "experiencia", length = 255, nullable = false, unique = false)
	private String experiencia;
	@Column(name = "url_certificacion", length = 255, nullable = true, unique = false)
	private String urlCertificacion;
	@Column(name = "url_carta_presentacion", length = 255, nullable = true, unique = false)
	private String urlCartaPresentacion;
	@Column(name = "url_referencia", length = 255, nullable = true, unique = false)
	private String urlReferencia;
	@Column(name = "especificacion", length = 255, nullable = false, unique = false)
	private String especificacion;
	
	@OneToOne
    @JoinColumn(name = "Contactos_Emergencia_id_contacto_emergencia")
	private ContactoDeEmergencia contactoEmergencia;
	@OneToOne
	@JoinColumn(name = "Servicios_id_servicio")
	private Servicios servicio;
	@OneToOne
    @JoinColumn(name = "Preguntas_Cerradas_id_pregunta_cerrada")
	private PreguntaCerrada preguntaCerrada;
	
	public Cuidador() {}

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
	
	public ContactoDeEmergencia getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(ContactoDeEmergencia contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}

	public Servicios getServicio() {
		return servicio;
	}

	public void setServicio(Servicios servicio) {
		this.servicio = servicio;
	}

	public PreguntaCerrada getPreguntaCerrada() {
		return preguntaCerrada;
	}

	public void setPreguntaCerrada(PreguntaCerrada preguntaCerrada) {
		this.preguntaCerrada = preguntaCerrada;
	}

	@Override
	public String toString() {
		return "Cuidador [idCuidador=" + idCuidador + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", correo=" + correo + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento
				+ ", urlFotoTrabajo=" + urlFotoTrabajo + ", urlIne=" + urlIne + ", urlFotoPerfil=" + urlFotoPerfil
				+ ", presentacion=" + presentacion + ", experiencia=" + experiencia + ", urlCertificacion="
				+ urlCertificacion + ", urlCartaPresentacion=" + urlCartaPresentacion + ", urlReferencia="
				+ urlReferencia + ", especificacion=" + especificacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, ciudad, correo, especificacion, experiencia,
				fechaNacimiento, idCuidador, nombre, presentacion, telefono,
				urlCartaPresentacion, urlCertificacion, urlFotoPerfil, urlFotoTrabajo, urlIne, urlReferencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuidador other = (Cuidador) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(ciudad, other.ciudad)
				&& Objects.equals(correo, other.correo) && Objects.equals(especificacion, other.especificacion)
				&& Objects.equals(experiencia, other.experiencia)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(idCuidador, other.idCuidador) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(presentacion, other.presentacion)
				&& Objects.equals(telefono, other.telefono)
				&& Objects.equals(urlCartaPresentacion, other.urlCartaPresentacion)
				&& Objects.equals(urlCertificacion, other.urlCertificacion)
				&& Objects.equals(urlFotoPerfil, other.urlFotoPerfil)
				&& Objects.equals(urlFotoTrabajo, other.urlFotoTrabajo) && Objects.equals(urlIne, other.urlIne)
				&& Objects.equals(urlReferencia, other.urlReferencia);
	}
	
}
