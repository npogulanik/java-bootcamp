package com.myshoppingcart.app;

import java.util.ArrayList;

public class Offer {

	static int uniqueIdOffer = 0;
	private ArrayList<ItemToOffer> items = new ArrayList<ItemToOffer>();
	private int idOffer;
	private String description;
	private double price;
	
	public Offer() {
		super();
		uniqueIdOffer++;
		this.idOffer = uniqueIdOffer;
	}
	
	public ArrayList<ItemToOffer> getItems() {
		return items;
	}
	public int getIdOffer() {
		return idOffer;
	}	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addItem(ItemToOffer itemToOffer) {
		items.add(itemToOffer);
	}
	public void removeItem(ItemToOffer itemToOffer) {
		int index = items.indexOf(itemToOffer);
		items.remove(index);
	}
	private String listItems() {
		
		String res = "";
		
		for (int i=0; i<items.size(); i++) {
			res = res + "\n" + items.get(i) ;
		}
		return res;
	}

	@Override
	public String toString() {
		return 	"Offer items:" + listItems() + "\n" + 
				"Offer description: " + description + "\n" + 
				"Offer price: $" + price ;
	}
	
}
	