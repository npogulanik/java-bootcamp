package authorAndBookPackage;

public class TestAuthor {

	public static void main(String[] args) {
		
		Author anAuthor = new Author("Eliana A. Moran",'f',"eliana_474@hotmail.com");
		System.out.println(anAuthor.toString());
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);
	}
}
