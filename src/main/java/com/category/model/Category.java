package com.category.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {

	@Id
	@Column(name="CATEGORYID")
	//@GeneratedValue
	private int categoryId;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "DESCRIPTION")
	private String description;

	public int getCategoryId() {
		return categoryId;
	}
	
	public Category(){}

	public Category(int categoryId, String category, String description) {
		super();
		this.categoryId = categoryId;
		this.category = category;
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
