package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DEC.entity.Hotel;
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
}
