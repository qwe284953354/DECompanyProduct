package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DEC.entity.Hotel;
import com.DEC.entity.HotelOrder;
import com.DEC.entity.Travel;
import com.DEC.entity.TravelOrder;
import com.DEC.entity.TravelScenic;
import com.DEC.entity.User;
import com.DEC.service.IHotelOrderService;
import com.DEC.service.IHotelService;
import com.DEC.service.ITravelOrderService;
import com.DEC.service.ITravelScenicService;
import com.DEC.service.ITravelService;
import com.DEC.service.IUserService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月26日 
 *
 */
@Controller
@RequestMapping("/Admin")
public class AdminController {
	
	@Resource
	private IUserService userService;
	@RequestMapping(value = "/Adminuser")
	public String toUser(Model model) {
		List<User> ulist = userService.findAllNormalUser();
		model.addAttribute("ulist", ulist);
		return "Adminuser";
	}
	
	@Resource
	private ITravelService travelService;
	@RequestMapping(value = "/Admintravel")
	public String toTravel(Model model) {
		List<Travel> tlist = travelService.findAllTravel();
		model.addAttribute("tlist", tlist);
		return "Admintravel";
	}
	
	@Resource
	private ITravelScenicService travelScenicService;
	@RequestMapping(value = "/Adminscenic")
	public String toScenic(Model model) {
		List<TravelScenic> tclist = travelScenicService.findAllScenic();
		model.addAttribute("tclist", tclist);
		return "Adminscenic";
	}
	
	@Resource
	private IHotelService hotelService;
	@RequestMapping(value = "/Adminhotel")
	public String toHotel(Model model) {
		List<Hotel> hlist = hotelService.findAllHotel();
		model.addAttribute("hlist", hlist);
		return "Adminhotel";
	}
	
	@Resource
	private ITravelOrderService travelOrderService;
	@RequestMapping(value = "/Admintorder")
	public String toTravelOrder(Model model) {
		List<TravelOrder> tolist = travelOrderService.findAllTravelOrder();
		model.addAttribute("tolist", tolist);
		return "Admintorder";
	}
	
	@Resource
	private IHotelOrderService hotelOrderService;
	@RequestMapping(value = "/Adminhorder")
	public String toHotelOrder(Model model) {
		List<HotelOrder> holist = hotelOrderService.findAllHotelOrder();
		model.addAttribute("holist", holist);
		return "Adminhorder";
	}
}
