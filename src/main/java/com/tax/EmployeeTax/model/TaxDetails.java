package com.tax.EmployeeTax.model;

public class TaxDetails {
	
	private String fisrtName;
	private String lastName;
	private double salaryPerYear;
	private double taxAmount;
	private double cessAmount;
	
	public TaxDetails() {
		
	}

	public TaxDetails(String fisrtName, String lastName, double salaryPerYear, double taxAmount, double cessAmount) {
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.salaryPerYear = salaryPerYear;
		this.taxAmount = taxAmount;
		this.cessAmount = cessAmount;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalaryPerYear() {
		return salaryPerYear;
	}

	public void setSalaryPerYear(double salaryPerYear) {
		this.salaryPerYear = salaryPerYear;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getCessAmount() {
		return cessAmount;
	}

	public void setCessAmount(double cessAmount) {
		this.cessAmount = cessAmount;
	}

	@Override
	public String toString() {
		return "TaxDetails [fisrtName=" + fisrtName + ", lastName=" + lastName + ", salaryPerYear=" + salaryPerYear
				+ ", taxAmount=" + taxAmount + ", cessAmount=" + cessAmount + "]";
	}
	
	

	
	
	

}
