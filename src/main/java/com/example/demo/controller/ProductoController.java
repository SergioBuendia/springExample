package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductoDAO;
import com.example.demo.entities.Camion;
import com.example.demo.entities.Producto;
import com.example.demo.services.CamionService;
import com.example.demo.services.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	@Autowired
	public ProductoService productoService;
	
	@GetMapping("/all")
	public List<Producto> findAll(){
		return productoService.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
		productoService.saveProducto(producto);
		return ResponseEntity.ok(producto);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto){
		productoService.saveProducto(producto);
		return ResponseEntity.ok(producto);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Producto> deleteProducto(@RequestBody Producto producto){
		productoService.deleteProducto(producto);
		return ResponseEntity.ok(producto);
	}
}
