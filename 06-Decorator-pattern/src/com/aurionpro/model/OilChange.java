package com.aurionpro.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService carobj) {
		super(carobj);
	

}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (500+super.getCost());
	}
}