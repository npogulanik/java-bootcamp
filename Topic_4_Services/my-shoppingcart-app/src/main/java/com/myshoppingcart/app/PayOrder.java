package com.myshoppingcart.app;

import java.util.Date;

public class PayOrder {

	private ShoppingCart shoppingCart;
	private Date ordered;
	private Date paid;
	private Status status;
	private Double orderPrice;
	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	public Date getOrdered() {
		return ordered;
	}
	
	public void setOrdered(Date ordered) {
		this.ordered = ordered;
	}
	
	public Date getPaid() {
		return paid;
	}
	
	public void setPaid(Date paid) {
		this.paid = paid;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}
}

	