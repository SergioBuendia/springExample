package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "camiones")
public class Camion {

	@Id
	@SequenceGenerator(name = "camiones_id_seq", sequenceName = "camiones_id_seq", allocationSize = 1)
	private Long id;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "placa", nullable = false)
	private String placa;
	
	@Column(name = "anio", nullable = false)
	private int anio;
	
	@Column(name = "estado", nullable = false)
	private String estado;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
