package com.pack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table(name="Categories")
public class Categories {
	@Id
private int catId;
private String catName;
public int getCatId() {
	return catId;
}
public void setCatId(int catId) {
	this.catId = catId;
}
public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
@ManyToMany(targetEntity=Items.class, cascade=CascadeType.ALL)
@JoinTable(name="categories_items",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="catId"), inverseJoinColumns=@JoinColumn(name="item_id_fk",referencedColumnName="itemId"))
private Set items;
public Set getItems() {
	return items;
}
public void setItems(Set items) {
	this.items = items;
}
}
