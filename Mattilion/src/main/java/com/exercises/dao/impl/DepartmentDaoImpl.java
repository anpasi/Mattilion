package com.exercises.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exercises.dao.DepartmentDao;
import com.exercises.dto.Department;
import com.exercises.util.CustomHibernateDaoSupport;


@Repository("departmentDao")
public class DepartmentDaoImpl extends CustomHibernateDaoSupport implements DepartmentDao {

	@Override
	public Department findByDepartmentId(Long departmentId) {
		return (Department) getHibernateTemplate().get(Department.class, departmentId);
	}

	@Override
	public List<Department> getAll() {
		 return (List<Department> ) getHibernateTemplate().loadAll(Department.class);
	}

}
