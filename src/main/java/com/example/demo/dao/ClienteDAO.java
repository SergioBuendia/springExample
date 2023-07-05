package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {

}
