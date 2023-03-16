package com.tax.EmployeeTax.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.tax.EmployeeTax.model.EmployeePOJO;
import com.tax.EmployeeTax.model.TaxDetails;

@Service
public class EmployeeService {
	

	
	
	public TaxDetails calculateTax(EmployeePOJO employee) throws ParseException
	{
		
		
		double salary= employee.getSalary();
		double tax=0;
		double cessAmount=0;
		double a=12500;
		double b=25000;
		double c=37500;
		
		String doj = employee.getDoj();
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	     Date parse = simpleDateFormat.parse(doj);
	    int  joiningYear= parse.getYear()+1900;
	    int joiningMonth = parse.getMonth()+1;
	    int joiningDate = parse.getDate();
	    
	    Date endOfTheYear;
		if (joiningMonth >= 3) {
            int year = joiningYear + 1;
            endOfTheYear = simpleDateFormat.parse("31/03/" + year);
        } else {
            endOfTheYear = simpleDateFormat.parse("31/03/" + joiningYear);
        }
		Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(parse);
        
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endOfTheYear);
        
        int yearsInBetween = calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR);
        int monthsDiff = calendar2.get(Calendar.MONTH) - calendar1.get(Calendar.MONTH);
        long months = (yearsInBetween * 12 + monthsDiff) + 1;
	    
	    double salaryPerYear = (salary/12)*months;
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
