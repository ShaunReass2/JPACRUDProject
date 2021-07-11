package com.skilldistillery.moto.data;

import org.springframework.data.repository.CrudRepository;

import com.skilldistillery.moto.entities.Motorcycle;

public interface MotoDAO extends CrudRepository <Motorcycle, Integer> { 
		
		
}
