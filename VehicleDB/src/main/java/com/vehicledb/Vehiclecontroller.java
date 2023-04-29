package com.vehicledb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

 
@Controller
public class Vehiclecontroller {
	@Autowired
	VehicleRepo repo;
	
	@RequestMapping("home")
	String display1()
	{
		System.out.println(repo.VeihcleAfterTwenty());
		return "index.jsp";
	}
	
	@RequestMapping("addVehicle")
	String display2(Vehicle v) {
		repo.save(v);
		return "index.jsp";
	}
	
	@RequestMapping("getById")
	String display3(int vid,HttpSession s) {
		Vehicle v=repo.findById(vid).orElse(null);
		s.setAttribute("value1", v);
		return "index.jsp";
		}
	
	
	@RequestMapping("getByColor")
	String display4(String vcolor,HttpSession s) {
		List <Vehicle> vehicle =repo.findByVcolor(vcolor);
		s.setAttribute("value2", vehicle);
		return "index.jsp";
		
	
			
		}
	}
	
 
