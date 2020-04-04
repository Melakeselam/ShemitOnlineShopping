package com.codePow.shemitonlineshopping.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DebitCard {
	
	@Id
	private String debitCardNumber;
	private Date expirationDate;
	private String serviceProvider;
	private int  csc;
	
	public DebitCard(String debitCardNumber, Date expirationDate, String serviceProvider, int csv) {
		super();
		this.debitCardNumber = debitCardNumber;
		this.expirationDate = expirationDate;
		this.serviceProvider = serviceProvider;
		this.csc = csc;
	}

	public String getdebitCardNumber() {
		return debitCardNumber;
	}

	public void setdebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public int getCsc() {
		return csc;
	}

	public void setCsc(int csv) {
		this.csc = csc;
	}
	
	

}
