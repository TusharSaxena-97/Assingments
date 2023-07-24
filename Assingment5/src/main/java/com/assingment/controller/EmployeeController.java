package com.assingment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assingment.service.*;
import com.assingment.model.*;

@RestController
@RequestMapping
public class EmployeeController {

	
	@Autowired EmployeeService employeeservice;
	
	@GetMapping("/")
	public ResponseEntity<Employee> DisplayAll()
	{
	    return new ResponseEntity(employeeservice.getall(),HttpStatus.OK);	
	}
	
	@PostMapping("/post")
	public ResponseEntity<Employee> AddData(@RequestBody Employee employee)
	{
		return new ResponseEntity(employeeservice.adddata(employee),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> GetData(@PathVariable("id") long id)
	{
		return new ResponseEntity(employeeservice.getdata(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteData(@PathVariable("id") long id)
	{
		return employeeservice.deletedata(id);
	}
	
	@PutMapping("put/{id}")
	public ResponseEntity<Employee> PutData(@PathVariable("id") long id,@RequestBody Employee employee)
	{
		return new ResponseEntity(employeeservice.putdata(id,employee),HttpStatus.OK);
	}
}
