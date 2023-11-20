package com.aurionpro.model;

public class CarServiceDecorator implements ICarService {
private ICarService carobj;


	public CarServiceDecorator(ICarService carobj) {
	super();
	this.carobj = carobj;
}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return carobj.getCost();
	}

}
