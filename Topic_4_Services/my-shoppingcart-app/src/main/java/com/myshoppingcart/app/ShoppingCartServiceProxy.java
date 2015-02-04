package com.myshoppingcart.app;

public class ShoppingCartServiceProxy {

	ShoppingCartService implementation;  
	  
    protected ShoppingCartServiceProxy(ShoppingCartService imp) {  
        this.implementation = imp;  
    }  
  
    public void addItem(ShoppingCart shoppingCart,ItemToPurchase item) {  
        implementation.addItem(shoppingCart, item);  
    }  
  
    public void removeItem(ShoppingCart shoppingCart, ItemToPurchase item) {  
        implementation.removeItem(shoppingCart, item);  
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
    
    public void createShoppingCart(User user) {  
        implementation.createShoppingCart(user);  
    } 

}
