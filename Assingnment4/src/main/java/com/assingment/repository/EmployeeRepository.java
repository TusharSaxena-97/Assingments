package com.assingment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assingment.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
