package authorAndBookPackage;

public class TestBook {

	public static void main(String[] args) {
		Author anAuthor = new Author("someone", 'm', "bla@blabla");
		
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		System.out.println(aBook.toString());
		
		Book anotherBook = new Book("more Java for dummy", new Author(null,'m',"blalbla@bla"), 29.95, 888);
		System.out.println(anotherBook.toString());
		
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getAuthor().getEmail());
		
		System.out.println(aBook.getAuthorName()+ "(" + aBook.getAuthorGender()+ ")" + aBook.getAuthorEmail());
	}

}
