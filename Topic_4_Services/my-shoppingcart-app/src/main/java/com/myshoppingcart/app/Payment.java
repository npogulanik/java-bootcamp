package com.myshoppingcart.app;
import java.util.Date;

public abstract class Payment {
	
	static int uniqueIdProduct = 0;
	protected int paymentId;
	protected int paymentCount;
	protected Date date;
	protected PayOrder payOrder;
	
	public PayOrder getPayOrder() {
		return this.payOrder;
	}
	
	public void setPayOrder(PayOrder payOrder) {
		this.payOrder = payOrder;
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	public int getPaymentCount() {
		return paymentCount;
	}
	
	public void setPaymentCount(int paymentCount) {
		this.paymentCount = paymentCount;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}	
	
	public void performDiscount(PayOrder payOrder) {
	}
	
}