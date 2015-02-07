package com.myshoppingcart.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartCreator {
	
	final private ShoppingCartCreatorService service;

    @Autowired
    public ShoppingCartCreator(ShoppingCartCreatorService service) {
        this.service = service;
    }

    public void createShoppingCart(User user) {
    	
        System.out.println(this.service.getShoppingCart(user));
        
    }

}
