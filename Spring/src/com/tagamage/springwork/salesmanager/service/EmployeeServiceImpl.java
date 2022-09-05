package com.tagamage.springwork.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagamage.springwork.salesmanager.model.Employee;
import com.tagamage.springwork.salesmanager.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	public EmployeeServiceImpl (EmployeeRepository employeeRepository) {
		System.out.println("Overload constructor executed");
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeServiceImpl() {
		System.out.println("Default Constructor executed");
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired");
		this.employeeRepository=employeeRepository;
	}
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
	
	

}
