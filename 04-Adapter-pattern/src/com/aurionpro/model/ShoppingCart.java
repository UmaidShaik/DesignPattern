package com.aurionpro.model;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ShoppingCart {
	private List<IItems> cartItems;

	public ShoppingCart() {
		this.cartItems = new ArrayList<IItems>();
	}

	public List<IItems> getCartItem() {
		return cartItems;
	}

	public void addItemtocart(IItems item) {
		this.cartItems.add(item);
	}
	
	public double getCartPrice() {
		return this.cartItems.stream().collect(Collectors.summingDouble(IItems::getItemPrice));
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartItems=" + cartItems + "]";
	}
	
}
