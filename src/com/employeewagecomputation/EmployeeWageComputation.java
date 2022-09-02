package com.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Company tcs = new Company("TCS", 25, 18, 80);
		Company wipro = new Company("Wipro", 10, 24, 200);
		tcs.addEmployee("Raj");
		wipro.addEmployee("Harsh");
		System.out.println("Monthly wage for TCS employees is : ");
		tcs.employeesMonthlyWage();
		System.out.println("Monthly wage for Wipro employees is : ");
		wipro.employeesMonthlyWage();
	}

}
