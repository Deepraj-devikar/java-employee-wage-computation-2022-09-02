package com.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Company tcs = new Company("TCS", 25, 18, 80);
		Company wipro = new Company("Wipro", 10, 24, 200);
		tcs.addEmployee("Raj");
		wipro.addEmployee("Harsh");
		System.out.println("Monthly wage for "+tcs.name+" employees is : ");
		tcs.empWageBuilder();
		System.out.println("Monthly wage for "+wipro.name+" employees is : ");
		wipro.empWageBuilder();
		System.out.println("Total wage for "+tcs.name+" is "+tcs.totalWage);
		System.out.println("Total wage for "+wipro.name+" is "+wipro.totalWage);
	}

}
