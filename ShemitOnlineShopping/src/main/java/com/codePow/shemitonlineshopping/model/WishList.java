package com.codePow.shemitonlineshopping.model;

import java.util.Date;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WishList {
	
	@Id
	private String customerId;
	private LinkedList<Specification<Item,Integer>> selectedItemQtyPair; //holds each item and the selected quantity
	private Date activatedDate;
	
	public WishList(String customerId, Date activatedDate) {
		super();
		this.customerId = customerId;
		this.activatedDate = activatedDate;
		selectedItemQtyPair = new LinkedList<Specification<Item,Integer>>();
	}
	
	public void addToList(Item item, Integer quantity) {
		selectedItemQtyPair.add(new Specification(item,quantity));
		
	}

	public String getCustomerId() {
		return customerId;
	}

	public LinkedList<Specification<Item, Integer>> getSelectedItemQtyPair() {
		return selectedItemQtyPair;
	}

	public Date getActivatedDate() {
		return activatedDate;
	}
	
	

}
