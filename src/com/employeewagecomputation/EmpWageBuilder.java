/**
 * will generate all employees wages
 */
package com.employeewagecomputation;

/**
 * @author Deepraj Devikar
 *
 */
public interface EmpWageBuilder {
	/*
	 * generate all employees wages
	 */
	public void empWageBuilder();
	
	/**
	 * Check company of specified names occurs or not if occurs then return its total wages otherwise return 0
	 * @param companyName
	 * @return company's total wages 
	 */
	public double companyTotalWage(String companyName);
}
