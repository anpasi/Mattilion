package com.exercises.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercises.bo.DepartmentBo;
import com.exercises.bo.EmployeeBo;
import com.exercises.dto.Department;
import com.exercises.dto.Employee;


public class Sample 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
    	
    	DepartmentBo departmentBo = (DepartmentBo)appContext.getBean("departmentBo");
    	EmployeeBo employeeBo = (EmployeeBo)appContext.getBean("employeeBo");
    	
    	Department department = departmentBo.findByDepartmentId(1l);
    	
    	if (department != null){
    		System.out.println("department 1: " + department.getDescription());
    	}
    	
    	List<Employee> list2 = employeeBo.findByDepartmentAndPayTypeAndEducationLevel("HQ Marketing", "Monthly", "Bachelors Degree");
    	
    	for (Employee e: list2){
    		System.out.println("Employee: " + e.getLastName() + ", " + e.getDepartment().getDescription() + ", " + e.getPositionTitle());
    	}
    }
}
