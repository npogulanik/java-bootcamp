package com.myshoppingcart.app;

import java.util.Date;

public class CreditCardPayment extends Payment{

	private String company;
	private int number;
	private Date dateOfExpiry;
	private String name;
	private int cvc;

	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCvc() {
		return cvc;
	}
	
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	@Override
	public void performDiscount(PayOrder payOrder) {
		payOrder.setOrderPrice(payOrder.getOrderPrice() * 0.9); 
	}
	
}