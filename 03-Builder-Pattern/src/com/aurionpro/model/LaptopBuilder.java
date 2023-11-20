package com.aurionpro.model;

public class LaptopBuilder {
	private static Laptop laptop;

	public LaptopBuilder() {
		super();
		this.laptop = new Laptop();
	}

	public LaptopBuilder addId(int id) {
		this.laptop.setId(id);
		return this;
	}

	public LaptopBuilder addHdd(String hdd) {
		this.laptop.setHdd(hdd);
		return this;
	}

	public LaptopBuilder addBrand(String brand) {
		this.laptop.setBrand(brand);
		return this;
	}

	private LaptopBuilder addProcessor(String processor) {
		this.laptop.setProcesser(processor);
		return this;
	}

	public LaptopBuilder addram(String ram) {
		this.laptop.setRAM(ram);
		return this;
	}

	public LaptopBuilder addTouchScreen(boolean touchScreen) {
		this.laptop.setTouchscreen(touchScreen);
		return this;
	}

	public static Laptop build() {
		return laptop;
	}
}