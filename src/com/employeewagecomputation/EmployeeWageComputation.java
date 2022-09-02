package com.employeewagecomputation;

public class EmployeeWageComputation {
	public final static int IS_PRESENT = 1;
	public static double WAGE_PER_HOUR = 20;
	public static double FULL_DAY_HOUR = 8;
	
	public static int attendance() {
		if ((int) Math.floor(Math.random() * 10) % 2 == IS_PRESENT) {
			System.out.println("Emplyee is present.");
			System.out.println("Employee daily wage is "+(FULL_DAY_HOUR * WAGE_PER_HOUR));
			return IS_PRESENT;
		} else {
			System.out.println("Employee is absenet.");
			System.out.println("Employee daily wage is 0");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		attendance();
	}

}
