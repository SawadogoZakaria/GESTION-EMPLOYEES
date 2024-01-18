package com.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employees.entities.Employee;

import jakarta.transaction.Transactional;
 
@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
 
}
