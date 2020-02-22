package com.company.success.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.success.entity.Department;
import com.company.success.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public Optional<Employee> findByEmpFirstNameAndEmpLastName(String empFirstName, String empLastName);
	
	public List<Employee> findAllByEmpActiveTrue();
	
	public List<Employee> findAllByEmpActiveFalse();
	
	public Optional<Employee> findByDepartment(Department department);
}
