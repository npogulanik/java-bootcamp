package com.myshoppingcart.app;

public class ShoppingCartServiceFactory {
	
	private ShoppingCartServiceFactory() {}  
	  
    public static ShoppingCartService getLocalService(){  
        return new ShoppingCartServiceImp();  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingJms(){  
        return new ShoppingCartServiceProxy (new ShoppingCartServiceJmsClient());  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingWebService(){  
        return new ShoppingCartServiceProxy (new ShoppingCartWebServiceClient());  
    }  

}
