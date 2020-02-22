package com.company.success.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long empId;
	
	@Column(name="EMPLOYEE_FIRST_NAME")
	private String empFirstName;
	@Column(name="EMPLOYEE_LAST_NAME")
	private String empLastName;
	@Column(name="EMPLOYEE_SALARY")
	private Double empSalary;
	@Column(name="EMPLOYEE_ACTIVE")
	private Boolean empActive;
	@Column(name="EMPLOYEE_RAISE_SALARY")
	private Double empRaiseSalary;
		
	@ManyToOne
	@JoinColumn(name = "ID_DEPARTMENT")
	private Department department;
	
	
	public Double getEmpRaiseSalary() {
		return empRaiseSalary;
	}

	public void setEmpRaiseSalary(Double empRaiseSalary) {
		this.empRaiseSalary = empRaiseSalary;
	}

	public Long getEmpId() {
		return empId;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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
	
	public Employee(Employee employee) {
		super();
		this.empId = employee.getEmpId();
		this.empFirstName = employee.getEmpFirstName();
		this.empLastName = employee.getEmpLastName();
		this.empSalary = employee.getEmpSalary();
		this.empActive = employee.getEmpActive();
		this.department = employee.getDepartment();
	}
	
	
}
