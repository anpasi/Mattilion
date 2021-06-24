package com.exercises.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.exercises.dao.EmployeeDao;
import com.exercises.dto.Employee;
import com.exercises.util.CustomHibernateDaoSupport;

@Repository("employeeDao")
public class EmployeeDaoImpl  extends CustomHibernateDaoSupport  implements EmployeeDao {

	@Override
	public Employee findBEmployeeId(Long departmentId) {
		return (Employee) getHibernateTemplate().get(Employee.class, departmentId);
	}

	@Override
	public List<Employee> getAll() {
		 return (List<Employee> ) getHibernateTemplate().find("from Employee");
	}

	@Override
	public List<Employee> findByDepartmentAndPayTypeAndEducationLevel(
			String department, String payType, String educationLevel) {
		
		return  (List<Employee> ) getHibernateTemplate().find("from Employee where department.description = ? and position.payType=? and educationLevel = ?",
				Arrays.asList(department,payType, educationLevel).toArray()); 
	}

}
