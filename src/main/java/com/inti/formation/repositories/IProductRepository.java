package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.models.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
