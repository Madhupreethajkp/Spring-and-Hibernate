package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
User u=(User)con.getBean("user");
System.out.println(u);
	}

}
