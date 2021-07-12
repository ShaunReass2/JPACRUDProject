package com.skilldistillery.moto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motorcycle")
public class Motorcycle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="year")
	private int year;
	
	@Column(name="market")
	private String market;

	@Column(name="fuel_type")
	private String fuelType;
	
	@Column(name="fuel_tank_capacity_in_gallons")
	private Double fuelTankCapacityInGallons;
	
	@Column(name="miles_per_gallon")
	private Double milesPerGallon;
	
	@Column(name="range_in_miles")
	private int rangeInMiles;
	
	@Column(name="weight_in_pounds_wet")
	private int weightInPoundsWet;
	
	@Column(name="pannier_capable")
	private boolean pannierCapable;
	
	@Column(name="price_new_in_us_dollars")
	private Double priceNewInUsDollars;
	
	@Column(name="description")
	private String description;
	
	
	public Motorcycle() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getMarket() {
		return market;
	}


	public void setMarket(String market) {
		this.market = market;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public Double getFuelTankCapacityInGallons() {
		return fuelTankCapacityInGallons;
	}


	public void setFuelTankCapacityInGallons(Double fuelTankCapacityInGallons) {
		this.fuelTankCapacityInGallons = fuelTankCapacityInGallons;
	}


	public Double getMilesPerGallon() {
		return milesPerGallon;
	}


	public void setMilesPerGallon(Double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}


	public int getRangeInMiles() {
		return rangeInMiles;
	}


	public void setRangeInMiles(int range) {
		try {
			this.rangeInMiles = range;
		}catch (Exception e) {
			this.rangeInMiles=0;
		}
	}


	public int getWeightInPoundsWet() {
		return weightInPoundsWet;
	}


	public void setWeightInPoundsWet(int weightInPoundsWet) {
		this.weightInPoundsWet = weightInPoundsWet;
	}


	public boolean getPannierCapable() {
		return pannierCapable;
	}


	public void setPannierCapable(int pannierCapable) {
		this.pannierCapable = pannierCapable==1;
	}


	public Double getPriceNewInUsDollars() {
		return priceNewInUsDollars;
	}


	public void setPriceNewInUsDollars(Double priceNewInUsDollars) {
		this.priceNewInUsDollars = priceNewInUsDollars;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", name=" + name + ", make=" + make + ", model=" + model + ", year=" + year
				+ ", market=" + market + ", fuelType=" + fuelType + ", fuelTankCapacityInGallons="
				+ fuelTankCapacityInGallons + ", milesPerGallon=" + milesPerGallon + ", rangeInMiles=" + rangeInMiles
				+ ", weightInPoundsWet=" + weightInPoundsWet + ", pannierCapable=" + pannierCapable
				+ ", priceNewInUsDollars=" + priceNewInUsDollars + ", description=" + description + "]";
	}


}
