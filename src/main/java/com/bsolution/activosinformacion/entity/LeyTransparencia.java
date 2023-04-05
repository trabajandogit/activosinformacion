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
public class LeyTransparencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_ley")
	private int id;

	@Column (length=100,nullable=false)
	private String tipoactivo;
	
	@Column(length = 250, nullable=false)
    private String quienlousa;	
	
	@Column(length = 100,nullable=false)
    private String custodio;	
	
	@Column(length = 100,nullable=false)
    private String mediodeconservacion;	
	
	@Column(length = 100,nullable=false)
    private String formatovisualizacion;	

	@Column(length = 10,nullable=false)
    private String informacionpublicada;	

	@Column(length = 100,nullable=false)
    private Date fechaprimerageneracion;	
	
	@Column(length = 100,nullable=false)
    private String responsableproduccion;	

	@Column(length = 100)
    private String responsablepublicacion;
	
	@Column(length = 250)
    private String condicionExepcion;
	
	@Column(length = 250)
    private String fundamentolegal;
	
	@Column(length = 10)
    private String reservatotal;

	@Column(nullable=false)
	private Date fechacalificacion;

	@Column(length = 100,nullable=false)
    private String frecuenciageneracion;	

	@Column(length = 250,nullable=false)
    private String lugaresconsulta;	

	@Column(length = 250,nullable=false)
    private String detallesconsulta;	
	
	@Column(nullable=false)
    private boolean datosabiertos;	

	@Column(nullable=false)
	private Date modificado;
	
	@ManyToOne
	@JoinColumn(name="act_id", nullable=false)
	private Activo activo;
	
	public LeyTransparencia() {
		
	}
	
	public LeyTransparencia(int id, String tipoactivo, String quienlousa, String custodio, String mediodeconservacion,
			String formatovisualizacion, String informacionpublicada, Date fechaprimerageneracion,
			String responsableproduccion, String responsablepublicacion, String condicionExepcion,
			String fundamentolegal, String reservatotal, Date fechacalificacion, String frecuenciageneracion,
			String lugaresconsulta, String detallesconsulta, boolean datosabiertos, Date modificado, Activo activo) {
		super();
		this.id = id;
		this.tipoactivo = tipoactivo;
		this.quienlousa = quienlousa;
		this.custodio = custodio;
		this.mediodeconservacion = mediodeconservacion;
		this.formatovisualizacion = formatovisualizacion;
		this.informacionpublicada = informacionpublicada;
		this.fechaprimerageneracion = fechaprimerageneracion;
		this.responsableproduccion = responsableproduccion;
		this.responsablepublicacion = responsablepublicacion;
		this.condicionExepcion = condicionExepcion;
		this.fundamentolegal = fundamentolegal;
		this.reservatotal = reservatotal;
		this.fechacalificacion = fechacalificacion;
		this.frecuenciageneracion = frecuenciageneracion;
		this.lugaresconsulta = lugaresconsulta;
		this.detallesconsulta = detallesconsulta;
		this.datosabiertos = datosabiertos;
		this.modificado = modificado;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoactivo() {
		return tipoactivo;
	}

	public void setTipoactivo(String tipoactivo) {
		this.tipoactivo = tipoactivo;
	}

	public String getQuienlousa() {
		return quienlousa;
	}

	public void setQuienlousa(String quienlousa) {
		this.quienlousa = quienlousa;
	}

	public String getCustodio() {
		return custodio;
	}

	public void setCustodio(String custodio) {
		this.custodio = custodio;
	}

	public String getMediodeconservacion() {
		return mediodeconservacion;
	}

	public void setMediodeconservacion(String mediodeconservacion) {
		this.mediodeconservacion = mediodeconservacion;
	}

	public String getFormatovisualizacion() {
		return formatovisualizacion;
	}

	public void setFormatovisualizacion(String formatovisualizacion) {
		this.formatovisualizacion = formatovisualizacion;
	}

	public String getInformacionpublicada() {
		return informacionpublicada;
	}

	public void setInformacionpublicada(String informacionpublicada) {
		this.informacionpublicada = informacionpublicada;
	}

	public Date getFechaprimerageneracion() {
		return fechaprimerageneracion;
	}

	public void setFechaprimerageneracion(Date fechaprimerageneracion) {
		this.fechaprimerageneracion = fechaprimerageneracion;
	}

	public String getResponsableproduccion() {
		return responsableproduccion;
	}

	public void setResponsableproduccion(String responsableproduccion) {
		this.responsableproduccion = responsableproduccion;
	}

	public String getResponsablepublicacion() {
		return responsablepublicacion;
	}

	public void setResponsablepublicacion(String responsablepublicacion) {
		this.responsablepublicacion = responsablepublicacion;
	}

	public String getCondicionExepcion() {
		return condicionExepcion;
	}

	public void setCondicionExepcion(String condicionExepcion) {
		this.condicionExepcion = condicionExepcion;
	}

	public String getFundamentolegal() {
		return fundamentolegal;
	}

	public void setFundamentolegal(String fundamentolegal) {
		this.fundamentolegal = fundamentolegal;
	}

	public String getReservatotal() {
		return reservatotal;
	}

	public void setReservatotal(String reservatotal) {
		this.reservatotal = reservatotal;
	}

	public Date getFechacalificacion() {
		return fechacalificacion;
	}

	public void setFechacalificacion(Date fechacalificacion) {
		this.fechacalificacion = fechacalificacion;
	}

	public String getFrecuenciageneracion() {
		return frecuenciageneracion;
	}

	public void setFrecuenciageneracion(String frecuenciageneracion) {
		this.frecuenciageneracion = frecuenciageneracion;
	}

	public String getLugaresconsulta() {
		return lugaresconsulta;
	}

	public void setLugaresconsulta(String lugaresconsulta) {
		this.lugaresconsulta = lugaresconsulta;
	}

	public String getDetallesconsulta() {
		return detallesconsulta;
	}

	public void setDetallesconsulta(String detallesconsulta) {
		this.detallesconsulta = detallesconsulta;
	}

	public boolean isDatosabiertos() {
		return datosabiertos;
	}

	public void setDatosabiertos(boolean datosabiertos) {
		this.datosabiertos = datosabiertos;
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
		return "LeyTransparencia [id=" + id + ", tipoactivo=" + tipoactivo + ", quienlousa=" + quienlousa
				+ ", custodio=" + custodio + ", mediodeconservacion=" + mediodeconservacion + ", formatovisualizacion="
				+ formatovisualizacion + ", informacionpublicada=" + informacionpublicada + ", fechaprimerageneracion="
				+ fechaprimerageneracion + ", responsableproduccion=" + responsableproduccion
				+ ", responsablepublicacion=" + responsablepublicacion + ", condicionExepcion=" + condicionExepcion
				+ ", fundamentolegal=" + fundamentolegal + ", reservatotal=" + reservatotal + ", fechacalificacion="
				+ fechacalificacion + ", frecuenciageneracion=" + frecuenciageneracion + ", lugaresconsulta="
				+ lugaresconsulta + ", detallesconsulta=" + detallesconsulta + ", datosabiertos=" + datosabiertos
				+ ", modificado=" + modificado + ", activo=" + activo + "]";
	}
	
	
}
