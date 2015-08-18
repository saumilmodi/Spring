package com.online.bean;

import java.util.ArrayList;
import java.util.List;



public class CustomerList {
private List<Customer> customerList;

public CustomerList() {
	customerList = new ArrayList<Customer>();
	customerList.add(new Customer(1, "Saumil", 80000));
	customerList.add(new Customer(2, "Rajan",75000));
	customerList.add(new Customer(3, "Shahil",70000));
}

public List<Customer> getCustomerList() {
	return customerList;
}

public void setCustomerList(List<Customer> customerList) {
	this.customerList = customerList;
}
}
