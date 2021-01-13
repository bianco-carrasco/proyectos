package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Product;

@RepositoryRestResource(collectionResourceRel = "productos", path = "productos")
public interface ProductRepository extends MongoRepository<Product, String> {

}
