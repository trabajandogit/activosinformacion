package com.bsolution.activosinformacion.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Activo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="act_id")
	private int id;
	
	@Column(length = 150, nullable=false)
    private String name;

	@Column(length = 150, nullable=false)
    private String ubicacion;
	
	@Column(length = 150, nullable=false)
    private String tipoproceso;
	
    @ManyToOne
    @JoinColumn(name="pro_id", nullable=false)
    private Proceso proceso;

	@Column(length = 150)
    private String procedimiento;
	
	@Column(length = 150)
    private String grupo;

	@Column(length = 250, nullable=false)
    private String descripcion;	
	
	@Column (nullable=false)
    private Date actualizado;
		
	@Column(length = 100,nullable=false)
    private String propietario;	
		
	@Column(length = 100,nullable=false)
    private String idioma;
		
	@OneToMany(mappedBy="activo")
	private Set<RetencionDocumental> retenciondocumental; 
	
	@OneToMany(mappedBy="activo")
	private Set<ValoracionActivo> valoracionactivo;

	@OneToMany(mappedBy="activo")
	private Set<LeyTransparencia> leytransparencia;
	
	public Activo() {
	}

	public Activo(int id, String name, String ubicacion, String tipoproceso, Proceso proceso, String procedimiento,
			String grupo, String descripcion, Date actualizado, String propietario, String idioma,
			Set<RetencionDocumental> retenciondocumental, Set<ValoracionActivo> valoracionactivo,
			Set<LeyTransparencia> leytransparencia) {
		super();
		this.id = id;
		this.name = name;
		this.ubicacion = ubicacion;
		this.tipoproceso = tipoproceso;
		this.proceso = proceso;
		this.procedimiento = procedimiento;
		this.grupo = grupo;
		this.descripcion = descripcion;
		this.actualizado = actualizado;
		this.propietario = propietario;
		this.idioma = idioma;
		this.retenciondocumental = retenciondocumental;
		this.valoracionactivo = valoracionactivo;
		this.leytransparencia = leytransparencia;
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoproceso() {
		return tipoproceso;
	}

	public void setTipoproceso(String tipoproceso) {
		this.tipoproceso = tipoproceso;
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public String getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Set<RetencionDocumental> getRetenciondocumental() {
		return retenciondocumental;
	}

	public void setRetenciondocumental(Set<RetencionDocumental> retenciondocumental) {
		this.retenciondocumental = retenciondocumental;
	}

	public Set<ValoracionActivo> getValoracionactivo() {
		return valoracionactivo;
	}

	public void setValoracionactivo(Set<ValoracionActivo> valoracionactivo) {
		this.valoracionactivo = valoracionactivo;
	}

	public Set<LeyTransparencia> getLeytransparencia() {
		return leytransparencia;
	}

	public void setLeytransparencia(Set<LeyTransparencia> leytransparencia) {
		this.leytransparencia = leytransparencia;
	}

	@Override
	public String toString() {
		return "Activo [id=" + id + ", name=" + name + ", ubicacion=" + ubicacion + ", tipoproceso=" + tipoproceso
				+ ", proceso=" + proceso + ", procedimiento=" + procedimiento + ", grupo=" + grupo + ", descripcion="
				+ descripcion + ", actualizado=" + actualizado + ", propietario=" + propietario + ", idioma=" + idioma
				+ ", retenciondocumental=" + retenciondocumental + ", valoracionactivo=" + valoracionactivo
				+ ", leytransparencia=" + leytransparencia + "]";
	}
	
}
