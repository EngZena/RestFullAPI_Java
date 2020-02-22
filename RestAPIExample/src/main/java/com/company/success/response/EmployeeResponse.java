package com.company.success.response;

import javax.persistence.Column;

import com.company.success.entity.Department;
import com.company.success.entity.Employee;

public class EmployeeResponse {

	
private Long empId;
	
	
	private String empFirstName;
	private String empLastName;
	private Double empSalary;
	private Boolean empActive;
	private Department department;
	
	
	
	public Long getEmpId() {
		return empId;
	}



	public void setEmpId(Long empId) {
		this.empId = empId;
	}



	public String getEmpFirstName() {
		return empFirstName;
	}



	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}



	public String getEmpLastName() {
		return empLastName;
	}



	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}



	public Double getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}



	public Boolean getEmpActive() {
		return empActive;
	}



	public void setEmpActive(Boolean empActive) {
		this.empActive = empActive;
	}




	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public EmployeeResponse(Employee employee) {
		super();
		this.empId = employee.getEmpId();
		this.empFirstName = employee.getEmpFirstName();
		this.empLastName = employee.getEmpLastName();
		this.empSalary = employee.getEmpSalary();
		this.empActive = employee.getEmpActive();
		this.department = employee.getDepartment();
	}
}
