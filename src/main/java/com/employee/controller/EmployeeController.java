package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//Getting the Employee details
	@GetMapping("/employee")
	public List<Employee> readAllEmployee()
	{
		return employeeService.readAllEmployee();
	}
	
	//Get Employee By Id
	@GetMapping("/employee/{id}")
	public List<Employee> getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeId(id);
	}
	
	
	//Adding the employee
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) 
	{
		employeeService.addEmployee(employee);
		return  "Successfully added";
	}
	
	//Deleting the employee by employeeid
	@DeleteMapping("/employee/{id}")
	public String deleteByEmployeeId(@PathVariable int id)
	{
		employeeService.deleteByEmployeeId(id);
		return "Successfully Deleted";
	}
	
	@PutMapping("/employee/update/{id}")
	public String updateByEmployeeId(@PathVariable int id , @RequestBody Employee employee)
	{
		employeeService.updateByEmployeeId(id, employee);
		return "Employee Details Updated Successfully";
		
	}
	
	@PatchMapping("/employee/salary/{id}")
	public String updateEmployeeSalary(@PathVariable int id , @RequestBody Employee salary)
	{
		employeeService.updateEmployeeSalary(id, salary);
		return "successfully updated Salary";
	}
	
	@PatchMapping("/employee/name/{id}")
	public String updateEmployeeName(@PathVariable int id , @RequestBody Employee name)
	{
		employeeService.updateEmployeeName(id, name);
		return "successfully updated Salary";
	}
	
	@PatchMapping("/employee/email/{id}")
	public String updateEmployeeEmail(@PathVariable int id , @RequestBody Employee email)
	{
		employeeService.updateEmployeeEmail(id, email);
		return "successfully updated Salary";
	}
	
}
