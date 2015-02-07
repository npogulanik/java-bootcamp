package com.myshoppingcart.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class ShoppingCartApp {
	
	@Bean
	ShoppingCartCreatorService mockShoppingCartCreatorService() {
        return new ShoppingCartCreatorService() {
            public String getShoppingCart(User user) {
            	ShoppingCart shoppingCart = new ShoppingCart(user);
                return "ShoppingCart Created!!! \n" + shoppingCart.toString();
            }
        };
    }

	public static void main(String[] args) {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(ShoppingCartApp.class);
		ShoppingCartCreator creator = context.getBean(ShoppingCartCreator.class);
		creator.createShoppingCart(null);
	}

}
