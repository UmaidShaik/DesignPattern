package com.aurionpro.model;

public  class HatDecorator implements IHat{

	private IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}
	
	
	
}
