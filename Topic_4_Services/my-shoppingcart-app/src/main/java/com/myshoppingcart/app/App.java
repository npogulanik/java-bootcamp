package com.myshoppingcart.app;

import java.math.BigInteger;

public class App 
{
    public static void main( String[] args )
    {
User user = new User();
		
		int testIdUser = 1;
		String testPassword = "pass";
		String testName = "Effie";
		String testLastName = "Masterson";
		String testEmail = "eliana.moran@outlook.com";
		BigInteger testPhone = BigInteger.valueOf(Long.parseLong("34300900"));
		
		user.setPassword(testPassword);
		user.setName(testName);
		user.setLastName(testLastName);
		user.setEmail(testEmail);
		user.setPhone(testPhone);
		
    	ShoppingCartService shoppingCart1 = ShoppingCartServiceFactory.getLocalService(); 
    	shoppingCart1.createShoppingCart(user);
	    //shoppingCart1.addItem();  
	    shoppingCart1.pay();    
	    //shoppingCart1.removeItem();  
    }
}
