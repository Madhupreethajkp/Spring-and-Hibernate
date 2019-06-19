package com.pack.service;



import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.CustomerDao;
import com.pack.form.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
private static Logger log=Logger.getLogger(CustomerServiceImpl.class);
private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
	this.customerDao = customerDao;
}
@Transactional
	
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
   log.info("Inside service add customer");
   customerDao.addCustomer(c);
	}
@Transactional
	
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
	log.info("inside update customer");
	customerDao.updateCustomer(c);

	}
@Transactional
public List<Customer> listCustomer() {
	// TODO Auto-generated method stub
	List<Customer> l=customerDao.listCustomer();
	return l;
}
@Transactional
public Customer getCustomerById(Integer cid) {
	// TODO Auto-generated method stub
	Customer c=customerDao.getCustomerById(cid);
	return c;
}
@Transactional
public void removeCustomer(Integer customerId) {
	// TODO Auto-generated method stub
	customerDao.removeCustomer(customerId);
}

}
