package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(101, "Umaid", 90000);
		ac.getNotifiers();
		ac.registerNotifier(new SmsNotifier());
		ac.Withdraw(400);
		ac.deposit(400);
		ac.deposit(1000);

	}

}
