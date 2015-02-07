package com.myshoppingcart.app;

public interface ShoppingCartService {
	
	public void addItem(ShoppingCart shoppingCart,ItemToPurchase item);  
    public void removeItem(ShoppingCart shoppingCart, ItemToPurchase item);  
    public void pay();
    public void SelectPaymentMethod();
    public void listItems();
    public void logIn();
    public void createShoppingCart(User user);
    public void deleteShoppingCart(ShoppingCart shoppingCart);

}
