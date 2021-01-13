package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductCustomRepository {

	public List<Product> findByCriteria(String criteria, boolean isNumeric);

}
