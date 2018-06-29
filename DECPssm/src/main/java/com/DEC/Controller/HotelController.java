package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DEC.entity.Hotel;
import com.DEC.entity.HotelRoom;
import com.DEC.service.IHotelRoomService;
import com.DEC.service.IHotelService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月29日 
 *
 */

@Controller
@RequestMapping("/Hotel")
public class HotelController {
	
	@Resource
	private IHotelService hotelService;
	@RequestMapping(value = "/showHotel")
	public String toShowHotel(Model model) {
		List<Hotel> hlist = hotelService.findAllHotel();
		model.addAttribute("hlist",hlist);
		return "Hotel";
	}
	
	@RequestMapping(value = "/showHotel/{type}", method = RequestMethod.GET)
	public String toShowHotelType(@PathVariable("type") String type, Model model) {
		List<Hotel> hlist = hotelService.findHotelByType(type);
		model.addAttribute("hlist", hlist);
		return "Hotel";
	}
	//跳转登录页面
	@RequestMapping(value = "/login")
	public String tologin() {
		return "login";
	}
	
	@Resource
	private IHotelRoomService hotelRoomService;
	@RequestMapping(value = "/detail")
	public String toDetail(@RequestParam("hid") int hid, Model model) {
		Hotel hotel = hotelService.findHotelByHid(hid);
		model.addAttribute("hotel", hotel);
		List<HotelRoom> hrlist = hotelRoomService.findHotelRoomByhid(hid);
		model.addAttribute("hrlist", hrlist);
		return "Hoteldetail";
	}
}
