package com.mattilion.exercises.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mattilion.exercises.bo.EmployeeBo;
import com.mattilion.exercises.dao.EmployeeDao;
import com.mattilion.exercises.dto.Employee;

@Service("employeeBo")
public class EmployeeBoImpl implements EmployeeBo {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee findByEmployeeId(Long employeeId) {
		return employeeDao.findBEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	@Override
	public List<Employee> findByDepartmentAndPayTypeAndEducationLevel(
			String department, String payType, String educationLevel) {
		return employeeDao.findByDepartmentAndPayTypeAndEducationLevel(department, payType, educationLevel);
	}

}
