package com.mattilion.exercises.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSITION")
public class Position {

	@Id
	@Column(name ="POSITION_ID",  unique = true, nullable = false)
	private Long id;
	
	@Column(name="POSITION_TITLE", nullable = false)
	private String positionTitle;
	
	@Column(name="PAY_TYPE", nullable = false)
	private String payType;
	
	@Column(name="MIN_SCALE", nullable = false)
	private BigDecimal minScale;
	
	@Column(name="MAX_SCALE", nullable = false)
	private BigDecimal maxScale;
	
	@Column(name="MANAGEMENT_ROLE", nullable = false)
	private String managementRole;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public BigDecimal getMinScale() {
		return minScale;
	}

	public void setMinScale(BigDecimal minScale) {
		this.minScale = minScale;
	}

	public BigDecimal getMaxScale() {
		return maxScale;
	}

	public void setMaxScale(BigDecimal maxScale) {
		this.maxScale = maxScale;
	}

	public String getManagementRole() {
		return managementRole;
	}

	public void setManagementRole(String managementRole) {
		this.managementRole = managementRole;
	}
	
	
}
