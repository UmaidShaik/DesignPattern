package com.aurionpro.model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
System.out.println("Indian Hotel");
		return new IndianMenu();
	}

	
	
 
	
}
