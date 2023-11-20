package com.aurionpro.model;

public class ItalianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		System.out.println("Italian Hotel");
		return new ItalianMenu();
	}

}
