package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductSalesInsurance extends AssociatedService{

	@Id
	private String salesInsuranceNumber;
	private String policyNumber;
	private String prolicyProvider;
	private String proicyDescription;
	
	public ProductSalesInsurance(String salesInsuranceNumber, String policyNumber, String prolicyProvider) {
		super();
		this.salesInsuranceNumber = salesInsuranceNumber;
		this.policyNumber = policyNumber;
		this.prolicyProvider = prolicyProvider;
	}

	public String getSalesInsuranceNumber() {
		return salesInsuranceNumber;
	}

	public void setSalesInsuranceNumber(String salesInsuranceNumber) {
		this.salesInsuranceNumber = salesInsuranceNumber;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getProlicyProvider() {
		return prolicyProvider;
	}

	public void setProlicyProvider(String prolicyProvider) {
		this.prolicyProvider = prolicyProvider;
	}

	public String getProicyDescription() {
		return proicyDescription;
	}

	public void setProicyDescription(String proicyDescription) {
		this.proicyDescription = proicyDescription;
	}
	
	
	
}
