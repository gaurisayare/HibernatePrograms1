package com.gauri.example.HibernateOnetoMany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int id;
	
	@Column(name="dept_name")
	private String name;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private List<Employee2> employees=new ArrayList<Employee2>();

	public Department(int id, String name, List<Employee2> employees) {
		super();
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

	public Department() {
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

	public List<Employee2> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee2> employees) {
		this.employees = employees;
	}
		

	
}
