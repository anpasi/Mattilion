package com.exercises.bo;

import java.util.List;

import com.exercises.dto.Employee;


/**
 * 
 * Business class for Employee Entity
 * 
 * 
 * @author Antonio
 *
 */
public interface EmployeeBo {
	
	/***
	 * 
	 * Returns the employee by id
	 * 
	 * @param the id of the employee
	 * @return
	 */
	Employee findByEmployeeId(Long employeeId);
	
	/***
	 * 
	 * Return all employees
	 * @return
	 */
	List<Employee> getAll();

	/***
	 * 
	 * Return a list of employees by department, pay type and education level
	 * @return
	 */
	List<Employee> findByDepartmentAndPayTypeAndEducationLevel(String department, String payType, String educationLevel);
	
}
