package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Bodega;

public interface BodegaDAO extends CrudRepository<Bodega, Long> {

}
