package com.aurionpro.model;

 class Laptop implements IGadget {

	private int id;
	private String Brand;
	private String RAM;
	private String hdd;
	private String Processer;
	private boolean touchscreen;
	
	public Laptop() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getProcesser() {
		return Processer;
	}
	public void setProcesser(String processer) {
		Processer = processer;
	}
	public boolean isTouchscreen() {
		return touchscreen;
	}
	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", Brand=" + Brand + ", RAM=" + RAM + ", hdd=" + hdd + ", Processer=" + Processer
				+ ", touchscreen=" + touchscreen + "]";
	} 
	
	
}
