package com.tagamage.springwork.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tagamage.springwork.salesmanager.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
public List<Employee> getAllEmployees(){
		
		List<Employee> employees=new ArrayList<>();
		
		Employee employee= new Employee();
		employee.setEmployeeName("Name1");
		employee.setEmployeeLocation("Location1");
		employees.add(employee);
		return employees;
			
		}

}
