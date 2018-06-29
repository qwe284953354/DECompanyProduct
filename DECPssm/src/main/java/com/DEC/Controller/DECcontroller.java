package com.DEC.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.DEC.dao.ICityDao;
import com.DEC.entity.Travel;
import com.DEC.entity.User;
import com.DEC.service.ICityService;
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
	
	
	/*
	 *  Travel的controller
	 */
	
	//开始
	//登录前显示所有项目
	@Resource
	private ITravelService travelService;
	@RequestMapping(value = "/showTravel")
	public String ShowTravel(Model model,HttpSession session) {
		List<Travel> tlist = travelService.findAllTravel();
		session.setAttribute("uname", null);
		session.setAttribute("type", null);
		session.setAttribute("city", null);
		model.addAttribute("tlist", tlist);
		return "Travelmain";
	}
	
	//登陆后显示所有项目
	@RequestMapping(value = "/showAllTravel")
	public String ShowAllTravel(Model model,HttpSession session) {
		List<Travel> tlist = travelService.findAllTravel();
		model.addAttribute("tlist", tlist);
		return "Travelmain";
	}
	
	@RequestMapping(value = "/oneDay")
	public String oneDayTravel(Model model,HttpSession session) {
		List<Travel> tlist = travelService.findTravelByType(1);
		session.setAttribute("type", "one");
		model.addAttribute("tlist", tlist);
		return "Travelmain";
	}
	
	@RequestMapping(value = "/twoDay")
	public String twoDayTravel(Model model,HttpSession session) {
		List<Travel> tlist = travelService.findTravelByType(2);
		session.setAttribute("type", "two");
		model.addAttribute("tlist", tlist);
		return "Travelmain";
	}
	
	@RequestMapping(value = "/threeDay")
	public String threeDayTravel(Model model,HttpSession session) {
		List<Travel> tlist = travelService.findTravelByType(3);
		session.setAttribute("type", "three");
		model.addAttribute("tlist", tlist);
		return "Travelmain";
	}
	
	@RequestMapping(value = "/diyOrder")
	public String todiyOrder() {
		return "DiyOrder";
	}
	
	@Resource
	private ICityService cityService;
	@RequestMapping(value = "/selectCity")
	public String chooseCity(Model model,HttpSession session,@RequestParam("city") String city) {
		
		return "index";
	}

	
	//跳转登录页面
	@RequestMapping(value = "/tologin")
	public String tologin() {
		return "login";
	}
	
	/*@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		// 动态跳转页面
		return formName;
	}*/
	
	//登录操作
	@Resource
	private IUserService userService;
	@RequestMapping(value = "/dologin")
	public String dologin(@RequestParam("username") String username,@RequestParam("userpwd") String userpwd,Model model,HttpSession session) {
		User user = userService.findUserByUname(username);
		if(user.getUpwd().equals(userpwd)) {
			session.setAttribute("uname", username);
			return "redirect:/showAllTravel";
		}else {
			model.addAttribute("msg", "登陆失败");
			return "loginfail";
		}
	}
	
	//返回user信息
	@RequestMapping(value = "/userinfo")
	public String userinfo(Model model,@RequestParam("username") String username) {
		User user = userService.findUserByUname(username);
		model.addAttribute("user", user);
		return "userinfo";
	}
	
	//返回user包含 该user的所有order
	@RequestMapping(value = "/userorder")
	public String userorder(Model model,@RequestParam("username") String username) {
		User user = userService.findUserByUname(username);
		model.addAttribute("user", user);
		return "userorder";
	}
	
	
	
	
}
