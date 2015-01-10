package Ej12;

import Ej2.Author;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qtyInStock = 0;	
	public Book(String name, Author[] author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public Book(String name, Author[] author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author[] getAuthor() {
		return author;
	}
	public void setAuthor(Author[] author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString(){
		return this.name+" by "+this.author.length+" authors";
	}
	public void printAuthors(){
		for (int i=0;i<this.getAuthor().length;i++ ){
			System.out.println(author[i].toString());
		}
	}


}
