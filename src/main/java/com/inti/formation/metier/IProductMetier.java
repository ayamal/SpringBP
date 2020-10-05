package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Product;

public interface IProductMetier {

	public void saveOrUpdate(Product p);

	public Product get(long id);

	public List<Product> findAll();

	public void delete(long id);

}
