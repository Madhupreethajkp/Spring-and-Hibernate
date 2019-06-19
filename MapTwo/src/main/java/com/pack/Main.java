package com.pack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Vendor v=new Vendor();
		v.setVendorId(100);
		v.setVendorName("Ram");
		
		Customer c1=new Customer();
		c1.setCustomerId(200);
		c1.setCustomerName("Raj");
		
		Customer c2=new Customer();
		c2.setCustomerId(201);
		c2.setCustomerName("Sam");
		
		Set s1=new HashSet();
		s1.add(c1);
		s1.add(c2);
		v.setCustomer(s1);
		s.persist(v);
		t.commit();
		System.out.println("Inserted successfully");
		s.close();
	}

}
