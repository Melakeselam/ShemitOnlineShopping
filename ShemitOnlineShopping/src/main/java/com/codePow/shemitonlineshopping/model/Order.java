package com.codePow.shemitonlineshopping.model;

import java.util.Date;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

	@Id 
	@GeneratedValue
	long OrderId;
	
	private String customerId;
	private Date orderDate;
	private Address deliveryAddress;
	
	private LinkedList<OrderLine> orderLineSet;

	
	
	
}
