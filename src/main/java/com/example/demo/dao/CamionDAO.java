package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Camion;

public interface CamionDAO extends CrudRepository<Camion, Long> {

}
