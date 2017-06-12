	package com.category.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {

	@Id
	@Column(name="CATEGORYID")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="CATEGORYSEQ")
	@SequenceGenerator(name="CATEGORYSEQ",sequenceName="CATEGORYSEQUENCE")
	private int categoryId;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "DESCRIPTION")
	private String description;

	public int getCategoryId() {
		return categoryId;
	}
	
	public Category(){}

	public Category(String category, String description) {
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

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", category=" + category + ", description=" + description + "]";
	}

}
