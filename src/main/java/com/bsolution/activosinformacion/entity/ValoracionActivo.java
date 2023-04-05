package com.bsolution.activosinformacion.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ValoracionActivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="val_id")
	private int id;
	
	@Column (length=5, nullable=false)
	private String confidencialidad;
	
	@Column (length=5, nullable=false)
	private String integridad;
	
	@Column (length=5, nullable=false)
	private String disponibilidad;
	
	@Column (length=200, nullable=false)
	private String observaciones;
	
	@Column (length=100, nullable=false)
	private String usuario;
	
	@Column (nullable=false)
	private Date actualizacion;
	
	@ManyToOne
	@JoinColumn(name="act_id", nullable=false)
	private Activo activo;
	
	public ValoracionActivo() {
		
	}
	
	public ValoracionActivo(int id, String confidencialidad, String integridad, String disponibilidad,
			String observaciones, String usuario, Date actualizacion, Activo activo) {
		super();
		this.id = id;
		this.confidencialidad = confidencialidad;
		this.integridad = integridad;
		this.disponibilidad = disponibilidad;
		this.observaciones = observaciones;
		this.usuario = usuario;
		this.actualizacion = actualizacion;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConfidencialidad() {
		return confidencialidad;
	}

	public void setConfidencialidad(String confidencialidad) {
		this.confidencialidad = confidencialidad;
	}

	public String getIntegridad() {
		return integridad;
	}

	public void setIntegridad(String integridad) {
		this.integridad = integridad;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(Date actualizacion) {
		this.actualizacion = actualizacion;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "ValoracionActivo [id=" + id + ", confidencialidad=" + confidencialidad + ", integridad=" + integridad
				+ ", disponibilidad=" + disponibilidad + ", observaciones=" + observaciones + ", usuario=" + usuario
				+ ", actualizacion=" + actualizacion + ", activo=" + activo + "]";
	}
	
}
