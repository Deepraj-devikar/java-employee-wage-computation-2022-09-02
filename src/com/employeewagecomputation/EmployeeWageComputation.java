package com.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Company tcs = new Company("TCS");
		Company wipro = new Company("Wipro");
		tcs.addEmployee();
		wipro.addEmployee();
		System.out.println("Monthly wage for TCS employees is : ");
		tcs.employeesMonthlyWage();
		System.out.println("Monthly wage for Wipro employees is : ");
		wipro.employeesMonthlyWage();
	}

}
