package com.category.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.category.form.InsertionForm;
import com.category.model.Category;
import com.category.repository.DemoCategoryRepository;

@Controller
public class DemoCategoryController {

	@Autowired
	DemoCategoryRepository dr;
	
	@RequestMapping("/home")
	public String CategoryForm(){
		return "Home";
	}
	
	@RequestMapping("/insertForm")
	public String insertCategoryForm(Map model,InsertionForm i){
		model.put("insert", i);
		return "categoryInsertion";
	}
	
	@RequestMapping(value="/insertData", method=RequestMethod.POST)
	public String insert(@ModelAttribute("insert") Category c,ModelAndView m,BindingResult b){
	
		if(b.hasErrors()){
			b.getFieldErrors();
			return "error";
		}
		
		else {
			
			dr.save(new Category(c.getCategory(),c.getDescription()));
			return "categoryInsertion";
		}
		
	
		
	}
	
	@RequestMapping("/display")
	public ModelAndView retrieveCategory(ArrayList<Category> list){
		
		for(Category c: dr.findAll()){
			list.add(c);
		}
		return new ModelAndView("display","category",list);
		
	}
		
	
}
