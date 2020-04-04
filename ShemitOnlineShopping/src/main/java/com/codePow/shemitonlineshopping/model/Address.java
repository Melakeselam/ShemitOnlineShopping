package com.codePow.shemitonlineshopping.model;

import java.util.ArrayDeque;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	public static final String EMAIL_PATTERN = "[a-zA-Z$][a-zA-Z0-9$._]*@[a-zA-Z0-9]+.[a-zA-Z]+";
	@Id
	private String email;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private State state;
	private String zip;
	private ArrayDeque<String> telephones;
	

	public Address() {
		super();
		this.addressLine1 = "";
		this.addressLine2 = "";
		this.city = "";
		this.state = State.IA;
		this.zip = "";
		this.telephones = new ArrayDeque<>();
	}

	public Address(String email, String addressLine1, String addressLine2, String city, State state, String zip,
			ArrayDeque<String> telephones) throws IllegalEmailPatternException{
		super();
		if(email.matches(EMAIL_PATTERN)) {
			this.email = email;
		}else {
			throw new IllegalEmailPatternException("The email does not match the expected XXXXXX@XXXX.XXX pattern");
		}
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.telephones = telephones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws IllegalEmailPatternException{
		if(email.matches(EMAIL_PATTERN)) {
			this.email = email;
		}else {
			throw new IllegalEmailPatternException("The email does not match the expected XXXXXX@XXXX.XXX pattern");
		}
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public ArrayDeque<String> getTelephones() {
		return telephones;
	}

	public void setTelephones(ArrayDeque<String> telephone) {
		this.telephones = telephone;
	}

	public String getPhoneNumber(int indx) {
		if (telephones == null || indx < 0 || indx >= telephones.size()) {
			return null;
		}
		return (String) telephones.toArray()[indx];
	}

	public String getPhoneNumber() {
		if (telephones == null || telephones.size() == 0) {
			return null;
		}
		return telephones.pop();
	}

	public void addPhoneNumber(String tel) {
		telephones.push(tel);
	}

}
