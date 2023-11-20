package com.aurionpro.model;

public class RibonedHat extends HatDecorator{

	public RibonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Riboned "+super.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200+super.getPrice();
	}

}
