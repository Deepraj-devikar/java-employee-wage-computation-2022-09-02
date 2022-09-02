package com.employeewagecomputation;

public class Employee {
	final static int IS_PRESENT = 1;
	final static int IS_PART_TIME = 2;
	double WAGE_PER_HOUR = 20;
	double FULL_DAY_HOUR = 8;
	double PART_TIME_HOUR = 4;
	int WORKING_DAYS = 20;
	double MONTHLY_HOUR_LIMIT = 100;
	
	double monthWages = 0;
	double monthHours = 0;
	
	public int attendance() {
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
	
	public double monthlyWage() {
		int day = 1;
		while (day <= 20 && monthHours < MONTHLY_HOUR_LIMIT) {
			attendance();
		}
		return monthWages;
	}
	
}
