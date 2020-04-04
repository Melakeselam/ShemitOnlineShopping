package com.codePow.shemitonlineshopping.model;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentMode {
	
	@Id
	private String customerId;
	private LinkedList <CreditCard> creditCards;
	private LinkedList <DebitCard> debitCards;
	private LinkedList <OnlinePaymentService> paymentService;
	

}
