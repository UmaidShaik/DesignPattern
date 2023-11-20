package com.aurionpro.test;

import com.aurionpro.model.SingleTon;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getSingleTon();
		obj1.printGreeting();
		SingleTon obj2 = SingleTon.getSingleTon();
		obj2.printGreeting();
		System.out.println(obj1==obj2);


	}

}
