package com.skilldistillery.moto.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.moto.data.MotoDAO;
import com.skilldistillery.moto.entities.Motorcycle;

@Controller
public class MotorcycleController {

	@Autowired
	private MotoDAO dao;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping(path= {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("motorcycle", dao.findById(2)); 
		return "index"; 
	}
	@RequestMapping(path= {"/view", "home.do"})
	public String view(Model model) {
		String sid = request.getParameter("id");
		int id =Integer.parseInt(sid);
		 Optional <Motorcycle> moto =dao.findById(id);
		
		model.addAttribute("motorcycle", moto.get()); 
		return "edit"; 
	}
	@RequestMapping(path= {"/list", "home.do"})
	public String listAll(Model model) {
		model.addAttribute("motorcycle", dao.findAll()); 
		return "list"; 
	}
//	@RequestMapping(path= {"/", ""})
//	public Optional findById(Integer id) {
//	
//	}
//	
//	@RequestMapping(path= {"/", ""})
//	public boolean existsById(Integer id) {
//	
//	}
//
//	@RequestMapping(path= {"/", ""})
//	public Iterable <Motorcycle> findAll() {
//	
//	}	
//	
//	@RequestMapping(path= {"/", ""})
//	public Iterable<Motorcycle> findAllById(Iterable<Integer> ids) {
//	
//	}	
//	
//	@RequestMapping(path= {"/", ""})
//	public long count() {
//	
//	}	
//	
//	@RequestMapping(path= {"/", ""})
//	public void deleteById(Integer id) {
//	
//	}	
//	
//	@RequestMapping(path= {"/", ""})
//	public void delete(Motorcycle entity) {
//	
//	}
//	
//	@RequestMapping(path= {"/", ""})
//	public void deleteAllById(Iterable<? extends Integer> ids) {
//	
//	}
//	
//	@RequestMapping(path= {"/", ""})
//	public void deleteAll(Iterable<? extends Motorcycle> motos) {
//	
//	}
//	
//	@RequestMapping(path= {"/", ""})
//	public void deleteAll() {
//	
//	}
	
//	@RequestMapping(path= {"/", ""})
//	public <S extends Motorcycle> S save(S entity) {
//	
//	}
//	
//	@RequestMapping(path= {"/", ""})
//	public <S extends Motorcycle> Iterable<S> saveAll(Iterable<S> entities) {
//	
//	}
	
}

