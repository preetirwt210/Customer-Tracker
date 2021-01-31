package com.customer.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.customer.springdemo.dao.CustomerDAO;
import com.customer.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDao;
	
	@RequestMapping("/list")
	public String listCustomer(Model theModel) {
		
		List<Customer> listCustomers=customerDao.getCustomers();
		
		theModel.addAttribute("customers",listCustomers);
		
		return "list-customers";
	}
}
