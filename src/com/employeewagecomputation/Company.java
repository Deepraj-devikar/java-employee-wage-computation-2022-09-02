package com.employeewagecomputation;

import java.util.ArrayList;

public class Company {
	String name;
	double totalWage;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	double wagePerHour;
	int workingDays;
	double monthlyHourLimit;
	
	Company(String name, double wagePerHour, int workingDays, double monthlyHourLimit){
		this.name = name;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.monthlyHourLimit = monthlyHourLimit;
		totalWage = 0;
	}
	
	public void addEmployee(String name) {
		employees.add(new Employee(name));
	}
	
	/**
	 * calculate and display month wage of all employees in company in specific month
	 * @return total of month wage of all employees in company in specific month
	 */
	private double employeesMonthlyWage() {
		double monthWage = 0;
		for (int index = 0; index < employees.size(); index++) {
			Employee employee = employees.get(index);
			double employeeMonthWage = employee.monthlyWage(wagePerHour, workingDays, monthlyHourLimit);
			System.out.println(name+" Monthly wage for "+employee.name+" is "+employeeMonthWage);
			monthWage += employeeMonthWage;
		}
		return monthWage;
	}
	
	/*
	 * store total of month wage of all employees in company in specific month
	 */
	public void empWageBuilder() {
		totalWage += employeesMonthlyWage();
	}

}
