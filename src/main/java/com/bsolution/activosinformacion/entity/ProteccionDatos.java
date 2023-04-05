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
public class ProteccionDatos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="prd_id")
	private int id;
	
	@Column(nullable=false)
	private boolean personales;
	
	@Column(nullable=false)
	private boolean publicos;

	@Column(nullable=false)
	private boolean privados;
	
	@Column(nullable=false)
	private boolean semiprivados;
	
	@Column(nullable=false)
	private boolean sensibles;
	
	@Column(nullable=false)
	private boolean autorizacion;
	
	@Column(nullable=false)
	private Date modificado;
	
	@ManyToOne
	@JoinColumn(name="act_id", nullable=false)
	private Activo activo;

	public ProteccionDatos() {
		
	}
	
	public ProteccionDatos(int id, boolean personales, boolean publicos, boolean privados, boolean semiprivados,
			boolean sensibles, boolean autorizacion, Date modificado, Activo activo) {
		super();
		this.id = id;
		this.personales = personales;
		this.publicos = publicos;
		this.privados = privados;
		this.semiprivados = semiprivados;
		this.sensibles = sensibles;
		this.autorizacion = autorizacion;
		this.modificado = modificado;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPersonales() {
		return personales;
	}

	public void setPersonales(boolean personales) {
		this.personales = personales;
	}

	public boolean isPublicos() {
		return publicos;
	}

	public void setPublicos(boolean publicos) {
		this.publicos = publicos;
	}

	public boolean isPrivados() {
		return privados;
	}

	public void setPrivados(boolean privados) {
		this.privados = privados;
	}

	public boolean isSemiprivados() {
		return semiprivados;
	}

	public void setSemiprivados(boolean semiprivados) {
		this.semiprivados = semiprivados;
	}

	public boolean isSensibles() {
		return sensibles;
	}

	public void setSensibles(boolean sensibles) {
		this.sensibles = sensibles;
	}

	public boolean isAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(boolean autorizacion) {
		this.autorizacion = autorizacion;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "ProteccionDatos [id=" + id + ", personales=" + personales + ", publicos=" + publicos + ", privados="
				+ privados + ", semiprivados=" + semiprivados + ", sensibles=" + sensibles + ", autorizacion="
				+ autorizacion + ", modificado=" + modificado + ", activo=" + activo + "]";
	}
}
