package com.exercises.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.CascadeType;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name ="EMPLOYEE_ID",  unique = true, nullable = false)
	private Long id;

	@Column(name =  "FULL_NAME",  nullable = false)
	private String fullName;
	
	@Column(name =  "FIRST_NAME",  nullable = false)
	private String firstName;
	
	@Column(name =  "LAST_NAME",  nullable = false)
	private String lastName;
	
	@Column(name =  "POSITION_ID",  nullable = false)
	private Long positionId;
	
	@Column(name =  "POSITION_TITLE",  nullable = false)
	private String positionTitle;
	
	@Column(name =  "STORE_ID",  nullable = false)
	private Long storeId;
	
	@Column(name =  "DEPARTMENT_ID",  nullable = false)
	private Long departmentId;
	
	@Column(name =  "BIRTH_DATE",  nullable = false)
	private Date birthDate;
	
	@Column(name =  "HIRE_DATE")
	private Date hireDate;
	
	@Column(name =  "END_DATE")
	private Date endDate;
	
	@Column(name =  "SALARY",  nullable = false)
	private BigDecimal salary;
	
	@Column(name =  "SUPERVISOR_ID")
	private Long supervisorId;
	
	@Column(name =  "EDUCATION_LEVEL",  nullable = false)
	private String educationLevel;
	
	@Column(name =  "MARITAL_STATUS",  nullable = false)
	private String maritalStatus;
	
	@Column(name =  "GENDER",  nullable = false)
	private String gender;
	
	@Column(name =  "MANAGEMENT_ROLE")
	private String managementRole;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "position_id")
	private Position position;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getPositionId() {
		return positionId;
	}


	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}


	public String getPositionTitle() {
		return positionTitle;
	}


	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}


	public Long getStoreId() {
		return storeId;
	}


	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}


	public Long getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	public Long getSupervisorId() {
		return supervisorId;
	}


	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
	}


	public String getEducationLevel() {
		return educationLevel;
	}


	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}


	public String getMaritalStatus() {
		return maritalStatus;
	}


	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getManagementRole() {
		return managementRole;
	}


	public void setManagementRole(String managementRole) {
		this.managementRole = managementRole;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}

	
	
}
