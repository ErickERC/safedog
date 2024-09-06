package com.safedog.safedog.model;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Preguntas_Cerradas")
public class PreguntaCerrada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta_cerrada")
	private Integer idPreguntaCerrada;
	@Column(name = "auto", nullable = false)
	private String auto;
	@Column(name = "reserva", nullable = false)
	private String reserva;
	@Column(name = "activo", nullable = false)
	private String activo;
	@Column(name = "comunicacion", nullable = false)
	private String comunicacion;
	@Column(name = "cachorro", nullable = false)
	private String cachorro;
	@Column(name = "hembra", nullable = false)
	private String hembra;
	@Column(name = "tercera_edad", nullable = false)
	private String terceraEdad;
	@Column(name = "medicamento", nullable = false)
	private String medicamento;
	
	public PreguntaCerrada() {}

	public PreguntaCerrada(Integer idPreguntaCerrada, String auto, String reserva, String activo, String comunicacion,
			String cachorro, String hembra, String terceraEdad, String medicamento) {
		this.idPreguntaCerrada = idPreguntaCerrada;
		this.auto = auto;
		this.reserva = reserva;
		this.activo = activo;
		this.comunicacion = comunicacion;
		this.cachorro = cachorro;
		this.hembra = hembra;
		this.terceraEdad = terceraEdad;
		this.medicamento = medicamento;
	}

	public Integer getIdPreguntaCerrada() {
		return idPreguntaCerrada;
	}

	public void setIdPreguntaCerrada(Integer idPreguntaCerrada) {
		this.idPreguntaCerrada = idPreguntaCerrada;
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getReserva() {
		return reserva;
	}

	public void setReserva(String reserva) {
		this.reserva = reserva;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getComunicacion() {
		return comunicacion;
	}

	public void setComunicacion(String comunicacion) {
		this.comunicacion = comunicacion;
	}

	public String getCachorro() {
		return cachorro;
	}

	public void setCachorro(String cachorro) {
		this.cachorro = cachorro;
	}

	public String getHembra() {
		return hembra;
	}

	public void setHembra(String hembra) {
		this.hembra = hembra;
	}

	public String getTerceraEdad() {
		return terceraEdad;
	}

	public void setTerceraEdad(String terceraEdad) {
		this.terceraEdad = terceraEdad;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public String toString() {
		return "PreguntaCerrada [idPreguntaCerrada=" + idPreguntaCerrada + ", auto=" + auto + ", reserva=" + reserva
				+ ", activo=" + activo + ", comunicacion=" + comunicacion + ", cachorro=" + cachorro + ", hembra="
				+ hembra + ", terceraEdad=" + terceraEdad + ", medicamento=" + medicamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, auto, cachorro, comunicacion, hembra, idPreguntaCerrada, medicamento, reserva,
				terceraEdad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreguntaCerrada other = (PreguntaCerrada) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(auto, other.auto)
				&& Objects.equals(cachorro, other.cachorro) && Objects.equals(comunicacion, other.comunicacion)
				&& Objects.equals(hembra, other.hembra) && Objects.equals(idPreguntaCerrada, other.idPreguntaCerrada)
				&& Objects.equals(medicamento, other.medicamento) && Objects.equals(reserva, other.reserva)
				&& Objects.equals(terceraEdad, other.terceraEdad);
	}
	
	

}
