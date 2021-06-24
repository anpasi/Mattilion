package com.exercises.dao;

import java.util.List;

import com.exercises.dto.Department;


/***
 * 
 * DAO for Department entity
 * 
 * @author Antonio
 *
 */
public interface DepartmentDao {
	
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
	 * @return
	 */
	List<Department> getAll();

}
