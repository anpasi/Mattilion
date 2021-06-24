package com.exercises.dao;

import java.util.List;

import com.exercises.dto.Employee;

public interface EmployeeDao {
	
	/***
	 * 
	 * Returns the employee by id
	 * 
	 * @param the id of the department
	 * @return
	 */
	Employee findBEmployeeId(Long employeeId);

	
	/***
	 * Returns all employees
	 * @return
	 */
	List<Employee> getAll();
	
	
	/***
	 * 
	 * Return a list of employees by department, pay type and education level
	 * @return
	 */
	List<Employee> findByDepartmentAndPayTypeAndEducationLevel(
			String department, String payType, String educationLevel);

}
