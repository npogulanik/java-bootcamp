package com.myshoppingcart.app;

public class ItemToPurchase {
	
	public Product product;
	private int quantity;
	private double price;
	
	
	public ItemToPurchase(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = product.getPrice() * this.quantity;
	}
	
	public ItemToPurchase() {
		super();
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.price = this.product.getPrice() * quantity;
	}
	public double getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		return 	product + "\n" + 
				"Quantity: " + quantity + "\n" + 
				"Price: $" + price;
	}

}
