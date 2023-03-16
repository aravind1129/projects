package com.tax.EmployeeTax.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tax.EmployeeTax.model.Employee;
import com.tax.EmployeeTax.model.EmployeePOJO;
import com.tax.EmployeeTax.model.TaxDetails;
import com.tax.EmployeeTax.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	 @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid Employee employee)
	{
		 System.out.println("Aravind");
		if(employee!=null)
		{ 
			 return new ResponseEntity<>(employee, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		 
		
	}
	
	 @PostMapping(value = "/calcualteTax", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TaxDetails> calculateTax(@RequestBody EmployeePOJO employee) throws ParseException
	
	{
		TaxDetails calculateTax = service.calculateTax(employee);
		
		return new ResponseEntity<>(calculateTax, HttpStatus.OK);
	}
	
}
