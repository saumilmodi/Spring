package com.online.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.DAO.StudentDAO;

public class StudentMain {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		StudentDAO studentDAO=new StudentDAO(context.getBean("jdbcDaoImpl",StudentDAO.class));
	}

}
