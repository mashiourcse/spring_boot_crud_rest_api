package com.codemyth.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codemyth.model.Employee;

import jakarta.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	/*
	 * Employee findByCity(String city);
	 * 
	 * Optional<List<Employee>> findByEmpageGreaterThan(int age);
	 */
	
//	Employee findByCity(String city);
	
}
