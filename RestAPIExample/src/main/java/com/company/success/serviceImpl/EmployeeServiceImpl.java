package com.company.success.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.success.entity.Department;
import com.company.success.entity.Employee;
import com.company.success.repository.EmployeeRepository;
import com.company.success.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void AddEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void UpdateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void DeleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> getActiveEmployees() {
		return employeeRepository.findAllByEmpActiveTrue();
	}

	@Override
	public List<Employee> getInActiveEmployees() {
		return employeeRepository.findAllByEmpActiveFalse();
	}

	@Override
	public Optional<Employee> GetEmployeeByName(String empFirstName , String empLastName) {
		return employeeRepository.findByEmpFirstNameAndEmpLastName(empFirstName , empLastName);
	}

	public Optional<Employee> getEmployeeById (Long id) {
		Optional<Employee> emp  = employeeRepository.findById(id);
		if (emp.isPresent()) {
			return emp;
		}
		else return null;
	}

	@Override
	public Optional<Employee> getEmployeeByDepartment(Department department) {
		Optional<Employee> emp  = employeeRepository.findByDepartment(department);
		if (emp.isPresent()) {
			return emp;
		}
		else return null;
	}

	@Override
	public Double raiseSalary(Double raiseSalary,Long id) {
		Optional<Employee> emp  = employeeRepository.findById(id);
		if (emp.isPresent()) {
			emp.get().setEmpRaiseSalary(raiseSalary*emp.get().getEmpSalary());
			return emp.get().getEmpRaiseSalary();
		}
		return null;
	}
}
