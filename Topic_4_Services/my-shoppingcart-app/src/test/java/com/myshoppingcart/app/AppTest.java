package com.myshoppingcart.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.math.BigInteger;

public class AppTest  extends TestCase
{
    
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
     
    //Tests for the business logic
    
    public void _ItemToOffer() {
		
		Product testProduct = new Product("T-shirt", "XL", 70);
		int testQuantity = 3;
		String testToString = 	testProduct + "\n" + 
				"Quantity: " + testQuantity;
		
		ItemToOffer itemToOffer = new ItemToOffer();
		
		itemToOffer.setItem(testProduct);
		itemToOffer.setQuantity(3);
		
		assertEquals("ItemToPurchase Test get&set product", testProduct, itemToOffer.getItem());
		assertEquals("ItemToPurchase Test get&set quantity", testQuantity, itemToOffer.getQuantity());
		assertEquals("ItemToPurchase Test toString", testToString, String.valueOf(itemToOffer));
		
	}
    
    public void _ItemToPurchase() {
		
		Product testProduct = new Product("T-shirt", "XL", 70);
		int testQuantity = 3;
		double testPrice = 210;
		String testToString = 	testProduct + "\n" + 
								"Quantity: " + testQuantity + "\n" + 
								"Price: $" + testPrice;
		
		ItemToPurchase itemToPurchase = new ItemToPurchase();
		
		itemToPurchase.setProduct(testProduct);
		itemToPurchase.setQuantity(3);
		
		assertEquals("ItemToPurchase Test get&set product", testProduct, itemToPurchase.getProduct());
		assertEquals("ItemToPurchase Test get&set quantity", testQuantity, itemToPurchase.getQuantity());
		assertEquals("ItemToPurchase Test get&set price", String.valueOf(testPrice), String.valueOf(itemToPurchase.getPrice()));
		
		assertEquals("ItemToPurchase Test toString", testToString, String.valueOf(itemToPurchase));
    }
    
	public void _Offer() {
			
		Offer offer = new Offer();
		
		Product testProduct1 = new Product("T-shirt", "XL", 70);
		Product testProduct2 = new Product("Jacket", "XL", 170);
		Product testProduct3 = new Product("Jeans", "XL", 100);
		
		int testQuantity1 = 3;
		int testQuantity2 = 2;
		int testQuantity3= 2;
		
		double testPrice = 480;
		
		String testDescription = "T-shirt free";
		
		ItemToOffer itemToOffer1 = new ItemToOffer(testProduct1, testQuantity1);
		ItemToOffer itemToOffer2 = new ItemToOffer(testProduct2, testQuantity2);
		ItemToOffer itemToOffer3 = new ItemToOffer(testProduct3, testQuantity3);
		
		offer.addItem(itemToOffer1);
		offer.addItem(itemToOffer2);
		offer.addItem(itemToOffer3);
		
		offer.removeItem(itemToOffer3);
		
		offer.setPrice(testPrice);
		offer.setDescription(testDescription);
		
		String testToString = 	"Offer items:"+ "\n" + 
								itemToOffer1 + "\n" + 
								itemToOffer2 + "\n" + 
								"Offer description: " + testDescription + "\n" + 
								"Offer price: $" + testPrice; 
		
		assertEquals("Offer Test toString", testToString, String.valueOf(offer));
	}

	public void _Product() {
		
		Product product = new Product();
		
		String testName = "T-shirt";
		String testDescription = "so cute";
		int testIdProduct = 1;
		double testPrice = 70;
		String testToString = 	"[id: " + testIdProduct + ", name: " + testName + 
							", description: " + testDescription + ", unit price: $" + testPrice + "]";
		
		product.setName(testName);
		product.setDescription(testDescription);
		product.setPrice(testPrice);
		
		assertEquals("Product Test get&set name", testName, product.getName());
		assertEquals("Product Test get&set description", testName, product.getName());
		assertEquals("Product Test get&set idProduct", testName, product.getName());
		assertEquals("Product Test get&set price", testName, product.getName());
		
		assertEquals("Product Test toString", testToString, String.valueOf(product));
			
	}
	
	public void _User() {
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
		
		String testToString = 	"User: " + testLastName.toUpperCase() + ", " + testName + "\n" +
								"UserId: " + testIdUser + "\n" +
								"Email: " + testEmail + "\n" +
								"Phone: " + testPhone;
		
		assertEquals("Product Test toString", testToString, String.valueOf(user));
	} 
    
}
