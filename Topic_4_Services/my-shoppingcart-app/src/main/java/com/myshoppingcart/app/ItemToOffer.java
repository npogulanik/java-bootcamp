package com.myshoppingcart.app;

public class ItemToOffer {
	
	public Product product;
	private int quantity;
	
	public ItemToOffer(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	public ItemToOffer() {
		super();
	}
	
	public Product getItem() {
		return product;
	}
	
	public void setItem(Product product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return 	product + "\n" + 
				"Quantity: " + quantity;
	}

}
