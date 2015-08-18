package com.online;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StoreContrller {
	
	@RequestMapping(value = { "/book/{*.htm}" })
	public String processBooks(@PathVariable("*.htm") String item1, @RequestParam("show") String name , ModelMap m) {	
		
		m.addAttribute("bookname",item1);
		System.out.println("U had selected the book:" + item1);
		System.out.println("Name = "+name);
		return "/jsp/success.jsp";
	}

	@RequestMapping(value = { "/cd/{cd}" }, params = "show=yes")
	public String processCds(@PathVariable("cd") String cd, ModelMap m) {
		
		m.addAttribute("cdname",cd);
		System.out.println("U had selected the CD:" + cd);
		return "/jsp/success.jsp";
	}
	
}
