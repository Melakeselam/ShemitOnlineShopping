package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private String customerId;
	private UserProfile profile;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	private ShoppingCart cart;
	
	private PaymentMode paymentMode;

	public Customer(String customerId, UserProfile profile, ShoppingCart cart, PaymentMode paymentMode) {
		super();
		this.customerId = customerId;
		this.profile = profile;
		this.cart = cart;
		this.paymentMode = paymentMode;
	}

}
