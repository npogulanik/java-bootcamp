package shoppingCartAPIpackage;

public class MainClass {

	public static void main(String[] args) {
		
		    ShoppingCart shoppingCart1 = ShoppingCartFactory.getLocalService();  
		    shoppingCart1.addItem();  
		    shoppingCart1.pay();    
		    shoppingCart1.removeItem();  

	}

}
