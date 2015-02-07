package com.myshoppingcart.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ShoppingCartServiceImp implements ShoppingCartService{
	
	protected ShoppingCartServiceImp(){		
 		
 	} 
  
	@Override
    public void addItem(ShoppingCart shoppingCart,ItemToPurchase item) {  
        System.out.println("Add an item");  
    }  
  
	@Override
    public void pay() {  
        System.out.println("Pay for the purchase");  
    }  
    
	@Override
    public void SelectPaymentMethod() {  
        System.out.println("Choose how to pay");  
    }
    
	@Override
    public void listItems() {  
        System.out.println("List all the items in the purchase operation");  
    }

	
	@Override
	public void removeItem(ShoppingCart shoppingCart,ItemToPurchase item) {
		
		shoppingCart.removeItem(item);
		
	}

	public void logIn() {
		// TODO Auto-generated method stub
		
	}

	public void createShoppingCart(User user) {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(ShoppingCartApp.class);
		ShoppingCartCreator creator = context.getBean(ShoppingCartCreator.class);
		creator.createShoppingCart(user);
		
	}

	
	@Override
	public void deleteShoppingCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		
	}
    

}
