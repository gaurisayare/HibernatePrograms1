package com.gauri.example.HibernateOnetoMany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empdata")
public class Employee2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;
	
	public Employee2(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
