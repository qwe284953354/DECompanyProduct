package com.DEC.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DEC.entity.User;
import com.DEC.service.IUserService;


/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月29日 
 *
 */

@Controller
@RequestMapping("/Registered")
public class RegisteredController {
	
	@Resource
	private IUserService userService;
	@RequestMapping(value = "/login")
	public String toLogin(@ModelAttribute("user") User user) {
		if(userService.addUser(user)) {
			return "index";
		}else {
			return "";
		}
	}
}
