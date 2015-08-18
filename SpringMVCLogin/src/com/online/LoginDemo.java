package com.online;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginDemo {
	@RequestMapping("LoginPage")
	public String transerToLogin(ModelMap map)
	{
		System.out.println("Transfering to Login Page");
		LoginCredential lc=new LoginCredential();
		map.addAttribute("LoginCommand",lc);
		return "/login.jsp";
	}
	
	@RequestMapping("LoginCheck")
	public String tranferBasedOnCredentials(@ModelAttribute("LoginCommand")LoginCredential lc)
	{
		if(lc.getUsername().equals(lc.getPassword()))
			return "/home.jsp";
		else
			return "/login.jsp";
	}
}


