package com.employeewagecomputation;

public class EmployeeWageComputation {
	public final static int IS_PRESENT = 1;
	public final static int IS_PART_TIME = 2;
	public static double WAGE_PER_HOUR = 20;
	public static double FULL_DAY_HOUR = 8;
	public static double PART_TIME_HOUR = 4;
	public static int WORKING_DAYS = 20;
	public static double MONTHLY_HOUR_LIMIT = 100;
	
	public static double monthWages = 0;
	public static double monthHours = 0;
	
	public static int attendance() {
		double wage = 0;
		switch ((int) Math.floor(Math.random() * 10) % 3) {
		case IS_PRESENT:
			System.out.println("Emplyee is present.");
			wage = FULL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Employee daily wage is "+wage);
			monthWages += wage;
			monthHours += FULL_DAY_HOUR;
			return IS_PRESENT;
		case IS_PART_TIME:
			System.out.println("Emplyee is part time.");
			wage = PART_TIME_HOUR * WAGE_PER_HOUR;
			System.out.println("Employee daily wage is "+wage);
			monthWages += wage;
			monthHours += PART_TIME_HOUR;
			return IS_PART_TIME;
		default:
			System.out.println("Employee is absenet.");
			System.out.println("Employee daily wage is 0");
			return 0;
		}
	}
	
	public static double monthlyWage() {
		int day = 1;
		while (day <= 20 && monthHours < MONTHLY_HOUR_LIMIT) {
			attendance();
		}
		return monthWages;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Monthly wage for employee is "+monthlyWage());
	}

}
