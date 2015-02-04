package com.myshoppingcart.app;

public class CashPayment extends Payment{

	@Override
	public void performDiscount(PayOrder payOrder) {
		ItemToPurchase mostExpensiveItem = payOrder.getShoppingCart().getMostExpensiveItem();
		payOrder.setOrderPrice(payOrder.getOrderPrice() - (mostExpensiveItem.getPrice() * 0.9)); 
	}
}