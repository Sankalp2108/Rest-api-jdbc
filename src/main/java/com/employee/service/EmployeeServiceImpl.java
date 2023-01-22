package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;


	@Override
	public List<Employee> readAllEmployee() {
		return employeeRepo.readAllEmployee();
	}


	@Override
	public void addEmployee(Employee employee) {
		employeeRepo.addEmployee(employee);		
	}


	@Override
	public void deleteByEmployeeId(int id) {
		employeeRepo.deleteByEmployeeId(id);
		
	}


	@Override
	public void updateByEmployeeId(int id, Employee employee) {
		employeeRepo.updateByEmployeeId(id, employee);
		
	}


	@Override
	public void updateEmployeeSalary(int id, Employee salary) {
		employeeRepo.updateEmployeeSalary(id, salary);
	}


	@Override
	public void updateEmployeeName(int id, Employee name) {
		employeeRepo.updateEmployeeName(id, name);
		
	}

	@Override
	public void updateEmployeeEmail(int id, Employee email) {
		employeeRepo.updateEmployeeEmail(id, email);
		
	}


	@Override
	public List<Employee> getEmployeeId(int id) {
		return employeeRepo.getEmployeeId(id);
	}


}
