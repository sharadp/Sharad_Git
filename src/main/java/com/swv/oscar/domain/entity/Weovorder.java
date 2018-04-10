package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVORDER database table.
 * 
 */
@Entity
@Table(name="WEOVORDER")
@NamedQuery(name="Weovorder.findAll", query="SELECT w FROM Weovorder w")
public class Weovorder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AFDC_REIMBURS_IND")
	private String afdcReimbursInd;

	@Column(name="ARREARAGE_IND")
	private String arrearageInd;

	@Id
	@Column(name="CASE_ID")
	private BigDecimal caseId;

	@Column(name="CHILD_SUPPORT_IND")
	private String childSupportInd;

	@Column(name="CIVIL_ACTION_NBR")
	private String civilActionNbr;

	@Column(name="CLOSURE_IND")
	private String closureInd;

	@Column(name="CONTEMPT_IND")
	private String contemptInd;

	@Column(name="CT_REPAY_IND")
	private String ctRepayInd;

	@Column(name="CURR_RECORD_IND")
	private String currRecordInd;

	@Column(name="CUST_VISIT_IND")
	private String custVisitInd;

	@Column(name="DEFAULT_JDG_IND")
	private String defaultJdgInd;

	@Column(name="EDUCATION")
	private String education;

	@Column(name="EST_PARENT_IND")
	private String estParentInd;

	@Column(name="GEN_ORDER_IND")
	private String genOrderInd;

	@Column(name="HEARING_DATE")
	private Date hearingDate;

	@Column(name="HEARING_TIME")
	private String hearingTime;

	@Column(name="INCOME_WITHHOLD")
	private String incomeWithhold;

	@Column(name="JURISD_SERV_IND")
	private String jurisdServInd;

	@Column(name="MEDICAL_IND")
	private String medicalInd;

	@Column(name="MODIFICATION_IND")
	private String modificationInd;

	@Column(name="MULT_DEF_FLAG")
	private String multDefFlag;

	@Column(name="OPEN_PARA_IND")
	private String openParaInd;

	@Column(name="PATERNITY_IND")
	private String paternityInd;

	@Column(name="REIMBURSEMENT_IND")
	private String reimbursementInd;

	@Column(name="SPOUSAL_SPRT_IND")
	private String spousalSprtInd;

	@Column(name="TEMP_ORDER_FLAG")
	private String tempOrderFlag;

	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public Weovorder() {
	}

	public String getAfdcReimbursInd() {
		return this.afdcReimbursInd;
	}

	public void setAfdcReimbursInd(String afdcReimbursInd) {
		this.afdcReimbursInd = afdcReimbursInd;
	}

	public String getArrearageInd() {
		return this.arrearageInd;
	}

	public void setArrearageInd(String arrearageInd) {
		this.arrearageInd = arrearageInd;
	}

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public String getChildSupportInd() {
		return this.childSupportInd;
	}

	public void setChildSupportInd(String childSupportInd) {
		this.childSupportInd = childSupportInd;
	}

	public String getCivilActionNbr() {
		return this.civilActionNbr;
	}

	public void setCivilActionNbr(String civilActionNbr) {
		this.civilActionNbr = civilActionNbr;
	}

	public String getClosureInd() {
		return this.closureInd;
	}

	public void setClosureInd(String closureInd) {
		this.closureInd = closureInd;
	}

	public String getContemptInd() {
		return this.contemptInd;
	}

	public void setContemptInd(String contemptInd) {
		this.contemptInd = contemptInd;
	}

	public String getCtRepayInd() {
		return this.ctRepayInd;
	}

	public void setCtRepayInd(String ctRepayInd) {
		this.ctRepayInd = ctRepayInd;
	}

	public String getCurrRecordInd() {
		return this.currRecordInd;
	}

	public void setCurrRecordInd(String currRecordInd) {
		this.currRecordInd = currRecordInd;
	}

	public String getCustVisitInd() {
		return this.custVisitInd;
	}

	public void setCustVisitInd(String custVisitInd) {
		this.custVisitInd = custVisitInd;
	}

	public String getDefaultJdgInd() {
		return this.defaultJdgInd;
	}

	public void setDefaultJdgInd(String defaultJdgInd) {
		this.defaultJdgInd = defaultJdgInd;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEstParentInd() {
		return this.estParentInd;
	}

	public void setEstParentInd(String estParentInd) {
		this.estParentInd = estParentInd;
	}

	public String getGenOrderInd() {
		return this.genOrderInd;
	}

	public void setGenOrderInd(String genOrderInd) {
		this.genOrderInd = genOrderInd;
	}

	public Date getHearingDate() {
		return this.hearingDate;
	}

	public void setHearingDate(Date hearingDate) {
		this.hearingDate = hearingDate;
	}

	public String getHearingTime() {
		return this.hearingTime;
	}

	public void setHearingTime(String hearingTime) {
		this.hearingTime = hearingTime;
	}

	public String getIncomeWithhold() {
		return this.incomeWithhold;
	}

	public void setIncomeWithhold(String incomeWithhold) {
		this.incomeWithhold = incomeWithhold;
	}

	public String getJurisdServInd() {
		return this.jurisdServInd;
	}

	public void setJurisdServInd(String jurisdServInd) {
		this.jurisdServInd = jurisdServInd;
	}

	public String getMedicalInd() {
		return this.medicalInd;
	}

	public void setMedicalInd(String medicalInd) {
		this.medicalInd = medicalInd;
	}

	public String getModificationInd() {
		return this.modificationInd;
	}

	public void setModificationInd(String modificationInd) {
		this.modificationInd = modificationInd;
	}

	public String getMultDefFlag() {
		return this.multDefFlag;
	}

	public void setMultDefFlag(String multDefFlag) {
		this.multDefFlag = multDefFlag;
	}

	public String getOpenParaInd() {
		return this.openParaInd;
	}

	public void setOpenParaInd(String openParaInd) {
		this.openParaInd = openParaInd;
	}

	public String getPaternityInd() {
		return this.paternityInd;
	}

	public void setPaternityInd(String paternityInd) {
		this.paternityInd = paternityInd;
	}

	public String getReimbursementInd() {
		return this.reimbursementInd;
	}

	public void setReimbursementInd(String reimbursementInd) {
		this.reimbursementInd = reimbursementInd;
	}

	public String getSpousalSprtInd() {
		return this.spousalSprtInd;
	}

	public void setSpousalSprtInd(String spousalSprtInd) {
		this.spousalSprtInd = spousalSprtInd;
	}

	public String getTempOrderFlag() {
		return this.tempOrderFlag;
	}

	public void setTempOrderFlag(String tempOrderFlag) {
		this.tempOrderFlag = tempOrderFlag;
	}

	public String getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}

	public String getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(String timeUpdated) {
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