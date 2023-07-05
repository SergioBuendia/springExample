package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DetallePlanEntregaDAO;
import com.example.demo.dao.PlanEntregaDAO;
import com.example.demo.entities.PlanEntrega;

@Service
public class PlanEntregaService {

	@Autowired
	public PlanEntregaDAO planEstregaDAO;
	
	@Autowired
	public DetallePlanEntregaDAO detallePlanEntregaDAO;
	
	public List<PlanEntrega> findAll(){
		return (List<PlanEntrega>) planEstregaDAO.findAll();
	}
	
	public void savePlanEntrega(PlanEntrega planEntrega){
		
		planEstregaDAO.save(planEntrega);
	}
	
	public void deletePlanEntrega(PlanEntrega planEntrega){
		planEstregaDAO.delete(planEntrega);
	}
}
