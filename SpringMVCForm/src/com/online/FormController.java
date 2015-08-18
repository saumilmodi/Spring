package com.online;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register.htm")
public class FormController 
{
	@RequestMapping(method = RequestMethod.GET)
	public String transferToRegisterPage(ModelMap map)
	{
		Map<String,String> hobbies=new HashMap<String,String>();
		hobbies.put("Cricket", "Cricket");
		hobbies.put("Football", "Football");
		hobbies.put("Basketball", "Basketball");
		hobbies.put("Tennis", "Tennis");
		
		map.addAttribute("hlist",hobbies);
		
		Map<String,String> technologies=new HashMap<String,String>();
		technologies.put("Java", "Java");
		technologies.put("C", "C");
		technologies.put("C++", "C++");
		technologies.put("Php", "Php");
		
		map.addAttribute("tlist",technologies);
		
		Map<String,String> gender=new HashMap<String,String>();
		gender.put("Male", "Male");
		gender.put("Female", "Female");
		
		map.addAttribute("glist",gender);
		
		User user=new User();
		map.addAttribute("UserCommand",user);
		
		return "/register.jsp";
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public String tranferToHomePage(@ModelAttribute("UserCommand")User user)
	{
		System.out.println("UserName is :"+user.getName());
		System.out.println("Password is :"+user.getPassword());
		System.out.println("Age :"+user.getAge());
		System.out.print("Hobbie is : ");
		for(int i=0;i<user.getHobby().length;i++)
		{
			System.out.print(user.getHobby()[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<user.getGender().length;i++)
		{
			System.out.println("Gender is :"+user.getGender()[i]);
		}
		
		System.out.println();
		System.out.print("Technologies is : ");
		for(int i=0;i<user.getTechnologies().length;i++)
		{
			System.out.print(user.getTechnologies()[i]+"  ");
		}
		System.out.println();
		System.out.println("Address is :"+user.getAddress());
		
		
		
		return "/home.jsp";
	}
}
