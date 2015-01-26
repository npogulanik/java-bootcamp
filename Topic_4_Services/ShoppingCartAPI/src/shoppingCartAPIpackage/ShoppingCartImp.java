package shoppingCartAPIpackage;

public class ShoppingCartImp implements ShoppingCart{
	
	 	protected ShoppingCartImp(){		
	 		
	 	} 
	  
	    @Override  
	    public void addItem() {  
	        System.out.println("Add an item");  
	    }  
	  
	    @Override  
	    public void pay() {  
	        System.out.println("Pay for the purchase");  
	    }  
	    
	    @Override  
	    public void removeItem() {  
	        System.out.println("Remove");  
	    }
	    
	    @Override  
	    public void SelectPaymentMethod() {  
	        System.out.println("Choose how to pay");  
	    }
	    
	    @Override  
	    public void listItems() {  
	        System.out.println("List all the items in the purchase operation");  
	    }
	    
}
