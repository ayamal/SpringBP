package com.inti.formation.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.metier.IProductMetier;
import com.inti.formation.models.Product;
@RestController
@RequestMapping("/apiUser")
@CrossOrigin("*")
public class UtilisateurWebService {
	
	
		@Autowired
		private IProductMetier metier;
		
		
	
	
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(value="/getAll", method= RequestMethod.GET)
		public List<Product> findAll(){
			
			return metier.findAll();
		}

}
