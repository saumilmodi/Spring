package com.online.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        UserBean user1 = (UserBean) context.getBean("userbeanexp");
        
        System.out.println("User Details \n");
        
        System.out.println(user1.displayUser());
    }
}
