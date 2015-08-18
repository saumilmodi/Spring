package com.online.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SquareTest {
	public static void main(String[] args) {
			BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
			Square square=(Square)factory.getBean("Square1");
			square.print();
			
			Square squareSet=(Square)factory.getBean("SquareSet");
			squareSet.printSets();
			
	}

}
