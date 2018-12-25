package com.allook.user.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class OrderController {
	@RequestMapping("/getOrder")
    @ResponseBody
	public String getOrder(HttpServletRequest requset) {
		String zuul=requset.getParameter("Zuul");
    	return "I am Service2... ...(OrderService):"
				+zuul
				;
    }
}
