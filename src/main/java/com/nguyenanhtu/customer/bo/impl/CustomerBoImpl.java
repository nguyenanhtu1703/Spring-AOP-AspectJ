package com.nguyenanhtu.customer.bo.impl;

import com.nguyenanhtu.customer.bo.CustomerBo;

public class CustomerBoImpl implements CustomerBo {

	public void addCustomer() {
		System.out.println("add Customer() is running");
	}

	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("addCustomerThrowException() is running");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		// TODO Auto-generated method stub
		System.out.println("addCustomerAround() is running, args: " + name);
	}
}
