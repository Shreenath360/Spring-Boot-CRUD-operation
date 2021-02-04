package com.example.demo;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;



 
@RestController  
public class EmployeeController   
{  

@Autowired  
EmployeeService employeeService;  
 
@GetMapping("/employee")  
private List<Employee> getAllEmployee()   
{  
return employeeService.getAllEmployee();  
}  

@GetMapping("/employee/{employeeid}")  
private Employee getBooks(@PathVariable("employeeid") int employeeid)   
{  
return employeeService.getEmployeeById(employeeid);  
}  

@DeleteMapping("/employee/{employeeid}")  
private void deleteBook(@PathVariable("employeeid") int employeeid)   
{  
	employeeService.delete(employeeid);  
}  
 
@PostMapping("/employee")  
private int saveBook(@RequestBody Employee employee)   
{  
	employeeService.saveOrUpdate(employee);  
return employee.getEmployeeid();  
}  

@PutMapping("/employee")  
private Employee update(@RequestBody Employee employee)   
{  
	employeeService.saveOrUpdate(employee);  
return employee;  
}  
}  
