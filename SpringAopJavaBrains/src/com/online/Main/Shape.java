package com.online.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.Model.Circle;
//import com.online.Model.Triangle;



public class Shape {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Circle circle=context.getBean("circle",Circle.class);
		circle.getName();
		/*
		Triangle triangle=context.getBean("triangle",Triangle.class);
		System.out.println(triangle.getName());*/
	}

}
