package com.company.success.service;

import java.util.List;
import java.util.Optional;

import com.company.success.entity.Department;
import com.company.success.entity.Employee;

public interface EmployeeService {
	
	public void AddEmployee(Employee employee);
	
	public void UpdateEmployee(Employee employee);
	
	public void DeleteEmployee(Long id);
	
	public List<Employee> getActiveEmployees();
	
	public List<Employee> getInActiveEmployees();
	
	public Optional<Employee> GetEmployeeByName(String empFirstName , String empLastName);
	
	//public Employee GetEmployeeByDepartment(String department);

	public Optional<Employee> getEmployeeById (Long id);
	
	public Optional<Employee> getEmployeeByDepartment(Department department);
	
	public Double raiseSalary(Double raiseSalary, Long id);
}
