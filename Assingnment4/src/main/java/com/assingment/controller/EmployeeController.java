package com.assingment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.assingment.model.Employee;
import com.assingment.service.EmployeeService;

import java.util.*;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/displayAll")
	public ResponseEntity Getlist()
	{
		return new ResponseEntity(employeeservice.getlist(),HttpStatus.OK);
	}
	
	@GetMapping("/display/{id}")
	public ResponseEntity<Employee> FindById(@PathVariable("id") long ID)
	{
		return new ResponseEntity(employeeservice.GetEmployeeDetail(ID), HttpStatus.OK);
	}
	
	@PostMapping("/employee")
	@ResponseBody
	  public String EmployeeSumit(@ModelAttribute Employee employee, Model model) {
		
		employeeservice.adddata(employee);
	    model.addAttribute("employee", employee);
	    System.out.println(employee);
	    return "<html><h1>Successfully Added Data</h1></html>";
	  }
	
	@GetMapping("/")
	public ModelAndView getWelcomePageAsModel() {
	      ModelAndView modelAndView = new ModelAndView();
	      modelAndView.setViewName("index.html");
	      return modelAndView;
	  }
}


