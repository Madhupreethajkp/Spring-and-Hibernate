package com.pack.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;
import com.pack.modal.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			s.save(c);
			t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
	}

	public void updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			Customer c=(Customer)s.get(Customer.class,c1.getCustid());
			if(c!=null) {
				c.setAddress(c1.getAddress());
				c.setAge(c1.getAge());
				c.setSalary(c1.getSalary());
				s.update(c);
				
			}
			t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
		
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			Customer c=(Customer)s.get(Customer.class,num);
			if(c!=null) {
				s.delete(c);
			}
			t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
	}

	public Customer fetchCustomerById(int num) {
		// TODO Auto-generated method stub
		
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		Customer c=null;
		try {
			t=s.beginTransaction();
			 c=(Customer)s.get(Customer.class,num);
			 t.commit();
		}
		catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		return c;
	}

}
