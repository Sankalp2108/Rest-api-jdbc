package com.employee.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeRepoImpl implements EmployeeRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addEmployee(Employee employee) {
		String query = "INSERT INTO employee VALUES(?,?,?,?)";
		Object[] details = {
				employee.getEmpId(),
				employee.getEmpName(),
				employee.getEmpEmail(),
				employee.getEmpSalary()
		};
		jdbcTemplate.update(query, details);

	}

	@Override
	public void updateByEmployeeId(int id, Employee employee) {
		String query = "UPDATE employee SET empId=?, empName=? , empEmail=? , empSalary=? WHERE empId=?";
		Object[] details = {
				employee.getEmpId(),
				employee.getEmpName(),
				employee.getEmpEmail(),
				employee.getEmpSalary(),
				id
		};
		jdbcTemplate.update(query, details);
	}

	@Override
	public void deleteByEmployeeId(int id) {
		String query = "DELETE FROM employee WHERE empId=?";
		jdbcTemplate.update(query, id);
	}

	@Override
	public List<Employee> readAllEmployee() {
		String query = "SELECT * FROM employee";
		List<Employee> employees = jdbcTemplate.query(query, new EmployeeRowMapper());
		return employees;
	}

	@Override
	public int noOfEmployee() {
		String query = "SELECT COUNT(*) FROM employee";
		int count = jdbcTemplate.queryForObject(query,Integer.class);
		return count;
	}

	@Override
	public void updateEmployeeSalary(int id, Employee salary) {
		String query = "UPDATE employee SET empSalary=? WHERE empId=?";
		jdbcTemplate.update(query, salary.getEmpSalary(),id);
	}

	@Override
	public void updateEmployeeName(int id, Employee name) {
		String query = "UPDATE employee SET empName=? WHERE empId=?";
		jdbcTemplate.update(query, name.getEmpName(),id);	
	}

	@Override
	public void updateEmployeeEmail(int id, Employee email) {
		String query = "UPDATE employee SET empEmail=? WHERE empId=?";
		jdbcTemplate.update(query, email.getEmpEmail(),id);	
	}

	@Override
	public List<Employee> getEmployeeId(int id) {
		String query = "SELECT * FROM employee WHERE empId=?";
		List<Employee> employees = jdbcTemplate.query(query, new EmployeeRowMapper(),id);
		return employees;
	}


}
