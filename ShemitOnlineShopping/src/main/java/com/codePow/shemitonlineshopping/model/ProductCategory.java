package com.codePow.shemitonlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategory {
	
	@Id
	private long categoryId;
	private String categoryName;
	private String description;
	
	public ProductCategory(long categoryId, String categoryName, String description) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
