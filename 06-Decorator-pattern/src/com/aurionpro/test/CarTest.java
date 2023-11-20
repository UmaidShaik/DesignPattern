package com.aurionpro.test;

import com.aurionpro.model.CarInspection;
import com.aurionpro.model.ICarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.WheelAlign;

public class CarTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange caroil = new OilChange(car);
		WheelAlign carwheel = new WheelAlign(caroil);
		System.out.println(car.getCost());
		System.out.println("----------------");
		System.out.println(caroil.getCost());
		System.out.println("----------------");

		System.out.println( carwheel.getCost());
	}

}
