package com.aurionpro.test;

import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;


public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("Developer :- ");
		IEmployee emp = new Developer("Umaid","CEO");
		emp.showEmployeeDetails();
		
		System.out.println("---------------------");
		
		System.out.println("Manager :- ");
		IEmployee emp1 = new Manager("Shaikh","HR");
		emp1.showEmployeeDetails();
		
		EmployeeDirectory ed = new EmployeeDirectory();
		
		ed.addEmployee(emp1);
		ed.removeEmployee(emp);
		
		System.out.println(ed);
		emp.showEmployeeDetails();
		
	}

}
