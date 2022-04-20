package com.mycode.springboot.employeemanagement.dao;

import java.util.List;

import com.mycode.springboot.employeemanagement.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public List<Employee> searchBy(String theName);
}
