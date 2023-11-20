package com.aurionpro.test;

import com.aurionpro.model.HotelReception;

public class HotelReceptionTest {

	public static void main(String[] args) {
		
		HotelReception hr = new HotelReception();
		hr.getIndianMenu();
		System.out.println("--------------------");
		hr.getItalianMenu();
		System.out.println("--------------------");
		hr.getChineseMenu();

	}

}
