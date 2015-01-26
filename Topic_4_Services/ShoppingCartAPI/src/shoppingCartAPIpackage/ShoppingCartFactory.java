package shoppingCartAPIpackage;

public class ShoppingCartFactory {
	
	private ShoppingCartFactory() {}  
	  
    public static ShoppingCart getLocalService(){  
        return new ShoppingCartImp();  
    }  
  
    public static ShoppingCart getRemoteServiceUsingJms(){  
        return new ShoppingCartProxy (new ShoppingCartJmsClient());  
    }  
  
    public static ShoppingCart getRemoteServiceUsingWebService(){  
        return new ShoppingCartProxy (new ShoppingCartWebServiceClient());  
    }  

}
