package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductCustomRepository;
import com.example.demo.service.ProductService;
import com.example.demo.util.Util;

@Service
public class ProductImpl implements ProductService {

	@Autowired
	ProductCustomRepository repo;

	Util util = new Util();

	@Override
	public List<Product> searchProducts(String criteria) {
		boolean isNumber = util.isNumeric(criteria);
		boolean isPalindrome = util.isPalindrome(criteria);
		List<Product> listProducts = repo.findByCriteria(criteria, isNumber);
		if (isPalindrome) {
			return calculatePrice(listProducts);
		}
		return listProducts;
	}

	private List<Product> calculatePrice(List<Product> listProducts) {
		List<Product> newProductList = new ArrayList<Product>();
		for (Product p : listProducts) {
			p.setPrice(util.calculateHalfPrice(p.getPrice()));
			newProductList.add(p);
		}
		return newProductList;
	}
}
