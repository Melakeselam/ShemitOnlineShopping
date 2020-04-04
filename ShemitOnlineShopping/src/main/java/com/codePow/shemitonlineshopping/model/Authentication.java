package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authentication {
	
	@Id
	private String customerId;
	private String userId;
	private String password;
	
	
	public Authentication(String customerId, String userId, String password) {
		super();
		this.customerId = customerId;
		
		this.userId = userId;
		this.password = password;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
