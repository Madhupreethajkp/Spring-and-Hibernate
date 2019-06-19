package com.pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h=(HelloWorld)con.getBean("message");
		System.out.println(h.getMessage());
		con.registerShutdownHook();
	}

}
