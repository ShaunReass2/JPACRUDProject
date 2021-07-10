package com.skilldistillery.moto.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.moto.entities.Motorcycle;

@Service
@Transactional
public class MotorcycleDAOImpl implements MotoDAO {
		
	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public Motorcycle findById(int id) {
			
		return em.find(Motorcycle.class, id); 
	}
}
