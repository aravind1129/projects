package com.tax.EmployeeTax.model;

public class EmployeePOJO {
	
	
    private String employeeId;
    private String firstName;
    private String lastName;
    private String doj;
    private Double salary;
    
    public EmployeePOJO() {
		
	}

    
	public EmployeePOJO(String doj, String employeeId, String firstName, String lastName, Double salary) {
		super();
		this.doj = doj;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}


	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
    
    
    

}
