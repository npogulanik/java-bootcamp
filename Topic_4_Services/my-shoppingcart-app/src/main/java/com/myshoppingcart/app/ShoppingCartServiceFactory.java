package com.myshoppingcart.app;

public class ShoppingCartServiceFactory {
	
	private ShoppingCartServiceFactory() {}  
	  
    public static ShoppingCartService getLocalService(){  
        return new ShoppingCartServiceImp();  
    }  
  
    public static ShoppingCartServiceProxy getRemoteServiceUsingJms(){  
        return new ShoppingCartServiceProxy (new ShoppingCartServiceJmsClient());  
    }  
  
    public static ShoppingCartServiceProxy getRemoteServiceUsingWebService(){  
        return new ShoppingCartServiceProxy (new ShoppingCartWebServiceClient());  
    }  

}
