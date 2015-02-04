package com.myshoppingcart.app;

import java.math.BigInteger;

public class ShoppingCartServiceImp implements ShoppingCartService{
	
	protected ShoppingCartServiceImp(){		
 		
 	} 
  
    public void addItem() {  
        System.out.println("Add an item");  
    }  
  
    public void pay() {  
        System.out.println("Pay for the purchase");  
    }  
    
    
    public void SelectPaymentMethod() {  
        System.out.println("Choose how to pay");  
    }
    
    public void listItems() {  
        System.out.println("List all the items in the purchase operation");  
    }

	public void addItem(ShoppingCart shoppingCart, ItemToPurchase item) {
		
		shoppingCart.addItem(item);
		
	}

	public void removeItem(ShoppingCart shoppingCart,ItemToPurchase item) {
		
		shoppingCart.removeItem(item);
		
	}

	public void logIn() {
		// TODO Auto-generated method stub
		
	}

	public void createShoppingCart(User user) {
		
		ShoppingCart cart = new ShoppingCart();
		cart.setUser(user);
		System.out.println(cart.toString());
		
	}

	public void deleteShoppingCart() {
		// TODO Auto-generated method stub
		
	}
    

}
