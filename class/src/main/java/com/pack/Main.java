package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
Sample s=(Sample)fact.getBean("sample");

	System.out.println(s);
	System.out.println(s.getMessage());
	Sample s1=(Sample)fact.getBean("sample");
	System.out.println(s1);
	System.out.println(s1.getMessage());
	
	}

	
}
