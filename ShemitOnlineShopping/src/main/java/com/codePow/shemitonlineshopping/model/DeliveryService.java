package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DeliveryService extends AssociatedService{
	
	@Id
	@GeneratedValue
	long deliveryId;
	Double serviceCharge;

}
