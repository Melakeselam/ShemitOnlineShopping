package com.codePow.shemitonlineshopping.model;

public class OnlinePaymentService {
	
	public static final String WEBSITE_PATTERN = "[a-zA-z][a-zA-Z0-9]*.[a-zA-Z]+";
	
	private String serviceProvider;
	private String serviceProviderWebsite;
	private String serviceURL;
	public OnlinePaymentService(String serviceProvider, String serviceProviderWebsite, String serviceURL) {
		super();
		this.serviceProvider = serviceProvider;
		this.serviceProviderWebsite = serviceProviderWebsite;
		this.serviceURL = serviceURL;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getServiceProviderWebsite() {
		return serviceProviderWebsite;
	}
	public void setServiceProviderWebsite(String serviceProviderWebsite) {
		this.serviceProviderWebsite = serviceProviderWebsite;
	}
	public String getServiceURL() {
		return serviceURL;
	}
	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}
	
	

}
