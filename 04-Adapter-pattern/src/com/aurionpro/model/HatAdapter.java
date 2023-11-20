package com.aurionpro.model;

public class HatAdapter implements IItems {
 
	private Hat hat;
	 
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getLongName();
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice()+hat.getTax();
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "HatAdapter [hat=" + hat + "]";
	}

}
