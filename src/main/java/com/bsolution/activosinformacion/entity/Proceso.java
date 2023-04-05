package com.bsolution.activosinformacion.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;import jakarta.persistence.OneToMany;

@Entity
public class Proceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="pro_id")
	private int id;
	
	@Column(length = 150)
    private String name;
	
	@Column(length = 250)
	private String objetivo;
	
	@Column(length = 250, nullable=false)
	private String tipo;
	
    @OneToMany(targetEntity=Activo.class, mappedBy="proceso")
    private Set<Activo> activos;

	public Proceso() {
		
	}
    
	public Proceso(int id, String name, String objetivo, String tipo, Set<Activo> activos) {
		super();
		this.id = id;
		this.name = name;
		this.objetivo = objetivo;
		this.tipo = tipo;
		this.activos = activos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Activo> getActivos() {
		return activos;
	}

	public void setActivos(Set<Activo> activos) {
		this.activos = activos;
	}

	@Override
	public String toString() {
		return "Proceso [id=" + id + ", name=" + name + ", objetivo=" + objetivo + ", tipo=" + tipo + ", activos="
				+ activos + "]";
	}

    
}
