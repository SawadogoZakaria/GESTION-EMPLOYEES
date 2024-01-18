package com.employees.service;

import java.util.List;

import com.employees.entities.Employee;

public interface EmployeeService {
	void createEmployee(Employee e);
	
	List<Employee> getEmployees();
	
	Employee getOneEmployee(long id);

}
