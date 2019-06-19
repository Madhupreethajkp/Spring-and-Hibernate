package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Sample {
	@Autowired
	@Qualifier("user2")
	private User user;
	
public Sample() {
	System.out.println("Default Constructor");
}
public void display() {
	System.out.println(user.getName());
}
public void display1() {
	System.out.println(user.getAge());
	
}
}
