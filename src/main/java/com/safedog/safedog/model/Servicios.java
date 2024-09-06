package com.safedog.safedog.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Servicios")
public class Servicios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer idServicio;
	@Column(name = "paseo", nullable = false)
	private String paseo;
	@Column(name = "paseo_tarifa", nullable = false)
	private Integer paseoTarifa;
	@Column(name = "hospedaje", nullable = false)
	private String hospedaje;
	@Column(name = "hospedaje_tarifa", nullable = false)
	private Integer hospedajeTarifa;
	@Column(name = "guarderia", nullable = false)
	private String guarderia;
	@Column(name = "guarderia_tarifa", nullable = false)
	private Integer guarderiaTarifa;
	@Column(name = "baño", nullable = false)
	private String baño;
	@Column(name = "baño_tarifa", nullable = false)
	private Integer bañoTarifa;

	public Servicios() {
	}

	public Servicios(Integer idServicio, String paseo, Integer paseoTarifa, String hospedaje, Integer hospedajeTarifa,
			String guarderia, Integer guarderiaTarifa, String baño, Integer bañoTarifa) {
		super();
		this.idServicio = idServicio;
		this.paseo = paseo;
		this.paseoTarifa = paseoTarifa;
		this.hospedaje = hospedaje;
		this.hospedajeTarifa = hospedajeTarifa;
		this.guarderia = guarderia;
		this.guarderiaTarifa = guarderiaTarifa;
		this.baño = baño;
		this.bañoTarifa = bañoTarifa;
	}

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicios(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public String getPaseo() {
		return paseo;
	}

	public void setPaseo(String paseo) {
		this.paseo = paseo;
	}

	public Integer getPaseoTarifa() {
		return paseoTarifa;
	}

	public void setPaseoTarifa(Integer paseoTarifa) {
		this.paseoTarifa = paseoTarifa;
	}

	public String getHospedaje() {
		return hospedaje;
	}

	public void setHospedaje(String hospedaje) {
		this.hospedaje = hospedaje;
	}

	public Integer getHospedajeTarifa() {
		return hospedajeTarifa;
	}

	public void setHospedajeTarifa(Integer hospedajeTarifa) {
		this.hospedajeTarifa = hospedajeTarifa;
	}

	public String getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(String guarderia) {
		this.guarderia = guarderia;
	}

	public Integer getGuarderiaTarifa() {
		return guarderiaTarifa;
	}

	public void setGuarderiaTarifa(Integer guarderiaTarifa) {
		this.guarderiaTarifa = guarderiaTarifa;
	}

	public String getBaño() {
		return baño;
	}

	public void setBaño(String baño) {
		this.baño = baño;
	}

	public Integer getBañoTarifa() {
		return bañoTarifa;
	}

	public void setBañoTarifa(Integer bañoTarifa) {
		this.bañoTarifa = bañoTarifa;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	@Override
	public String toString() {
		return "Servicios [idServicio=" + idServicio + ", paseo=" + paseo + ", paseoTarifa=" + paseoTarifa
				+ ", hospedaje=" + hospedaje + ", hospedajeTarifa=" + hospedajeTarifa + ", guarderia=" + guarderia
				+ ", guarderiaTarifa=" + guarderiaTarifa + ", baño=" + baño + ", bañoTarifa=" + bañoTarifa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(baño, bañoTarifa, guarderia, guarderiaTarifa, hospedaje, hospedajeTarifa, idServicio, paseo,
				paseoTarifa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servicios other = (Servicios) obj;
		return Objects.equals(baño, other.baño) && Objects.equals(bañoTarifa, other.bañoTarifa)
				&& Objects.equals(guarderia, other.guarderia) && Objects.equals(guarderiaTarifa, other.guarderiaTarifa)
				&& Objects.equals(hospedaje, other.hospedaje) && Objects.equals(hospedajeTarifa, other.hospedajeTarifa)
				&& Objects.equals(idServicio, other.idServicio) && Objects.equals(paseo, other.paseo)
				&& Objects.equals(paseoTarifa, other.paseoTarifa);
	}
}
