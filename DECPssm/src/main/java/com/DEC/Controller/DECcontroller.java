package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DEC.entity.Travel;
import com.DEC.entity.User;
import com.DEC.service.ITravelService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月26日 
 *
 */
@Controller
public class DECcontroller {
	
	@Resource
	private ITravelService travelService;
	@RequestMapping(value = "/showAllTravel")
	public String ShowAllTravel(Model model,HttpSession session) {
		List<Travel> tlist = travelService.findAllTravel();
		session.setAttribute("uname", null);
		model.addAttribute("tlist", tlist);
		return "Travelmain";
	}
	
}
