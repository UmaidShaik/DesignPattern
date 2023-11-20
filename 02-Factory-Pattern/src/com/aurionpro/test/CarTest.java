package com.aurionpro.test;

import com.aurionpro.model.CarFactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.ICars;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = new CarFactory();
		  ICars maruti = factory.makecars(CarType.Maruti);
		 maruti.start();
		  ICars tata = factory.makecars(CarType.Tata);
		  tata.start();
		  tata.stop();
	}

}
