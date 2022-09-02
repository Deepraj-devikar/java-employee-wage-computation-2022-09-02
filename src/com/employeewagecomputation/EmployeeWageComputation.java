package com.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		Company company = new Company(new Employee());
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Monthly wage for employee is "+company.employee.monthlyWage());
	}

}
