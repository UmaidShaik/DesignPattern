package com.aurionpro.model;

public class Circle implements IShape{
private String color;

	public Circle(String color) {
	super();
	this.color = color;
}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
