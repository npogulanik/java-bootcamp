package com.myshoppingcart.app;


public class ShoppingCartWebServiceClient implements ShoppingCartService{
	
	ShoppingCartService webService;  
	
	public ShoppingCartWebServiceClient(){  
    //webService = code to get the reference to Service A from the webservice call  
	}  
	
	 public void addItem(ShoppingCart shoppingCart,ItemToPurchase item) {  
	        webService.addItem( shoppingCart, item);  
	    }  
	  
	 public void removeItem(ShoppingCart shoppingCart,ItemToPurchase item) {  
		 webService.removeItem( shoppingCart, item);  
	 }  

	 public void pay() {  
	        webService.pay();  
	    }  
	    
	 public void SelectPaymentMethod() {  
		 webService.SelectPaymentMethod();  
	 }   
	  
	 public void listItems() {  
		 webService.listItems();  
	 }

	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createShoppingCart(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShoppingCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		
	}  
	 
	 

}
