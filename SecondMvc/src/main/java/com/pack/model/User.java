package com.pack.model;

public class User {
	private String name;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String gender;
	private String country;
	private String aboutYou;
	private String[] community;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAboutYou() {
		return aboutYou;
	}
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}
	public String[] getCommunity() {
		return community;
	}
	public void setCommunity(String[] community) {
		this.community = community;
	}
	public boolean isMailinglist() {
		return mailinglist;
	}
	public void setMailinglist(boolean mailinglist) {
		this.mailinglist = mailinglist;
	}
	private boolean mailinglist;
	

}
