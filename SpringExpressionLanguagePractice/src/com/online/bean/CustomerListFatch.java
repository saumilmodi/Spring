package com.online.bean;

import java.util.List;

public class CustomerListFatch {
private List<Customer> customerListFactch;
private List<String> customerName;
private int customerId;
private String name;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Customer> getCustomerListFactch() {
	return customerListFactch;
}
public void setCustomerListFactch(List<Customer> customerListFactch) {
	this.customerListFactch = customerListFactch;
}
public List<String> getCustomerName() {
	return customerName;
}
public void setCustomerName(List<String> customerName) {
	this.customerName = customerName;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

void print()
{
	System.out.println("Customer id is :"+customerId);
}
void printString()
{
	for(String name:customerName)
	{
		System.out.println("Customer is :" +name);
	}
}
void printCustomer()
{
	for(Customer customer:customerListFactch)
	{
		System.out.println("Name is :"+customer.getName()+"  "+"Salary is "+customer.getSalary());
	}
}
void printUpperCase()
{
	System.out.println("Name is upper case is :" +name);
}

}
