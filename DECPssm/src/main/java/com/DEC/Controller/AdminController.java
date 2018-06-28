package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
 * <p>Description: 后台控制层</p>
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
		List<TravelScenic> tslist = travelScenicService.findAllScenic();
		model.addAttribute("tslist", tslist);
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
	
	@RequestMapping(value = "/Adminhotel/add")
	public String toAddHotel(@ModelAttribute("hotel") Hotel hotel) {
		if(hotelService.addHotel(hotel)) {
			return "redirect:/Admin/Adminhotel";
		}else {
			return "";
		}
	}
	@RequestMapping(value = "/Adminhotel/del")
	public String toDelHotel(@RequestParam("hid") int hid) {
		if(hotelService.delHotel(hid)) {
			return "redirect:/Admin/Adminhotel";
		}else {
			return "";
		}
	}
	@RequestMapping(value = "/Adminhotel/edit")
	public String toEditHotel(@ModelAttribute("hotel") Hotel hotel) {
		if(hotelService.editHotel(hotel)) {
			return "redirect:/Admin/Adminhotel";
		}else {
			return "";
		}
	}

	
	@RequestMapping(value = "/Adminhorder/del")
	public String toDelHotelOrder(@RequestParam("hoid") int hoid) {
		if(hotelOrderService.delHotelOrder(hoid)) {
			return "redirect:/Admin/Adminhorder";
		}else {
			return "";
		}
	}
	
	@RequestMapping(value = "/Adminscenic/add")
	public String toAddScenic(@ModelAttribute("scenic") TravelScenic scenic) {
		if(travelScenicService.addTravelScenic(scenic)) {
			return "redirect:/Admin/Adminscenic";
		}else {
			return "";
		}
	}
	@RequestMapping(value = "/Adminscenic/del")
	public String toDelScenic(@RequestParam("tsid") int tsid) {
		if(travelScenicService.delTravelScenic(tsid)) {
			return "redirect:/Admin/Adminscenic";
		}else {
			return "";
		}
	}
	
	@RequestMapping(value = "/Admintorder/del")
	public String toDelTravelOrder(@RequestParam("toid") int toid) {
		if(travelOrderService.delTravelOrder(toid)) {
			return "redirect:/Admin/Admintorder";
		}else {
			return "";
		}
	}
	
	@RequestMapping(value = "/Admintravel/add")
	public String toAddTravel(@ModelAttribute("travel") Travel travel) {
		if(travelService.addTravel(travel)) {
			return "redirect:/Admin/Admintravel";
		}else {
			return "";
		}
	}
	@RequestMapping(value = "/Admintravel/del")
	public String toDelTravel(@RequestParam("tid") int tid) {
		if(travelService.delTravel(tid)) {
			return "redirect:/Admin/Admintravel";
		}else {
			return "";
		}
	}
	
	@RequestMapping(value = "/Adminuser/add")
	public String toAddUser(@ModelAttribute("user") User user) {
		if(userService.addUser(user)) {
			return "redirect:/Admin/Adminuser";
		}else {
			return "";
		}
	}
	@RequestMapping(value = "/Adminuser/del")
	public String toDelUser(@RequestParam("uid") int uid) {
		if(userService.delUser(uid)) {
			return "redirect:/Admin/Adminuser";
		}else {
			return "";
		}
	}
	
	@RequestMapping(value="/Adminhotel/find")
	@ResponseBody
	public Object getHotelByHid(@RequestParam int hid) {
		return hotelService.findHotelByHid(hid);
	}
	
	
}
