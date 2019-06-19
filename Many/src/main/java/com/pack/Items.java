package com.pack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Items {
	@Id
	private int itemId;
	private String itemName;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@ManyToMany(targetEntity=Categories.class,mappedBy="items")
	private Set categories;
	public Set getCategories() {
		return categories;
	}
	public void setCategories(Set categories) {
		this.categories = categories;
	}

}
