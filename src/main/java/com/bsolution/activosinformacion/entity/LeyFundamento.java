package com.bsolution.activosinformacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="leyfundamento")
public class LeyFundamento {
	@Id
	@Column(name="fun_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 250,nullable=false)
	private String fundamento;
	
	@Column (length = 250,nullable=false)
	private String descripcion;

	@Column (length = 20,nullable=false)
	private String clasificacion;

	@Column (length = 20,nullable=false)
	private String plazo;

	public LeyFundamento() {
	}

	public LeyFundamento(int id, String fundamento, String descripcion, String clasificacion, String plazo) {
		super();
		this.id = id;
		this.fundamento = fundamento;
		this.descripcion = descripcion;
		this.clasificacion = clasificacion;
		this.plazo = plazo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFundamento() {
		return fundamento;
	}

	public void setFundamento(String fundamento) {
		this.fundamento = fundamento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getPlazo() {
		return plazo;
	}

	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}

	@Override
	public String toString() {
		return "LeyFundamento [id=" + id + ", fundamento=" + fundamento + ", descripcion=" + descripcion
				+ ", clasificacion=" + clasificacion + ", plazo=" + plazo + "]";
	}

}
