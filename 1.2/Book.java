/*
 * @author Gonzalo H. Mendoza
 */
public class Book {

	private String name;
	private Author autor;
	private double price;
	private int qtyInStock;
	
	//Making a constructor
	public Book(String name, Author autor, double price){
		this.name = name;
		this.autor = autor;
		this.price = price;
	}
	
	public Book(String name, Author autor, double price, int qtyInStock){
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAutor() {
		return autor;
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
		return "Book: name = " + this.name + "; autor = " + this.autor.getName() + "; price = " + this.price;
	}
}
