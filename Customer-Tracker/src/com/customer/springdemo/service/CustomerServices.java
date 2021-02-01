package com.customer.springdemo.service;

import java.util.List;

import com.customer.springdemo.entity.Customer;

public interface CustomerServices {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
