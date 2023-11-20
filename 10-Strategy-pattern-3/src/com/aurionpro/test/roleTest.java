package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;

public class roleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee(1,"Umaid",new Consultant());
		System.out.println(emp.getDescription());
		System.out.println(emp.getResponsibility());
		
	}

}
