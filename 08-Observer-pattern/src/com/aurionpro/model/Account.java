package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int id;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	double amount = 0;

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			notifiers.forEach((notifier) -> {
				notifier.notifyUser(this,this.amount);
			});
		}
	}

	public void Withdraw(double amount) {
		if (amount > 0) {
			this.balance -= amount;
			notifiers.forEach((notifier) -> {
				notifier.notifyUser(this,this.amount);
			});
		}
	}

	public void registerNotifier(INotifier notifier) {
		this.notifiers.add(notifier);

	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", notifiers=" + notifiers
				+ ", amount=" + amount + "]";
	}
	
	
}
