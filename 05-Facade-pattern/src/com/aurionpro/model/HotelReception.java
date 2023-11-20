package com.aurionpro.model;

public class HotelReception {

	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu menu = indHotel.getMenu();
		menu.displayMenu();
	}
	public void getItalianMenu() {
		IHotel itHotel = new ItalianHotel();
		IMenu menu = itHotel.getMenu();
		menu.displayMenu();
	}
	public void getChineseMenu() {
		IHotel chinHotel = new ChineseHotel();
		IMenu menu = chinHotel.getMenu();
		menu.displayMenu();
	}

	
}
