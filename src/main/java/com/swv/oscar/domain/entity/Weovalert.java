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
 * The persistent class for the WEOVALERT database table.
 * 
 */
@Entity
@Table(name="WEOVALERT")
@NamedQuery(name="Weovalert.findAll", query="SELECT w FROM Weovalert w")
public class Weovalert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ALERT_CATEGORY")
	private String alertCategory;

	@Column(name="ALERT_NUMBER")
	private String alertNumber;

	@Column(name="ALERT_TYPE")
	private String alertType;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="CASE_AFDC_ID")
	private BigDecimal caseAfdcId;

	@Column(name="CASE_AFDC_IND")
	private String caseAfdcInd;

	@Column(name="CASELOAD")
	private String caseload;

	@Column(name="EMPLOYER_FEIN")
	private String employerFein;

	@Column(name="REQUEST_DATE")
	private Date requestDate;

	@Id
	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="RESPONSE_DUE_DATE")
	private Date responseDueDate;

	@Column(name="SCHEDULE_DATE")
	private Date scheduleDate;

	@Column(name="TIME_CREATED")
	private Timestamp timeCreated;

	@Column(name="TIME_UPDATED")
	private Timestamp timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public Weovalert() {
	}

	public String getAlertCategory() {
		return this.alertCategory;
	}

	public void setAlertCategory(String alertCategory) {
		this.alertCategory = alertCategory;
	}

	public String getAlertNumber() {
		return this.alertNumber;
	}

	public void setAlertNumber(String alertNumber) {
		this.alertNumber = alertNumber;
	}

	public String getAlertType() {
		return this.alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public BigDecimal getCaseAfdcId() {
		return this.caseAfdcId;
	}

	public void setCaseAfdcId(BigDecimal caseAfdcId) {
		this.caseAfdcId = caseAfdcId;
	}

	public String getCaseAfdcInd() {
		return this.caseAfdcInd;
	}

	public void setCaseAfdcInd(String caseAfdcInd) {
		this.caseAfdcInd = caseAfdcInd;
	}

	public String getCaseload() {
		return this.caseload;
	}

	public void setCaseload(String caseload) {
		this.caseload = caseload;
	}

	public String getEmployerFein() {
		return this.employerFein;
	}

	public void setEmployerFein(String employerFein) {
		this.employerFein = employerFein;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
	}

	public Date getResponseDueDate() {
		return this.responseDueDate;
	}

	public void setResponseDueDate(Date responseDueDate) {
		this.responseDueDate = responseDueDate;
	}

	public Date getScheduleDate() {
		return this.scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public Timestamp getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Timestamp getTimeUpdated() {
		return this.timeUpdated;
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