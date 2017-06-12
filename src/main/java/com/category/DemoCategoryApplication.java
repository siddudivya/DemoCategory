package com.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.category.controller.DemoCategoryController;
import com.category.model.Category;

@SpringBootApplication
public class DemoCategoryApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoCategoryApplication.class);
	}


	public static void main(String[] args) {
			
		SpringApplication.run(DemoCategoryApplication.class, args);
		
	}
}
