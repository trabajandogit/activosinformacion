package com.bsolution.activosinformacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RetencionDocumental {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ret_id")
	private int id;
	
	@Column (length=10, nullable=false)
	private String codigo;
	
	@Column (length=10, nullable=false) 
	private String serie;
	
	@Column  (length=10, nullable=false)
	private String subserie;
	
    @ManyToOne
    @JoinColumn(name="act_id", nullable=false)
    private Activo activo;
    
	public RetencionDocumental() {
		
	}
    
	public RetencionDocumental(int id, String codigo, String serie, String subserie, Activo activo) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.serie = serie;
		this.subserie = subserie;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSubserie() {
		return subserie;
	}

	public void setSubserie(String subserie) {
		this.subserie = subserie;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "RetencionDocumental [id=" + id + ", codigo=" + codigo + ", serie=" + serie + ", subserie=" + subserie
				+ ", activo=" + activo + "]";
	}
    
}
