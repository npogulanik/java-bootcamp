package com.myshoppingcart.app;


public class ShoppingCartWebServiceClient implements ShoppingCartService{
	
	ShoppingCartService webService;  
	
	public ShoppingCartWebServiceClient(){  
    //webService = code to get the reference to Service A from the webservice call  
	}  
	
	 public void addItem() {  
	        webService.addItem();  
	    }  
	  
	 public void removeItem() {  
		 webService.removeItem();  
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
	 
	 

}
