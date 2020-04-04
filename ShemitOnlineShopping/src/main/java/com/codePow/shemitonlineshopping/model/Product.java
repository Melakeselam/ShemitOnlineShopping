package com.codePow.shemitonlineshopping.model;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Item{
	
	@Id
	private String productId;
	private String productName;
	private LinkedList<Specification<String,String>> productSpec;
	private String manufacturer;
	private Address manufacturerAddress;
	private String supplier;
	private Address supplierAddress;
	
	

}
