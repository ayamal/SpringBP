package com.inti.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.formation.metier.IProductMetier;
import com.inti.formation.models.Product;

@SpringBootApplication
public class SpringBProjectApplication implements CommandLineRunner {

	
	
	
	@Autowired
	private IProductMetier pmetier;

	public static void main(String[] args) {

		SpringApplication.run(SpringBProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Voiture v = new Voiture(1, "Mercedes", "CLA", "Noir", 9);
//		Voiture v1 = new Voiture(2, "Renault", "Clio", "Noir", 4);
//		Voiture v2 = new Voiture(3, "Peugeot", "206", "rouge", 4);
//		Voiture v3 = new Voiture(4, "Bmw", "E46", "Noir", 7);
//		metier.saveOrUpdate(v);
//		metier.saveOrUpdate(v1);
//		metier.saveOrUpdate(v2);
//		metier.saveOrUpdate(v3);
//		System.out.println(metier.getById(1));
//		System.out.println(metier.findAll());
//		metier.delete(1);
//		System.out.println(metier.findByPuissance(4));
//		System.out.println(metier.findByCouleurAndPuissance("Noir", 7));
//	    System.out.println(metier.chercherParModele("E46"));
		
		
		Product p1 = new Product(2, "Voitures", "BMW X6", "Allemagne", 350000);
		
		
//		pmetier.saveOrUpdate(p);
		pmetier.saveOrUpdate(p1);
//		pmetier.saveOrUpdate(p2);
		
		System.out.println(pmetier.findAll());
//		System.out.println(pmetier.get(1));
//		pmetier.delete(4);
	}

}
