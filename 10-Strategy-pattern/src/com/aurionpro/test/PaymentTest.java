package com.aurionpro.test;

import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;
import com.aurionpro.model.PaymentStrategy;
import com.aurionpro.model.ShoppingCart;

public class PaymentTest {
	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();

	        
	        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
	        PaymentStrategy paypalPayment = new PayPalPayment("example@example.com");

	        
	        cart.setPaymentStrategy(creditCardPayment);
	        cart.checkout(100);

	        
	        cart.setPaymentStrategy(paypalPayment);
	        cart.checkout(50);
	    
	}
}
