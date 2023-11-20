package com.aurionpro.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Golden " +super.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500 +super.getPrice();
	}

}
