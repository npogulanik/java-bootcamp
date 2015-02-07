package com.myshoppingcart.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {
	
	 //private static final String template = "Hello, %s!";
	    

	    @RequestMapping("/shoppingcart")
	    public ShoppingCart shoppingCart(@RequestParam(value="user", defaultValue="null") User user) {
	        return new ShoppingCart(user);
	    }

}
