package com.pack.service;

import com.pack.dao.CustomerDaoImpl;
import com.pack.modal.Customer;

public class CustomerServiceImpl implements CustomerService {
	public  void insertCustomer(Customer c) {
		
		new CustomerDaoImpl().insertCustomer(c);
		
		
		
		
		//return i;
		
	}

	public void updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().updateCustomer(c1);
		
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
		
	}

	public Customer fetchCustomerById(int num) {
		return new CustomerDaoImpl().fetchCustomerById(num);
		
	}

}
