package com.myshoppingcart.app;


public class ShoppingCartServiceJmsClient implements ShoppingCartService{
	
	ShoppingCartService jmsObject;  
	  
    public ShoppingCartServiceJmsClient() {  
        //jmsObject = code to get the reference to Service A from the jms call  
    }  
  
    @Override
    public void addItem(ShoppingCart shoppingCart,ItemToPurchase item) {  
        jmsObject.addItem(shoppingCart, item);  
    }  
   
    @Override
    public void removeItem(ShoppingCart shoppingCart,ItemToPurchase item) {  
        jmsObject.removeItem( shoppingCart, item);  
    }  
    
    @Override
    public void pay() {  
        jmsObject.pay();  
    }  
  
    @Override
    public void SelectPaymentMethod() {  
        jmsObject.SelectPaymentMethod();  
    }
    
    @Override
    public void listItems() {  
        jmsObject.listItems();  
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
