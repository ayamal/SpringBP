package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.formation.metier.IProductMetier;
import com.inti.formation.models.Product;
import com.inti.formation.repositories.IProductRepository;

//@Service("vt")

@Service
@Transactional
public class ProductMetier implements IProductMetier{
	
	@Autowired
	private IProductRepository repo;

	@Override
	public void saveOrUpdate(Product p) {
		repo.save(p);		
	}

	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
		
	}

	



}
