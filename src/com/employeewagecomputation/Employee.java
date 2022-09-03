package com.employeewagecomputation;

public class Employee {
	final static int IS_PRESENT = 1;
	final static int IS_PART_TIME = 2;
	double FULL_DAY_HOUR = 8;
	double PART_TIME_HOUR = 4;
	
	public String name;
	double monthWages;
	double monthHours;
	
	Employee(String name) {
		this.name = name;
		monthWages = 0;
		monthHours = 0;
	}
	
	/**
	 * check employee attendance according to attendance calculate and display daily wage 
	 * then increments month wage and month hours by daily wage and day hours respectively
	 * @param wagePerHour
	 * @return attendance
	 */
	public int attendance(double wagePerHour) {
		double wage = 0;
		switch ((int) Math.floor(Math.random() * 10) % 3) {
		case IS_PRESENT:
			System.out.println(name+" is present.");
			wage = FULL_DAY_HOUR * wagePerHour;
			System.out.println(name+" daily wage is "+wage);
			monthWages += wage;
			monthHours += FULL_DAY_HOUR;
			return IS_PRESENT;
		case IS_PART_TIME:
			System.out.println(name+" is part time.");
			wage = PART_TIME_HOUR * wagePerHour;
			System.out.println(name+" daily wage is "+wage);
			monthWages += wage;
			monthHours += PART_TIME_HOUR;
			return IS_PART_TIME;
		default:
			System.out.println(name+" is absenet.");
			System.out.println(name+" daily wage is 0");
			return 0;
		}
	}
	
	/**
	 * calculates whole months wage
	 * @param wagePerHour
	 * @param workingDays
	 * @param monthlyHourLimit
	 * @return monthWages
	 */
	public double monthlyWage(double wagePerHour, int workingDays, double monthlyHourLimit) {
		int day = 1;
		while (day <= workingDays && monthHours < monthlyHourLimit) {
			attendance(wagePerHour);
		}
		return monthWages;
	}
	
}
