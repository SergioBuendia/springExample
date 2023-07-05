package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClienteDAO;
import com.example.demo.entities.Cliente;

@Service
public class ClienteService {

	@Autowired
	public ClienteDAO clienteDAO;
	
	public List<Cliente> findAll(){
		return (List<Cliente>) clienteDAO.findAll();
	}
	
	public void saveCliente(Cliente cliente) {
		clienteDAO.save(cliente);
	}
	
	public void deleteCliente(Cliente cliente) {
		clienteDAO.delete(cliente);
	}
}
