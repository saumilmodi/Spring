package com.online;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/{item}")
public class ShopController {
	
	@RequestMapping("/soft/{subitem}")
	public String processSofts(@PathVariable("item") String item, @PathVariable("subitem") String subitem, ModelMap m) {
		
		m.addAttribute("toyname", item );
		m.addAttribute("toy", subitem);
		System.out.println(item + ":" + subitem);
		return "/jsp/success.jsp";
	}

	@RequestMapping("/games/{subitem}")
	public String processGames(@PathVariable("item") String item, @PathVariable("subitem") String subitem, ModelMap m) {

		m.addAttribute("toyname",item );
		m.addAttribute("toy", subitem);
		System.out.println(item + ":" + subitem);
		return "/jsp/success.jsp";
	}
}
