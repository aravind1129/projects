package com.tax.EmployeeTax.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



public class Employee {
	
	
	
	private Integer empId;
	@NotNull(message = "first name not null")
	private String firstName;
	
	@NotNull(message = "first name not null")
	private String lastName;
	
	@NotNull(message = "Email not null")
	@Email(message = "please use proper mail")
	private String email;
	
	@NotNull(message = "phone Numbers not null")
	private List<Integer> phoneNumbers;
	
	@NotNull(message = "DOJ not null")
	private LocalDate dateOfJoining;
	
	@NotNull(message = "salary not null")
	private double salaryPerMonth;
	
	
	public Employee() {
		
	}

	

	public Employee(int empId, String firstName, String lastName, String email, List<Integer> phoneNumbers,
			LocalDate dateOfJoining, double salaryPerMonth) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.dateOfJoining = dateOfJoining;
		this.salaryPerMonth = salaryPerMonth;
	}



	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(List<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}


	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumbers=" + phoneNumbers + ", dateOfJoining=" + dateOfJoining + ", salaryPerMonth="
				+ salaryPerMonth + "]";
	}
	
	
	

}
