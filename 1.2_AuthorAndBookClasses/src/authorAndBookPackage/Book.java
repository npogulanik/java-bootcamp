package authorAndBookPackage;

public class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book (String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		qtyInStock = 0;
	}
	
	public Book (String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;		
	}
	public String getAuthorName(){
		return author.getName();
	}
		
	public String getAuthorEmail(){
		return author.getEmail();
	}
	
	public char getAuthorGender(){
		return (author.getGender());
	}
		
	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(){
		String label;
		label = "'" + name + "'" + author.toString();
		return label;
	}	

}
