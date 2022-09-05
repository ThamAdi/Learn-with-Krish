package com.tagamage.springwork.salesmanager.repository;

import java.util.List;

import com.tagamage.springwork.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}