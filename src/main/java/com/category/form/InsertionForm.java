package com.category.form;

import javax.validation.constraints.NotNull;

public class InsertionForm {
	
	@NotNull
	private String category;
	private String description;
	public String getCategory() {
		return category;
	}
	public String getDescription() {
		return description;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}
