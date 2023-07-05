package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CamionDAO;
import com.example.demo.entities.Camion;

@Service
public class CamionService {
	
	@Autowired
	public CamionDAO camionDAO;
	
	public List<Camion> findAll(){
		return (List<Camion>) camionDAO.findAll();
	}
	
	public void saveCamion(Camion camion) {
		camionDAO.save(camion);
	}
	
	public void deleteCamion(Camion camion) {
		camionDAO.delete(camion);
	}
}
