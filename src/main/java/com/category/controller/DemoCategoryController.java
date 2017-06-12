package com.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.category.model.Category;
import com.category.repository.DemoCategoryRepository;

@Controller
public class DemoCategoryController {

	@Autowired
	DemoCategoryRepository dr;
	
	
	@RequestMapping("/insert")
	public String insert(){
		ModelAndView m=new ModelAndView();
		Category c=new Category(3,"Home-Decor","");
		dr.save(c);		
		m.addObject(c);
		m.setViewName("success");
		return m.getViewName();
	}
	
	
}
