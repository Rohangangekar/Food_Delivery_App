package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
	public Product findByPname(String name);

}