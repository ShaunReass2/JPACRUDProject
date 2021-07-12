package com.skilldistillery.moto.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.moto.data.MotoDAO;
import com.skilldistillery.moto.entities.Motorcycle;

@Controller
public class MotorcycleController {

	@Autowired
	private MotoDAO dao;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		model.addAttribute("motorcycle", dao.findById(2));
		return "index";
	}

	@RequestMapping(path = { "/updateMotorcycle", "home.do" })
	public String view(Model model) {
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		Motorcycle m = dao.findById(id).get();
		model.addAttribute("motorcycle", m);
		return "updateMotorcycle";
	}

	@RequestMapping(path = { "/deleteMotorcycle", "home.do" })
	public String deleteMotorcycle(Model model) {
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		dao.deleteById(id);

		// model.addAttribute("motorcycle", moto.get());
		return "index";
	}

	@RequestMapping(path = { "/listAllMotorcycles", "home.do" })
	public String listAll(Model model) {
		Iterable<Motorcycle>list = dao.findAll();
		model.addAttribute("motorcycle", list);
		return "listAllMotorcycles";
	}

	@RequestMapping(path = { "/createMotorcycle", "home.do" })
	public String createMotorcycle(Model model) {

		Motorcycle m = new Motorcycle();
		m.setId(0);
		model.addAttribute("motorcycle", m);
		return "updateMotorcycle";
	}

	@RequestMapping(path= {"/updateMotorcycle", "home.do"}, method = RequestMethod.POST )
	public String updateMotorcycle(Model model) {
		Motorcycle m = populate();
		
		dao.save(m);
		return "index";		
	}

	private Motorcycle populate() {
		try {
			Motorcycle m = new Motorcycle();
			m.setDescription(request.getParameter("description"));
			m.setFuelTankCapacityInGallons(Double.parseDouble(request.getParameter("fuelTankCapacityInGallons")));

			// request.getParameter("description")
			m.setFuelType(request.getParameter("fuelType"));
			m.setId(Integer.parseInt(request.getParameter("id")));

			m.setMake(request.getParameter("make"));
			m.setModel(request.getParameter("model"));
			m.setMarket(request.getParameter("market"));
			m.setMilesPerGallon(Double.parseDouble(request.getParameter("milesPerGallon")));
			m.setName(request.getParameter("name"));
			String p = request.getParameter("pannierCapable");
			
			m.setPannierCapable(p.equals("true")?1:0);
			m.setPriceNewInUsDollars(Double.parseDouble(request.getParameter("priceNewInUsDollars")));
			int r =parseInt(request.getParameter("rangeInMiles"),0);
			m.setRangeInMiles(r);
			int w =parseInt(request.getParameter("weightInPoundsWet"),0);
			m.setWeightInPoundsWet(w);
			m.setYear(Integer.parseInt(request.getParameter("year")));

			return m;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		}

	}
	private int parseInt (String val, int alt)
	{
		try {
			return Integer.parseInt(val);
		}catch (Exception e) {
			return alt;
		}
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
