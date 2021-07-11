package com.skilldistillery.moto.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorcycleTest {

	private static EntityManagerFactory emf; 
	private EntityManager em; 
	private Motorcycle motorcycle; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("MotoPU"); 
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager(); 
		motorcycle = em.find(Motorcycle.class, 1); 
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		motorcycle = null; 
	}

	@Test
	void test_Motorcycle_entitiy_mapping() {
		assertNotNull(motorcycle); 
		assertEquals("Elsa", motorcycle.getName()); 
		assertEquals("BMW", motorcycle.getMake()); 
		assertEquals("R1200GSA", motorcycle.getModel()); 
		assertEquals(2012, motorcycle.getYear()); 
		assertEquals("Adventure", motorcycle.getMarket()); 
		assertEquals("AKI 91", motorcycle.getFuelType()); 
		assertEquals(8.7, motorcycle.getFuelTankCapacityInGallons()); 
		assertEquals(40.0, motorcycle.getMilesPerGallon()); 
		assertEquals(348, motorcycle.getRangeInMiles()); 
		assertEquals(565, motorcycle.getWeightInPoundsWet()); 
		assertEquals(true, motorcycle.getPannierCapable()); 
		assertEquals(23500.00, motorcycle.getPriceNewInUsDollars()); 
		assertEquals("Hey", motorcycle.getDescription()); 
	}

}
