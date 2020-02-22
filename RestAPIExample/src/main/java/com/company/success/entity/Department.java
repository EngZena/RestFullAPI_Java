package com.company.success.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long depId;
	@Column(name="DEP_NAME")
	private String depName;
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
	
}
