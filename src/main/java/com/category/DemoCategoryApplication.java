package com.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.category.controller.DemoCategoryController;
import com.category.model.Category;

@SpringBootApplication
public class DemoCategoryApplication {
	

	public static void main(String[] args) {
			
		SpringApplication.run(DemoCategoryApplication.class, args);
		
	}
}
