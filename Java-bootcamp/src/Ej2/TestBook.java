package Ej2;

public class TestBook {
	public static void main(String[] args) {
		Author A1=new Author("Tan Ah Teck", "ahteck@somewhere.com",'m');
		Book aBook=new Book("Java for dummy ",A1,19.95,1000);
		System.out.println(aBook.toString());
		
		System.out.println(aBook.getAuthor().getEmail());
		
	}

}
