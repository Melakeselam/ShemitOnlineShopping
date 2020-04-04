package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity @IdClass(OrderLineId.class)
public class OrderLine {
	
	@Id	
	private String orderId;
	@Id	
	private String productId;
	
	private Item item;
	private int itemQuantity;
	OrderLine associatedServiceOrderLine;

}
