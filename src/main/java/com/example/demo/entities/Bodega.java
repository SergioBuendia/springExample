package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "bodega")
public class Bodega implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id", nullable = false)
	@SequenceGenerator(name = "bodega_id_seq", sequenceName = "bodega_id_seq", allocationSize = 1)
    private Long id;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;	
    
    @Column(name = "direccion", nullable = false)
    private String direccion;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    
}