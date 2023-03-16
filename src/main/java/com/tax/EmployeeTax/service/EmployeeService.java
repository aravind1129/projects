package com.tax.EmployeeTax.service;




import org.springframework.stereotype.Service;

import com.tax.EmployeeTax.model.EmployeePOJO;
import com.tax.EmployeeTax.model.TaxDetails;

@Service
public class EmployeeService {
	

	
	
	public TaxDetails calculateTax(EmployeePOJO employee)
	{
		
		
		double salaryPerYear= employee.getSalary();
		double tax=0;
		double cessAmount=0;
		double a=12500;
		double b=25000;
		double c=37500;
		
		if(salaryPerYear<=250000)
		{
			tax=0;
		}
		else if(salaryPerYear>250000 && salaryPerYear<=500000)
		{
			
			tax=(salaryPerYear-a)*0.05;
			
			
		}
		else if(salaryPerYear>500000 && salaryPerYear<=1000000)
		{
			tax=(salaryPerYear*0.1)-a-b;
		
			
		}
		else if(salaryPerYear>1000000)
		{
			tax=(salaryPerYear*0.2)-a-b-c;
		}
		
		TaxDetails details = new TaxDetails();
		details.setFisrtName(employee.getFirstName());
		details.setLastName(employee.getLastName());
		details.setSalaryPerYear(salaryPerYear);
		details.setTaxAmount(tax);
		details.setCessAmount(cessAmount);
		return details;
	}
	

}
