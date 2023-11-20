package com.aurionpro.model;

public class CarFactory {
//	CarFactory factory = new CarFactory();
public static ICars makecars(CarType car) {
		if(car==CarType.Maruti) {
			return new Maruti();
	}
		if(car==CarType.Tata) {
			return new Tata();
	}
//		if(car==CarType.Mahindra) {
//			return new Mahindra();
//	}
		return null;
 
}

}