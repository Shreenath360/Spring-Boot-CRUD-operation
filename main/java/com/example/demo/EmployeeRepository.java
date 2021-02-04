package com.example.demo;

import org.springframework.data.repository.CrudRepository;  
 
//repository that extends CrudRepository  
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  
{  
}  
