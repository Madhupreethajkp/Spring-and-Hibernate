package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student100")
public class Student {
	@Id
	@Column(name="Sid")
	private int sid;
	@Column(name="Sname",length=20)
	private String sname;
	@Column(name="grp", length=10)
private String group;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
}
