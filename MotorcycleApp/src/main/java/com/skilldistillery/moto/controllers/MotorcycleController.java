package com.skilldistillery.moto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.moto.data.MotoDAO;

@Controller
public class MotorcycleController {

	@Autowired
	private MotoDAO dao; 
	
	@RequestMapping(path= {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("motorcycle", dao.findById(1)); //debug
		return "index"; 
	}
}
