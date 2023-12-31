package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private IRole role;
	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
	public void promote(IRole role) {
		this.role=role;
	}

	public String getDescription() {
		return role.Description();
	}
	public String getResponsibility() {
		return role.responsibility();
	}
}
