
public class TestBookAndAuthor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Testing the classes
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor);
		
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		System.out.println("Nombre del libro: " + aBook.getName());
		
		//Make a new book with the author object in the constructor
		Book anotherBook = new Book("Star Wars III", new Author("Pablo Neruda", "pablito_neruda@chile.com",'c'),29.95,88);
		System.out.println(anotherBook);
	}

}
