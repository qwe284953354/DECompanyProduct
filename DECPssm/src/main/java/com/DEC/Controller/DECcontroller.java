package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.DEC.entity.Travel;
import com.DEC.entity.User;
import com.DEC.service.ITravelService;
import com.DEC.service.IUserService;

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
	
	@RequestMapping(value = "/tologin")
	public String tologin() {
		return "login";
	}
	
	
	@Resource
	private IUserService userService;
	@RequestMapping(value = "/dologin")
	public String dologin(@RequestParam("username") String username,@RequestParam("userpwd") String userpwd,Model model,HttpSession session) {
		User user = userService.findUserByUname(username);
		if(user.getUpwd().equals(userpwd)) {
			session.setAttribute("uname", username);
			return "Redirect:Travelmain";
		}else {
			model.addAttribute("msg", "登陆失败");
			return "loginfail";
		}
		
	}
}
