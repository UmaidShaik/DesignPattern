package com.aurionpro.model;

public class ChineseHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		System.out.println("Chinese Hotel");
		return new ChineseMenu();
	}

}
