package com.online;

import java.util.List;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class EmployeeTest {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    
    //int status=dao.saveEmployee(new Employee(101,"Saumil",35000));  
    //System.out.println(status);     
    //status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
    //System.out.println(status); 
       
    Employee emp=dao.getEmployee(101);
    //System.out.println(emp.getId()+"   "+emp.getName()+"   "+emp.getSalary());
    List<Employee> empAll=dao.getAllEmployees();
    for(Employee emp1:empAll)
    {
    	System.out.println(emp1.getId()+"   "+emp1.getName()+"   "+emp1.getSalary());
    }
    //status=dao.selectEmployee();
    //System.out.println("total number of raw is :"+status);
          
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);  
  */
    
    
}  
  
}  