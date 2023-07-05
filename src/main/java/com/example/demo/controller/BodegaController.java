package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Bodega;
import com.example.demo.services.BodegaService;

@RestController
@RequestMapping("/api/bodega")
public class BodegaController {

	@Autowired
	public BodegaService bodegaService;
	
	@GetMapping("/all")
	public List<Bodega> findAll(){
		return bodegaService.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Bodega> saveBodega(@RequestBody Bodega bodega){
		bodegaService.saveBodega(bodega);
		return ResponseEntity.ok(bodega);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Bodega> updateBodega(@RequestBody Bodega bodega){
		bodegaService.saveBodega(bodega);
		return ResponseEntity.ok(bodega);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Bodega> deleteBodega(@RequestBody Bodega bodega){
		bodegaService.deleteBodega(bodega);
		return ResponseEntity.ok(bodega);
	}
}
