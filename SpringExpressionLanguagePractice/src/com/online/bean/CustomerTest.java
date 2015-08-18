package com.online.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CustomerListFatch clf=(CustomerListFatch)context.getBean("CustomerListFatch1");
		clf.print();
		clf.printString();
		clf.printCustomer();
		clf.printUpperCase();
	}
}
