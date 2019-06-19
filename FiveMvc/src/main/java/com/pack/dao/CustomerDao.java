package com.pack.dao;

import java.util.List;

import com.pack.modal.Customer;

public interface CustomerDao {
	public void insertCustomer(Customer c);
	public int updateCustomer(Customer c1);
	public void deleteCustomer(int num);
	public List<Customer> fetchCustomerById();


}
