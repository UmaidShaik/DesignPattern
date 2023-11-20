package com.aurionpro.model;

public class SingleTon {
	private static SingleTon singleton;
	private SingleTon() {}
	public static SingleTon getSingleTon() {
		if(singleton==null) {
			singleton = new SingleTon();
		}
		return singleton;
	}
public void printGreeting() {
	System.out.println(this.hashCode() + " : Welcome");
}
}
