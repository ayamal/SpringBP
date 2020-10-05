package com.inti.formation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IProductMetier;
import com.inti.formation.models.Product;

@Controller
public class ProductController {
	
	@Autowired
	private IProductMetier metier;
    
	@RequestMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("products",metier.findAll());
		return "index";
		
		
	}
	
	@RequestMapping("/new")
	public String redirectSave(Model model) {
		
		model.addAttribute("product",new Product());
		return "new";
		
		
	}
	
	@RequestMapping("/save")
	public String saveProduct(@ModelAttribute Product product) {
		
		metier.saveOrUpdate(product);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable long id) {
		
		metier.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable long id) {
		
		
		ModelAndView mav = new ModelAndView("edit");
		Product product = metier.get(id);
		mav.addObject("product",product);
		return mav;
		
		
	}
	
	
}
