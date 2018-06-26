package com.DEC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月26日 
 *
 */
@Controller
@RequestMapping("/Admin")
public class AdminController {
	
	@RequestMapping(value = "/Adminuser")
	public String toUser() {
		return "Adminuser";
	}
	
	@RequestMapping(value = "/Admintravel")
	public String toTravel() {
		return "Admintravel";
	}
	
	@RequestMapping(value = "/Adminscenic")
	public String toScenic() {
		return "Adminscenic";
	}
	
	@RequestMapping(value = "/Adminhotel")
	public String toHotel() {
		return "Adminhotel";
	}
	
	@RequestMapping(value = "/Admintorder")
	public String toTravelOrder() {
		return "Admintorder";
	}
	
	@RequestMapping(value = "/Adminhorder")
	public String toHotelOrder() {
		return "Adminhorder";
	}
}
