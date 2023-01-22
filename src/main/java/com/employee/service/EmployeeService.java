package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
	void updateByEmployeeId(int id , Employee employee);
	void deleteByEmployeeId(int id);
	List<Employee> readAllEmployee();
	void updateEmployeeSalary(int id , Employee salary);
	void updateEmployeeName(int id , Employee name);
	void updateEmployeeEmail(int id , Employee email);
	List<Employee> getEmployeeId(int id);

}
