package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Product {

	@Id
	private String id_generated;
	private Integer id;
	private String brand;
	private String description;
	private String image;
	private Integer price;

	public String getId_generated() {
		return id_generated;
	}

	public void setId_generated(String id_generated) {
		this.id_generated = id_generated;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id_generated=" + id_generated + ", id=" + id + ", brand=" + brand + ", description="
				+ description + ", image=" + image + ", price=" + price + "]";
	}

}
