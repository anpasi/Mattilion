package com.exercises.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercises.bo.DepartmentBo;
import com.exercises.dao.DepartmentDao;
import com.exercises.dto.Department;

/**
 * @author Antonio
 *
 */
@Service("departmentBo")
public class DepartmentBoImpl implements DepartmentBo {
	
	@Autowired
	DepartmentDao departmentDao;

	/* (non-Javadoc)
	 * @see com.mattilion.exercises.bo.DepartmentBo#findByDepartmentId(java.lang.Long)
	 */
	@Override
	public Department findByDepartmentId(Long departmentId) {
		return departmentDao.findByDepartmentId(departmentId);
	}

	@Override
	public List<Department> getAll() {
		return departmentDao.getAll();
	}

}
