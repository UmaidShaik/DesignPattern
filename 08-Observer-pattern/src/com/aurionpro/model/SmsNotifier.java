package com.aurionpro.model;

public class SmsNotifier implements INotifier{



	@Override
	public void notifyUser(Account account, double amount) {
        double balance = account.getBalance();
		System.out.println("Account Name :" +account.getName());
		System.out.println("Balance :" +balance);


	}


}
