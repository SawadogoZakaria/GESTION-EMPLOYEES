package com.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employees.entities.Department;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Vos méthodes de repository peuvent être ajoutées ici
}
