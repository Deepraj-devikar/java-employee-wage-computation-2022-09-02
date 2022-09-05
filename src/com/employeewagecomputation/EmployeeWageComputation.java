package com.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		CompanyEmpWage companyEmpWage = new CompanyEmpWage();
		companyEmpWage.addCompany("TCS", 25, 18, 80);
		companyEmpWage.addCompany("Wipro", 10, 24, 200);
		companyEmpWage.addEmployee("Raj", "TCS");
		companyEmpWage.addEmployee("Harsh", "Wipro");
		companyEmpWage.empWageBuilder();
		companyEmpWage.companiesTotalWage();
		companyEmpWage.showCompaniesEmployeesDailyWages();
	}

}
