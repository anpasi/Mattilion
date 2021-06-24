package com.exercises.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * Entity for deparments
 * @author Antonio
 *
 */
@Entity
@Table(name = "DEPARTMENT")
public class Department {
	
	@Id
	@Column(name = "DEPARTMENT_ID", unique = true, nullable = false)
	private Long departmentId;
	
	@Column(name = "DEPARTMENT_DESCRIPTION",  nullable = false)
	private String description;

	public Long getDepartmentIdId() {
		return departmentId;
	}

	public void setDepartmentIdId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
