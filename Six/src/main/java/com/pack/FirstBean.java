package com.pack;

public class FirstBean {
private SecondBean secondBean;
private String name;


	
	public SecondBean getSecondBean() {
	return secondBean;
}



public void setSecondBean(SecondBean secondBean) {
	this.secondBean = secondBean;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



	public void check() {
		secondBean.check1();
	}
}
