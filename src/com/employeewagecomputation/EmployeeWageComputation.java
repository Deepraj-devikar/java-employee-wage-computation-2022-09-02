package com.employeewagecomputation;

public class EmployeeWageComputation {
	public final static int IS_PRESENT = 1;
	
	public static int attendance() {
		if ((int) Math.floor(Math.random() * 10) % 2 == IS_PRESENT) {
			System.out.println("Emplyee is present.");
			return IS_PRESENT;
		} else {
			System.out.println("Employee is absenet.");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		attendance();
	}

}
