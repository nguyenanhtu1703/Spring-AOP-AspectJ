package com.nguyenanhtu.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nguyenanhtu.customer.bo.CustomerBo;

public class App {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomerAround("nguyenanhtu pro");
	}
}
