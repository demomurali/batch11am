package com.hibernatedemo.simpleHibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="user_demo123")
@Entity
public class User {

	@Id
	private int userId;
	
	private String name;
	private String addresss;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddresss() {
		return addresss;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	
	
	
}
