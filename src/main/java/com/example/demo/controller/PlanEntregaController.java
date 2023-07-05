package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PlanEntrega;
import com.example.demo.services.PlanEntregaService;

@RestController
@RequestMapping("/api/planEntrega")
public class PlanEntregaController {

	@Autowired
	public PlanEntregaService planEntregaService;
	
	@GetMapping("/all")
	public List<PlanEntrega> findAll(){
		return planEntregaService.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<PlanEntrega> savePlanEntrega(@RequestBody PlanEntrega planEntregra){
		planEntregaService.savePlanEntrega(planEntregra);
		return ResponseEntity.ok(planEntregra);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<PlanEntrega> deletePlanEntrega(@RequestBody PlanEntrega planEntregra){
		planEntregaService.deletePlanEntrega(planEntregra);
		return ResponseEntity.ok(planEntregra);
	}
}
