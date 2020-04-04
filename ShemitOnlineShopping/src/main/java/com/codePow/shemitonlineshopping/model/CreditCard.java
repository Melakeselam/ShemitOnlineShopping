package com.codePow.shemitonlineshopping.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCard {
	
	@Id
	private String creditCardNumber;
	private Date expirationDate;
	private String serviceProvider;
	private int  csc;
	
	
	public CreditCard(String creditCardNumber, Date expirationDate, String serviceProvider, int csv) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.serviceProvider = serviceProvider;
		this.csc = csv;
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
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
	public void setCsc(int csc) {
		this.csc = csc;
	}

}
