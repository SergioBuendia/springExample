package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductoDAO;
import com.example.demo.entities.Producto;

@Service
public class ProductoService {
	
	@Autowired
	public ProductoDAO productoDAO;
	
	public List<Producto> findAll(){
		return (List<Producto>) productoDAO.findAll();
	}
	
	public void saveProducto(Producto producto){
		productoDAO.save(producto);
	}
	
	public void deleteProducto(Producto producto){
		productoDAO.delete(producto);
	}
}
