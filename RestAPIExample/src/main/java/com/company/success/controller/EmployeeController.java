package com.company.success.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.success.entity.Employee;
import com.company.success.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/comany/employees")
	public void setEmployee(Employee employee) {
		employeeService.AddEmployee(employee);
	}
	
	@PutMapping("/company/{empId}")
	public void updateEmployee(@RequestBody Employee employee , @PathVariable Long empId) {
		Optional<Employee> emp = employeeService.getEmployeeById(empId);
		if(emp.isPresent()) {
			employeeService.UpdateEmployee(employee);
		}
	}
	
	@GetMapping("/company/get/{empFirstName}")
	public Optional<Employee> getEmployee(@PathVariable String empFirstName, String empLastName) {
		return employeeService.GetEmployeeByName(empFirstName, empLastName);
	}
	
	@DeleteMapping("/company/{empId}")
	public void deleteEmployee(@PathVariable Long empId) {
		employeeService.DeleteEmployee(empId);
	}
	
	@GetMapping("/company/allActiveEmployees")
	public List<Employee> getActiveEmployees(){
		return employeeService.getActiveEmployees();
	}

	@GetMapping("/company/allInActiveEmployees")
	public List<Employee> getInActiveEmployees(){
		return employeeService.getInActiveEmployees();
	}
	

}
