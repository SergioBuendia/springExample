package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "plan_entrega")
public class PlanEntrega {

	@Id
	@SequenceGenerator(name = "plan_entrega_id_seq", sequenceName = "plan_entrega_id_seq", allocationSize = 1)
	private Long id;
	
	@JsonFormat(timezone = "America/El_Salvador", pattern = "dd-MM-yyyy")
	@Column(name = "fecha_registro", nullable = true)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date fecha_registro;
	
	@JsonFormat(timezone = "America/El_Salvador", pattern = "dd-MM-yyyy")
	@Column(name = "fecha_entrega", nullable = true)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date fecha_entrega;
	
	@Column(name = "numero_guia", nullable = false)
	private String numero_guia;
	
	
	@Column(name = "comentarios", nullable = false)
	private String comentarios;
	
	@Column(name = "placa_vehiculo", nullable = false)
	private String placa_vehiculo;
	

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_cliente", referencedColumnName = "id", nullable = false)
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_bodega", referencedColumnName = "id", nullable = false)
	private Bodega bodega;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_camion", referencedColumnName = "id", nullable = false)
	private Camion camion;
	
	
	
	@OneToMany(mappedBy = "id_plan_entrega",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetallePlanEntrega> detallePlanEntrega;
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<DetallePlanEntrega> getDetallePlanEntrega() {
		return detallePlanEntrega;
	}

	public void setDetallePlanEntrega(List<DetallePlanEntrega> detallePlanEntrega) {
		this.detallePlanEntrega = detallePlanEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public String getNumero_guia() {
		return numero_guia;
	}

	public void setNumero_guia(String numero_guia) {
		this.numero_guia = numero_guia;
	}

	public Camion getCamion() {
		return camion;
	}

	public void setCamion(Camion camion) {
		this.camion = camion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getPlaca_vehiculo() {
		return placa_vehiculo;
	}

	public void setPlaca_vehiculo(String placa_vehiculo) {
		this.placa_vehiculo = placa_vehiculo;
	}
}
