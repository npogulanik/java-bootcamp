package shoppingCartAPIpackage;

public class ShoppingCartJmsClient implements ShoppingCart{
	
	 ShoppingCart jmsObject;  
	  
	    public ShoppingCartJmsClient() {  
	        //jmsObject = code to get the reference to Service A from the jms call  
	    }  
	  
	    @Override  
	    public void addItem() {  
	        jmsObject.addItem();  
	    }  
	  
	    @Override  
	    public void removeItem() {  
	        jmsObject.removeItem();  
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

}
