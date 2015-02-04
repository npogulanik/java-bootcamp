package com.myshoppingcart.app;


public class ShoppingCartServiceJmsClient implements ShoppingCartService{
	
	ShoppingCartService jmsObject;  
	  
    public ShoppingCartServiceJmsClient() {  
        //jmsObject = code to get the reference to Service A from the jms call  
    }  
  
      
    public void addItem() {  
        jmsObject.addItem();  
    }  
   
    public void removeItem() {  
        jmsObject.removeItem();  
    }  
      
    public void pay() {  
        jmsObject.pay();  
    }  
  
    public void SelectPaymentMethod() {  
        jmsObject.SelectPaymentMethod();  
    }
    
    public void listItems() {  
        jmsObject.listItems();  
    }


}
