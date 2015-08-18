package com.differentshape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shape
{

	public static void main(String[] args) 
	{
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		/*Square square1=(Square)context.getBean("square1");
		square1.printSquareDimensions();
	*/
		
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.printTraiangle();
	}
}
