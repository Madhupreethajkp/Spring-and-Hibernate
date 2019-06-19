package com.pack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vend100")
public class Vendor {
	@Id
	@Column(name="vid")
	private int vendorId;
	@Column(name="vname")
	private String vendorName;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Customer.class, cascade=CascadeType.ALL)
	@JoinColumn(name="venid", referencedColumnName="vid")
	
	private Set customer;
	public Set getCustomer() {
		return customer;
	}
	public void setCustomer(Set customer) {
		this.customer = customer;
	}

}
