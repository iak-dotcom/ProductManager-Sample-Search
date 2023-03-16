package com.khan.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.khan.product.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("SELECT p FROM Product p WHERE CONCAT(p.name, p.brand, p.madein, p.price) LIKE %?1%")
    public List<Product> search(String keyword);
}
