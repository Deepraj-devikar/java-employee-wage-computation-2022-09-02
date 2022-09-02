package com.employeewagecomputation;

import java.util.ArrayList;

public class Company {
	String name;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	Company(String name){
		this.name = name;
	}
	
	public void addEmployee() {
		employees.add(new Employee());
	}
	
	public void employeesMonthlyWage() {
		employees.forEach((employee) -> System.out.println("Monthly wage for employee is "+employee.monthlyWage()));
	}

}
