package com.skilldistillery.moto.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.skilldistillery.moto.entities.Motorcycle;

@Primary
@Service
@Transactional
public class MotorcycleDAOImpl implements MotoDAO {
		
	@PersistenceContext
	private EntityManager em; 
	
	
	public MotorcycleDAOImpl() {
		
	}

	@Override
	public Optional <Motorcycle> findById(Integer id) {
		Motorcycle moto = em.find(Motorcycle.class, id); 
		Optional <Motorcycle> opt = Optional.of(moto);  
		return opt; 
	}

	@Override
	public boolean existsById(Integer id) {
		Motorcycle moto = em.find(Motorcycle.class, id); 
		return moto != null;
	}

	@Override
	public Iterable <Motorcycle> findAll() {
		try {
		Query moto = em.createQuery("SELECT m FROM Motorcycle m"); 
		return moto.getResultList();
		}catch (Exception e) {
			System.out.println (e);
		}
		return null;
	//	return em
	}

	@Override
	public Iterable<Motorcycle> findAllById(Iterable<Integer> ids) {
		List <Motorcycle> motos = new ArrayList(); 
		for (Integer id : ids) {
			Optional <Motorcycle> opt = findById(id); 
			if (opt.isPresent()) {
				motos.add(opt.get());
			}
		}
		return motos;
	}

	@Override
	public long count() {
		List <Motorcycle> motos	= (List<Motorcycle>) findAll(); 	
		return motos.size();
	}

	@Override
	public void deleteById(Integer id) {
		em.remove(findById(id).get());
	}

	@Override
	public void delete(Motorcycle entity) {
		em.remove(entity);	
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		for (Integer id : ids) {
			deleteById(id); 
		}
	}

	@Override
	public void deleteAll(Iterable<? extends Motorcycle> motos) {
		for (Motorcycle moto : motos) {
			delete(moto); 
		}
	}

	@Override
	public void deleteAll() {
		for (Motorcycle moto : findAll()) {
			delete(moto); 
		}		
	}
	
	@Override
	public <S extends Motorcycle> S save(S entity) {
		try {
			//em.getTransaction().begin();
			if (entity.getId()==0)
			{
				em.persist(entity);
			}else {
				em.merge(entity);
			}
		
			//em.getTransaction().commit();
		}catch (Exception e)
		{
			System.err.println (e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public <S extends Motorcycle> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}
	
}
