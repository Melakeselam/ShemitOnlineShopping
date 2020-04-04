package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity@IdClass(AssocServId.class)
public abstract class AssociatedService implements Item{
	
	@Id
	String productId;
	@Id
	String serviceId;

}
