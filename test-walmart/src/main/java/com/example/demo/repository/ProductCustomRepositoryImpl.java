package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class ProductCustomRepositoryImpl implements ProductCustomRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Product> findByCriteria(String criteria, boolean isNumber) {
		Query query = new Query();
		if (isNumber) {
			query.addCriteria(new Criteria().orOperator(Criteria.where("id").is(Integer.parseInt(criteria)),
					Criteria.where("brand").is(criteria), Criteria.where("description").is(criteria)));
		} else {
			query.addCriteria(new Criteria().orOperator(Criteria.where("brand").is(criteria),
					Criteria.where("description").is(criteria)));
		}
		return mongoTemplate.find(query, Product.class);
	}
}
