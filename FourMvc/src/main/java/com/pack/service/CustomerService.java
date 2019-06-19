package com.pack.service;

import com.pack.modal.Customer;

public interface CustomerService {
	public  void insertCustomer(Customer c);
	public void updateCustomer(Customer c1);
	public void deleteCustomer(int num);
	public Customer fetchCustomerById(int num);

}
