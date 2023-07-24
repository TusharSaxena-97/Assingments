package com.assingment.service;

import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import com.assingment.model.*;


import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

@Service
public class EmployeeService {
	
	private HashMap<Long, Employee> map = new HashMap<Long,Employee>();
	
	public List<Employee> getall()
	{
		List<Employee> list= new ArrayList<Employee>();
		
		for (Entry<Long, Employee> mapElement : map.entrySet())
		{
           list.add(mapElement.getValue());
		}
		return list;
	}

	public Employee adddata(Employee employee) {
		// TODO Auto-generated method stub
		map.put((long) map.size()+1, employee);
		return employee;
	}

	public Employee getdata(long id) {
	    if(map.containsKey(id))
	    	return map.get(id);
	    else
		  return null;
	}

	public String deletedata(long id) {
		
		if(map.containsKey(id))
		{
			map.remove(id);
			return "Successfully Deleted Employee with "+id;
		}
		else 
		return "No Employee found with the same ID";
	}

	public Employee putdata(long id, Employee employee) {
		if(map.containsKey(id))
		{
			Employee obj = new Employee();
			obj.setName(employee.getName());
			obj.setEmail(employee.getEmail());
			obj.setLocation(employee.getLocation());
			
			map.remove(id);
			map.put(id, employee);
			return map.get(id);
		}
		else 
		 return null;
	}
}
