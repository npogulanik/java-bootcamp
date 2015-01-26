package shoppingCartAPIpackage;

public class ShoppingCartProxy implements ShoppingCart{
	
	ShoppingCart implementation;  
	  
	    protected ShoppingCartProxy(ShoppingCart imp) {  
	        this.implementation = imp;  
	    }  
	  
	    public void addItem() {  
	        implementation.addItem();  
	    }  
	  
	    public void removeItem() {  
	        implementation.removeItem();  
	    }  
	    
	    public void pay() {  
	        implementation.pay();  
	    }  
	  
	    public void SelectPaymentMethod() {  
	        implementation.SelectPaymentMethod();  
	    }  

	    public void listItems() {  
	        implementation.listItems();  
	    }  

}
