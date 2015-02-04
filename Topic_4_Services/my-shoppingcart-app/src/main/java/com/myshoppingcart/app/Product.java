package com.myshoppingcart.app;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	static int uniqueIdProduct = 0;
	private int idProduct;
	private String name;
	private String description;
	private double price;
	
	public Product(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		uniqueIdProduct = uniqueIdProduct + 1;
		this.idProduct = uniqueIdProduct;
	}
	public Product() {
		super();
		uniqueIdProduct = uniqueIdProduct + 1;
		this.idProduct = uniqueIdProduct;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return	"[id: " + idProduct + ", name: " + name + 
				", description: " + description + ", unit price: $" + price + "]";
	}
}
