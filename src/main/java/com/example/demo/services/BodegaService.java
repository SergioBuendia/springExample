package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BodegaDAO;
import com.example.demo.entities.Bodega;

@Service
public class BodegaService {
	
	@Autowired
	public BodegaDAO bodegaDAO;
	
	public List<Bodega> findAll(){
		return (List<Bodega>) bodegaDAO.findAll();
	}
	
	public void saveBodega(Bodega bodega) {
		bodegaDAO.save(bodega);
	}
	
	public void deleteBodega(Bodega bodega) {
		bodegaDAO.delete(bodega);
	}
}
