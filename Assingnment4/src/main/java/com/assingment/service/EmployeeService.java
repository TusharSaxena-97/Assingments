package com.assingment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assingment.model.Employee;
import com.assingment.repository.*;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public List<Employee> getlist()
	{
		return employeerepository.findAll();
	}
	
	public Optional<Employee> GetEmployeeDetail(Long id)
	{
		return employeerepository.findById(id);
	}
	
	public void adddata(Employee employee)
	{
		employeerepository.save(employee);
	}
}
