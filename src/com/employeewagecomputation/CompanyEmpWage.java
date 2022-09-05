package com.employeewagecomputation;

import java.util.ArrayList;

public class CompanyEmpWage implements EmpWageBuilder{
	// Array List Collection for storing companies
	ArrayList<Company> companies = new ArrayList<Company>();
	
	public void addCompany(String comapnyName, double wagePerHour, int workingDays, double monthlyHourLimit) {
		// Adding company to companies array list
		companies.add(new Company(comapnyName, wagePerHour, workingDays, monthlyHourLimit)); 
	}
	
	public void addEmployee(String employeeName, String companyName) {
		for (Company company : companies) if (company.name.equals(companyName)) {
			company.addEmployee(employeeName);
			break;
		}
	}
	
	/*
	 * store total of month wage of all employees in company in specific month
	 */
	public void empWageBuilder() {
		for (Company company : companies) {
			System.out.println("Monthly wage for "+company.name+" employees is : ");
			company.setTotalWage(company.employeesMonthlyWage());
		}
	}
	
	/*
	 * show all companies total wage
	 */
	public void companiesTotalWage() {
		for (Company company : companies) System.out.println("Total wage for "+company.name+" is "+company.getTotalWage());
	}
	
	public void showCompaniesEmployeesDailyWages() {
		companies.forEach((company) -> {
			System.out.println("\n"+company.name+" wages list : ");
			company.showEmployeesDailyWages();	
		});
	}
}
