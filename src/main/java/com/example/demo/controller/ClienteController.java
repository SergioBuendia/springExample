package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cliente;
import com.example.demo.services.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	public ClienteService clienteService;
	
	@GetMapping("/all")
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
		clienteService.saveCliente(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Cliente> deleteCliente(@RequestBody Cliente cliente){
		clienteService.deleteCliente(cliente);
		return ResponseEntity.ok(cliente);
	}
}
