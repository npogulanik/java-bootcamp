package com.myshoppingcart.app;

public class PayPalPayment extends Payment{
	
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void performDiscount(PayOrder payOrder) {
		ItemToPurchase mostCheapItem = payOrder.getShoppingCart().getCheapestItem();
		payOrder.setOrderPrice(payOrder.getOrderPrice() - mostCheapItem.getPrice()); 
	}

}