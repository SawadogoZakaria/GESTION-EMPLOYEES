package com.employees.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employees.entities.Employee;
import com.employees.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	final private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository ) {
		this.employeeRepository = employeeRepository;
	}

	public void createEmployee(Employee e) {
		this.employeeRepository.save(e);
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getEmployees() {
		
		// TODO Auto-generated method stub
		return this.employeeRepository.findAll();
	}

	public Employee getOneEmployee(long id) {
		// TODO Auto-generated method stub
		return this.employeeRepository.findById(id).get();
	}

}
