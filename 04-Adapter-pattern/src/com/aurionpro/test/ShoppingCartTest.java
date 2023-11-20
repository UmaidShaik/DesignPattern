package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItems;
import com.aurionpro.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ShoppingCart carObj = new ShoppingCart();
      carObj.addItemtocart(new Biscuit("Parle-G" , 10));
      carObj.addItemtocart(new HatAdapter(new Hat("Summer","Designer cotton",300,10)));
      
      
      displayCartItems(carObj);  System.out.println("========================================");
      System.out.println("Cart Price : " + carObj.getCartPrice());
      System.out.println(carObj.getCartPrice());
	}



private static void displayCartItems(ShoppingCart cart) { 
	  List<IItems> cartList = cart.getCartItem(); 
	  for (IItems i : cartList) { 
	   System.out.println("Item Name : " + i.getItemName()); 
	   System.out.println("Item Price : " + i.getItemPrice()); 
	  } 
	 
	 }
}
