package com.employeewagecomputation;

import java.util.ArrayList;

public class Company {
	String name;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	double wagePerHour;
	int workingDays;
	double monthlyHourLimit;
	
	Company(String name, double wagePerHour, int workingDays, double monthlyHourLimit){
		this.name = name;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.monthlyHourLimit = monthlyHourLimit;
	}
	
	public void addEmployee(String name) {
		employees.add(new Employee(name));
	}
	
	public void employeesMonthlyWage() {
		employees.forEach((employee) -> System.out.println(name+" Monthly wage for "+employee.name+" is "+employee.monthlyWage(wagePerHour, workingDays, monthlyHourLimit)));
	}

}
