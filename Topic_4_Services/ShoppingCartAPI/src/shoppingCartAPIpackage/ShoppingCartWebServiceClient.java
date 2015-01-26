package shoppingCartAPIpackage;

public class ShoppingCartWebServiceClient implements ShoppingCart{
	
	ShoppingCart webService;  
	
	public ShoppingCartWebServiceClient(){  
    //webService = code to get the reference to Service A from the webservice call  
	}  
	
	 @Override  
	    public void addItem() {  
	        webService.addItem();  
	    }  
	  
	 @Override  
	 public void removeItem() {  
		 webService.removeItem();  
	 }  

	 @Override  
	    public void pay() {  
	        webService.pay();  
	    }  
	  
	 @Override  
	 public void SelectPaymentMethod() {  
		 webService.SelectPaymentMethod();  
	 }   
	 
	 @Override  
	 public void listItems() {  
		 webService.listItems();  
	 }  
	 
	 

}
