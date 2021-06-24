package com.exercises.bo;

import java.util.List;

import com.exercises.dto.Department;

/**
 * 
 * Business class for Department Entity
 * 
 * 
 * @author Antonio
 *
 */
public interface DepartmentBo {
	
	/***
	 * 
	 * Returns the department by id
	 * 
	 * @param the id of the department
	 * @return
	 */
	Department findByDepartmentId(Long departmentId);
	
	/***
	 * 
	 * Return all departments
	 * @return
	 */
	List<Department> getAll();

}
