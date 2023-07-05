package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Camion;
import com.example.demo.services.CamionService;

@RestController
@RequestMapping("/api/camion")
public class CamionController {

	@Autowired
	public CamionService camionService;
	
	@GetMapping("/all")
	public List<Camion> findAll(){
		return camionService.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Camion> saveBodega(@RequestBody Camion camion){
		camionService.saveCamion(camion);
		return ResponseEntity.ok(camion);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Camion> updateBodega(@RequestBody Camion camion){
		camionService.saveCamion(camion);
		return ResponseEntity.ok(camion);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Camion> deleteBodega(@RequestBody Camion camion){
		camionService.deleteCamion(camion);
		return ResponseEntity.ok(camion);
	}
}
