package com.karexpert.multipleDatabases.dao.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karexpert.multipleDatabases.model.product.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
