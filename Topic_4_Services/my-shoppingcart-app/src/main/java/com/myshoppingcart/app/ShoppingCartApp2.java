package com.myshoppingcart.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class ShoppingCartApp2 {

	public static void main(String[] args) {
		User user = new User();
		SpringApplication.run(ShoppingCartApp2.class, args);
	}

}
