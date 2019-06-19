package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.modal.Customer;

public class CustomerServiceImpl implements CustomerService {
	public  void insertCustomer(Customer c) {
		
		new CustomerDaoImpl().insertCustomer(c);
		
		
		
		
		//return i;
		
	}

	public int updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().updateCustomer(c1);
		
		
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
		
	}

	public List<Customer> fetchCustomerById() {
		return new CustomerDaoImpl().fetchCustomerById();
		
	}


}
