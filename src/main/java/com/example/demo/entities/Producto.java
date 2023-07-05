package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@SequenceGenerator(name = "producto_id_seq", sequenceName = "producto_id_seq", allocationSize = 1)
    private Long id;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "tipo_producto", nullable = false)
	private String tipo_producto;

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

	public String getTipo_producto() {
		return tipo_producto;
	}

	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
}
