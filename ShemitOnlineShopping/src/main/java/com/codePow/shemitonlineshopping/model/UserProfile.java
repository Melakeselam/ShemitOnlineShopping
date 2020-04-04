package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProfile {

	@Id
	private String customerId;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private Address livingAddress;
	private Address currentDeliveryAddress;
	
	private Authentication access;

	public UserProfile(String title, String firstName, String middleName, String lastName, Authentication access,
			Address livingAddress, Address currentDeliveryAddress) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.access = access;
		this.livingAddress = livingAddress;
		this.currentDeliveryAddress = currentDeliveryAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Authentication getAccess() {
		return access;
	}

	public void setAccess(Authentication access) {
		this.access = access;
	}

	public Address getLivingAddress() {
		return livingAddress;
	}

	public void setLivingAddress(Address livingAddress) {
		this.livingAddress = livingAddress;
	}

	public Address getCurrentDeliveryAddress() {
		return currentDeliveryAddress;
	}

	public void setCurrentDeliveryAddress(Address currentDeliveryAddress) {
		this.currentDeliveryAddress = currentDeliveryAddress;
	}

}
