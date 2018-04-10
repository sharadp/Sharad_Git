package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVGRANT_AMOUNT database table.
 * 
 */
@Entity
@Table(name="WEOVGRANT_AMOUNT")
@NamedQuery(name="WeovgrantAmount.findAll", query="SELECT w FROM WeovgrantAmount w")
public class WeovgrantAmount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="GRANT_AMOUNT")
	private BigDecimal grantAmount;

	@Id
	@Column(name="IVA_CASE_ID")
	private String ivaCaseId;

	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="TIME_CREATED")
	private Timestamp timeCreated;

	@Column(name="TIME_UPDATED")
	private Timestamp timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovgrantAmount() {
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getGrantAmount() {
		return this.grantAmount;
	}

	public void setGrantAmount(BigDecimal grantAmount) {
		this.grantAmount = grantAmount;
	}

	public String getIvaCaseId() {
		return this.ivaCaseId;
	}

	public void setIvaCaseId(String ivaCaseId) {
		this.ivaCaseId = ivaCaseId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Timestamp getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Timestamp timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public String getUidCreated() {
		return this.uidCreated;
	}

	public void setUidCreated(String uidCreated) {
		this.uidCreated = uidCreated;
	}

	public String getUidUpdated() {
		return this.uidUpdated;
	}

	public void setUidUpdated(String uidUpdated) {
		this.uidUpdated = uidUpdated;
	}

}