package com.online.bean;

public class Customer {
private int cId;
private String name;
private long salary;
public Customer()
{
	
}
public Customer(int cId, String name, long salary) {
	super();
	this.cId = cId;
	this.name = name;
	this.salary = salary;
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
void printCustomer()
{
	System.out.println(cId+"  "+name+"  "+salary);
}
}
