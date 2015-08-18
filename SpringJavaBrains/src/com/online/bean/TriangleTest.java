package com.online.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;



public class TriangleTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle=(Triangle)factory.getBean("triangleAlias");
		triangle.printTriangle();

	}

}
