package com.aurionpro.test;

import com.aurionpro.model.IGadget;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		LaptopBuilder lb = new LaptopBuilder();
		lb.addBrand("Intel").addHdd("8").addId(1).addram("12").addTouchScreen(true);

//		Laptop lap = LaptopBuilder.build();
//	System.out.println(lap);	
		IGadget lap1 = lb.build();
		System.out.println(lap1);
	
	}

}
