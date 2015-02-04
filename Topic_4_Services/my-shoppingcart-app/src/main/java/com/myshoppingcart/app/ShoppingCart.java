package com.myshoppingcart.app;

import java.util.ArrayList;

public class ShoppingCart{
	
	private User user;
	private ArrayList<ItemToPurchase> items = new ArrayList<ItemToPurchase>();
	private ArrayList<Offer> offers = new ArrayList<Offer>();
	private double amount = 0;
	
	public ItemToPurchase getCheapestItem(){
				
			ItemToPurchase res = null;
			double minPrice = Double.MAX_VALUE;
			for (int i=0; i<items.size(); i++) {
				if (items.get(i).getPrice() < minPrice) {
					minPrice = items.get(i).getPrice();
					res = items.get(i);
				}
			}
			return res;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public ArrayList<ItemToPurchase> getItems() {
		return this.items;
	}
	
	public ArrayList<Offer> getOffers() {
		return this.offers;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public ShoppingCart() {
		super();
	}
	
	private String listItems() {
		
		String res = "";
		
		for (int i=0; i<items.size(); i++) {
			res = res + "\n" + items.get(i) ;
		}
	
		return res;
	}
	
	private String listOffers() {
		
		String res = "";
		
		for (int i=0; i<offers.size(); i++) {
			res = res + "\n" + offers.get(i);
		}
		
		return res;
	}
	
	public void addItem(ItemToPurchase item) {
		this.items.add(item);
		this.amount = this.amount + item.getPrice();
	}
	
	public void removeItem(ItemToPurchase item) {
		this.amount = this.amount - item.getPrice();
		int index = this.items.indexOf(item);
		this.items.remove(index);
	}
	
	public void addOffer(Offer offer) {
		
		this.offers.add(offer);
		this.amount = this.amount + offer.getPrice();
		
	}
	
	public void removeOffer(Offer offer) {
		
		this.amount = this.amount - offer.getPrice();
		int index = this.items.indexOf(offer);
		this.offers.remove(index);
		
	}
	
	public ItemToPurchase getMostExpensiveItem() {
		
		ItemToPurchase res = null;
		double maxPrice = 0;
		for (int i=0; i<items.size(); i++) {
			if (items.get(i).getPrice() > maxPrice){
				maxPrice = items.get(i).getPrice();
				res = items.get(i);		
			}
		}
		return res;
	}
		
	@Override
	public String toString() {
		return 	"ShoppingCart" + "\n" + 
				"User: " + user + "\n" +
				"Items:" + listItems() + "\n" +
				"Offers:" + listOffers() + "\n" +
				"Amount: $" + amount;
	}

}
