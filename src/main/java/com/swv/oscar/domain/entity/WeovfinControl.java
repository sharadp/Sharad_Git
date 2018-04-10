package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVFIN_CONTROL database table.
 * 
 */
@Entity
@Table(name="WEOVFIN_CONTROL")
@NamedQuery(name="WeovfinControl.findAll", query="SELECT w FROM WeovfinControl w")
public class WeovfinControl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CURR_PRD_DATE")
	private Date currPrdDate;

	@Column(name="DRA_START_DATE")
	private Date draStartDate;

	@Column(name="FUT_CONV_DATE")
	private Date futConvDate;

	@Column(name="LAST_AP_BILL_DATE")
	private Date lastApBillDate;

	@Column(name="LAST_DEFRA_DATE")
	private Date lastDefraDate;

	@Column(name="LAST_EMP_BILL_DATE")
	private Date lastEmpBillDate;

	@Column(name="LAST_FC_RUN_DATE")
	private Date lastFcRunDate;

	@Column(name="LAST_IVA_TRANS_DT")
	private Date lastIvaTransDt;

	@Column(name="LAST_OBLG_COMP_TS")
	private String lastOblgCompTs;

	@Column(name="LAST_REPAY_TS")
	private String lastRepayTs;

	@Column(name="PRWORA_START_DT")
	private Date prworaStartDt;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Id
	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovfinControl() {
	}

	public Date getCurrPrdDate() {
		return this.currPrdDate;
	}

	public void setCurrPrdDate(Date currPrdDate) {
		this.currPrdDate = currPrdDate;
	}

	public Date getDraStartDate() {
		return this.draStartDate;
	}

	public void setDraStartDate(Date draStartDate) {
		this.draStartDate = draStartDate;
	}

	public Date getFutConvDate() {
		return this.futConvDate;
	}

	public void setFutConvDate(Date futConvDate) {
		this.futConvDate = futConvDate;
	}

	public Date getLastApBillDate() {
		return this.lastApBillDate;
	}

	public void setLastApBillDate(Date lastApBillDate) {
		this.lastApBillDate = lastApBillDate;
	}

	public Date getLastDefraDate() {
		return this.lastDefraDate;
	}

	public void setLastDefraDate(Date lastDefraDate) {
		this.lastDefraDate = lastDefraDate;
	}

	public Date getLastEmpBillDate() {
		return this.lastEmpBillDate;
	}

	public void setLastEmpBillDate(Date lastEmpBillDate) {
		this.lastEmpBillDate = lastEmpBillDate;
	}

	public Date getLastFcRunDate() {
		return this.lastFcRunDate;
	}

	public void setLastFcRunDate(Date lastFcRunDate) {
		this.lastFcRunDate = lastFcRunDate;
	}

	public Date getLastIvaTransDt() {
		return this.lastIvaTransDt;
	}

	public void setLastIvaTransDt(Date lastIvaTransDt) {
		this.lastIvaTransDt = lastIvaTransDt;
	}

	public String getLastOblgCompTs() {
		return this.lastOblgCompTs;
	}

	public void setLastOblgCompTs(String lastOblgCompTs) {
		this.lastOblgCompTs = lastOblgCompTs;
	}

	public String getLastRepayTs() {
		return this.lastRepayTs;
	}

	public void setLastRepayTs(String lastRepayTs) {
		this.lastRepayTs = lastRepayTs;
	}

	public Date getPrworaStartDt() {
		return this.prworaStartDt;
	}

	public void setPrworaStartDt(Date prworaStartDt) {
		this.prworaStartDt = prworaStartDt;
	}

	public String getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(String timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public String getUidUpdated() {
		return this.uidUpdated;
	}

	public void setUidUpdated(String uidUpdated) {
		this.uidUpdated = uidUpdated;
	}

}