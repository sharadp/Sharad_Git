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
 * The persistent class for the WEOVOBLIGATION database table.
 * 
 */
@Entity
@Table(name="WEOVOBLIGATION")
@NamedQuery(name="Weovobligation.findAll", query="SELECT w FROM Weovobligation w")
public class Weovobligation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AMOUNT")
	private Double amount;

	@Column(name="CAN_TYPE")
	private String canType;

	@Id
	@Column(name="CASE_ID")
	private Integer caseId;

	@Column(name="CIVIL_ACTION_NBR")
	private BigDecimal civilActionNbr;

	@Column(name="COMPLETE_IND")
	private String completeInd;

	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="ENTRY_DATE")
	private Date entryDate;

	@Column(name="FREQUENCY")
	private String frequency;

	@Column(name="INACT_RSN")
	private String inactRsn;

	@Column(name="INCL_FROM_DATE")
	private Date inclFromDate;

	@Column(name="INCL_TO_DATE")
	private Date inclToDate;

	@Column(name="JUDG_PAY_AMT")
	private BigDecimal judgPayAmt;

	@Column(name="JUDG_PAY_FREQ")
	private String judgPayFreq;

	@Column(name="OBLIGATION_STATUS")
	private String obligationStatus;

	@Column(name="OBLIGATION_TYPE")
	private String obligationType;

	@Column(name="SEASONAL_AMOUNT")
	private BigDecimal seasonalAmount;

	@Column(name="SEASONAL_END_DT")
	private Date seasonalEndDt;

	@Column(name="SEASONAL_FREQ")
	private String seasonalFreq;

	@Column(name="SEASONAL_START_DT")
	private Date seasonalStartDt;

	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="SUSPEND_DATE")
	private Date suspendDate;

	@Column(name="TIME_CREATED")
	private Date timeCreated;

	@Column(name="TIME_UPDATED")
	private Timestamp timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public Weovobligation() {
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCanType() {
		return this.canType;
	}

	public void setCanType(String canType) {
		this.canType = canType;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public BigDecimal getCivilActionNbr() {
		return this.civilActionNbr;
	}

	public void setCivilActionNbr(BigDecimal civilActionNbr) {
		this.civilActionNbr = civilActionNbr;
	}

	public String getCompleteInd() {
		return this.completeInd;
	}

	public void setCompleteInd(String completeInd) {
		this.completeInd = completeInd;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getInactRsn() {
		return this.inactRsn;
	}

	public void setInactRsn(String inactRsn) {
		this.inactRsn = inactRsn;
	}

	public Date getInclFromDate() {
		return this.inclFromDate;
	}

	public void setInclFromDate(Date inclFromDate) {
		this.inclFromDate = inclFromDate;
	}

	public Date getInclToDate() {
		return this.inclToDate;
	}

	public void setInclToDate(Date inclToDate) {
		this.inclToDate = inclToDate;
	}

	public BigDecimal getJudgPayAmt() {
		return this.judgPayAmt;
	}

	public void setJudgPayAmt(BigDecimal judgPayAmt) {
		this.judgPayAmt = judgPayAmt;
	}

	public String getJudgPayFreq() {
		return this.judgPayFreq;
	}

	public void setJudgPayFreq(String judgPayFreq) {
		this.judgPayFreq = judgPayFreq;
	}

	public String getObligationStatus() {
		return this.obligationStatus;
	}

	public void setObligationStatus(String obligationStatus) {
		this.obligationStatus = obligationStatus;
	}

	public String getObligationType() {
		return this.obligationType;
	}

	public void setObligationType(String obligationType) {
		this.obligationType = obligationType;
	}

	public BigDecimal getSeasonalAmount() {
		return this.seasonalAmount;
	}

	public void setSeasonalAmount(BigDecimal seasonalAmount) {
		this.seasonalAmount = seasonalAmount;
	}

	public Date getSeasonalEndDt() {
		return this.seasonalEndDt;
	}

	public void setSeasonalEndDt(Date seasonalEndDt) {
		this.seasonalEndDt = seasonalEndDt;
	}

	public String getSeasonalFreq() {
		return this.seasonalFreq;
	}

	public void setSeasonalFreq(String seasonalFreq) {
		this.seasonalFreq = seasonalFreq;
	}

	public Date getSeasonalStartDt() {
		return this.seasonalStartDt;
	}

	public void setSeasonalStartDt(Date seasonalStartDt) {
		this.seasonalStartDt = seasonalStartDt;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getSuspendDate() {
		return this.suspendDate;
	}

	public void setSuspendDate(Date suspendDate) {
		this.suspendDate = suspendDate;
	}

	public Date getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
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