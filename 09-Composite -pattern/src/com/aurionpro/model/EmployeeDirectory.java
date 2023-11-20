package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
	public List<IEmployee> employe;

	public EmployeeDirectory() {
		super();
		this.employe = new ArrayList<>();
	}
	
	public void addEmployee(IEmployee employee) {
		employe.add(employee);
	}
    public void removeEmployee(IEmployee employee) {
    	employe.remove(employee);
    }

	@Override
	public String toString() {
		return "EmployeeDirectory [employe=" + employe + "]";
	}
    
}
