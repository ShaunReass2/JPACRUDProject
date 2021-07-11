package com.skilldistillery.moto.controllers;

import javax.persistence.Column;

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

	@RequestMapping(path= {"", ""})
	public String addMotorcycleById(String name, String make, String model, int year, String market, String fuelType, ) {
		model.addAttribute("motorcycle", dao.findById(1)); //debug
		return "index"; 
		@RequestMapping(path= {"", ""})
		
	public String addMotorcycle(String name, String make, String model, int year, String market, String fuelType, ) {
			model.addAttribute("motorcycle", dao.findById(1)); //debug
			return "index"; 
			@RequestMapping(path= {"", ""})
			
	public String addMotorcycle(String name, String make, String model, int year, String market, String fuelType, ) {
				model.addAttribute("motorcycle", dao.findById(1)); //debug
				return "index"; 
				
	@RequestMapping(path= {"", ""})
	public String addMotorcycle(String name, String make, String model, int year, String market, String fuelType, ) {
					model.addAttribute("motorcycle", dao.findById(1)); //debug
					return "index"; 
	
	}
}

//\private int id; 
//
//@Column(name="name")
//private String name;
//
//@Column(name="make")
//private String make;
//
//@Column(name="model")
//private String model;
//
//@Column(name="year")
//private int year;
//
//@Column(name="market")
//private String market;
//
//@Column(name="fuel_type")
//private String fuelType;
//
//@Column(name="fuel_tank_capacity_in_gallons")
//private Double fuelTankCapacityInGallons;
//
//@Column(name="miles_per_gallon")
//private Double milesPerGallon;
//
//@Column(name="range_in_miles")
//private int rangeInMiles;
//
//@Column(name="weight_in_pounds_wet")
//private int weightInPoundsWet;
//
//@Column(name="pannier_capable")
//private boolean pannierCapable;
//
//@Column(name="price_new_in_us_dollars")
//private Double priceNewInUsDollars;
//
//@Column(name="description")
//private String description;
