package com.DEC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月26日 
 *
 */
@Controller
public class DECcontroller {

	@RequestMapping(value = "/Admin",method = RequestMethod.GET)
	public String test() {
		return "Admin";
	}
	
	
}
