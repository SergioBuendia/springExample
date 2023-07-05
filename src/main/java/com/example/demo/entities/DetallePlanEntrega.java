package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "detalle_plan_entrega")
public class DetallePlanEntrega {
	
	@Id
	@SequenceGenerator(name = "detalle_plan_entrega_id_seq", sequenceName = "detalle_plan_entrega_id_seq", allocationSize = 1)
	private Long id;
	
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "precio_envio", nullable = false, length = 14, precision = 2)
	private double precio_envio;
	
	@Column(name = "precio_descuento", nullable = false, length = 14, precision = 2)
	private double precio_descuento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "id_plan_entrega", referencedColumnName = "id", nullable = false)
	private PlanEntrega id_plan_entrega;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_producto", referencedColumnName = "id", nullable = false)
	private Bodega id_producto;
}
