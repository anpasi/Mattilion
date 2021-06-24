package com.exercises.common;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercises.bo.EmployeeBo;
import com.exercises.dto.Employee;

public class SecondExercise {

	public static void main(String[] args) {
		
		ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	    	
		EmployeeBo employeeBo = (EmployeeBo)appContext.getBean("employeeBo");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the department: ");
		String department= scanner.nextLine();
	    	
		System.out.println("Enter pay type: ");
		String payType = scanner.nextLine();
		
		
		System.out.println("Enter education level: ");
		String educationLevel = scanner.nextLine();

		List<Employee> employees = employeeBo.findByDepartmentAndPayTypeAndEducationLevel(department, payType, educationLevel);
    	
    	for (Employee employee: employees){
    		System.out.println("Employee: " + employee.getLastName() + ", " 
    				+ employee.getDepartment().getDescription()
    				+ ", " + employee.getPositionTitle());
    	}
		
		

	}

}
