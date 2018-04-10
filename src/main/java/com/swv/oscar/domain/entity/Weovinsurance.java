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
 * The persistent class for the WEOVINSURANCE database table.
 * 
 */
@Entity
@Table(name="WEOVINSURANCE")
@NamedQuery(name="Weovinsurance.findAll", query="SELECT w FROM Weovinsurance w")
public class Weovinsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CASE_ID")
	private BigDecimal caseId;

	@Column(name="CHILD_PIN_1")
	private BigDecimal childPin1;

	@Column(name="CHILD_PIN_10")
	private BigDecimal childPin10;

	@Column(name="CHILD_PIN_11")
	private BigDecimal childPin11;

	@Column(name="CHILD_PIN_12")
	private BigDecimal childPin12;

	@Column(name="CHILD_PIN_13")
	private BigDecimal childPin13;

	@Column(name="CHILD_PIN_14")
	private BigDecimal childPin14;

	@Column(name="CHILD_PIN_15")
	private BigDecimal childPin15;

	@Column(name="CHILD_PIN_2")
	private BigDecimal childPin2;

	@Column(name="CHILD_PIN_3")
	private BigDecimal childPin3;

	@Column(name="CHILD_PIN_4")
	private BigDecimal childPin4;

	@Column(name="CHILD_PIN_5")
	private BigDecimal childPin5;

	@Column(name="CHILD_PIN_6")
	private BigDecimal childPin6;

	@Column(name="CHILD_PIN_7")
	private BigDecimal childPin7;

	@Column(name="CHILD_PIN_8")
	private BigDecimal childPin8;

	@Column(name="CHILD_PIN_9")
	private BigDecimal childPin9;

	@Column(name="CIVIL_ACTION_NBR")
	private String civilActionNbr;

	@Column(name="CONTACT_FAX")
	private String contactFax;

	@Column(name="CONTACT_NAME")
	private String contactName;

	@Column(name="CONTACT_PHONE")
	private String contactPhone;

	@Column(name="COVERAGE_TYPE")
	private String coverageType;

	@Column(name="CT_MAIL_DATE")
	private Date ctMailDate;

	@Column(name="EMPLOYER_FEIN")
	private String employerFein;

	@Column(name="EMPLOYER_RESP_CD")
	private String employerRespCd;

	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="EXCLUSION_CODE")
	private String exclusionCode;

	@Column(name="GROUP_NBR")
	private String groupNbr;

	@Column(name="HOLDER_PIN")
	private BigDecimal holderPin;

	@Id
	@Column(name="INSURANCE_CO_CODE")
	private String insuranceCoCode;

	@Column(name="NMSN_MAIL_DATE")
	private Date nmsnMailDate;

	@Column(name="NMSN_RESPONSE_DT")
	private Date nmsnResponseDt;

	@Column(name="NOTE")
	private String note;

	@Column(name="PLAN_ADMIN_RESP_CD")
	private String planAdminRespCd;

	@Column(name="PLAN_CHOSEN_BY")
	private String planChosenBy;

	@Column(name="PLAN_OPTION")
	private String planOption;

	@Column(name="POLICY_NBR")
	private String policyNbr;

	@Column(name="POLICYHOLDER_TYPE")
	private String policyholderType;

	@Column(name="PRIMARY_POLICY_IND")
	private String primaryPolicyInd;

	@Column(name="SOURCE")
	private String source;

	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="STATUS")
	private String status;

	@Id
	@Column(name="TIME_CREATED")
	private Date timeCreated;

	@Column(name="TIME_UPDATED")
	private Date timeUpdated;

	@Column(name="TRD_PRTY_FRST_NAME")
	private String trdPrtyFrstName;

	@Column(name="TRD_PRTY_LAST_NAME")
	private String trdPrtyLastName;

	@Column(name="TRD_PRTY_MID_INIT")
	private String trdPrtyMidInit;

	@Column(name="TRD_PRTY_MOD_NAME")
	private String trdPrtyModName;

	@Column(name="TRNA_DATE")
	private Date trnaDate;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="WAITING_PRD_DATE")
	private Date waitingPrdDate;

	public Weovinsurance() {
	}

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public BigDecimal getChildPin1() {
		return this.childPin1;
	}

	public void setChildPin1(BigDecimal childPin1) {
		this.childPin1 = childPin1;
	}

	public BigDecimal getChildPin10() {
		return this.childPin10;
	}

	public void setChildPin10(BigDecimal childPin10) {
		this.childPin10 = childPin10;
	}

	public BigDecimal getChildPin11() {
		return this.childPin11;
	}

	public void setChildPin11(BigDecimal childPin11) {
		this.childPin11 = childPin11;
	}

	public BigDecimal getChildPin12() {
		return this.childPin12;
	}

	public void setChildPin12(BigDecimal childPin12) {
		this.childPin12 = childPin12;
	}

	public BigDecimal getChildPin13() {
		return this.childPin13;
	}

	public void setChildPin13(BigDecimal childPin13) {
		this.childPin13 = childPin13;
	}

	public BigDecimal getChildPin14() {
		return this.childPin14;
	}

	public void setChildPin14(BigDecimal childPin14) {
		this.childPin14 = childPin14;
	}

	public BigDecimal getChildPin15() {
		return this.childPin15;
	}

	public void setChildPin15(BigDecimal childPin15) {
		this.childPin15 = childPin15;
	}

	public BigDecimal getChildPin2() {
		return this.childPin2;
	}

	public void setChildPin2(BigDecimal childPin2) {
		this.childPin2 = childPin2;
	}

	public BigDecimal getChildPin3() {
		return this.childPin3;
	}

	public void setChildPin3(BigDecimal childPin3) {
		this.childPin3 = childPin3;
	}

	public BigDecimal getChildPin4() {
		return this.childPin4;
	}

	public void setChildPin4(BigDecimal childPin4) {
		this.childPin4 = childPin4;
	}

	public BigDecimal getChildPin5() {
		return this.childPin5;
	}

	public void setChildPin5(BigDecimal childPin5) {
		this.childPin5 = childPin5;
	}

	public BigDecimal getChildPin6() {
		return this.childPin6;
	}

	public void setChildPin6(BigDecimal childPin6) {
		this.childPin6 = childPin6;
	}

	public BigDecimal getChildPin7() {
		return this.childPin7;
	}

	public void setChildPin7(BigDecimal childPin7) {
		this.childPin7 = childPin7;
	}

	public BigDecimal getChildPin8() {
		return this.childPin8;
	}

	public void setChildPin8(BigDecimal childPin8) {
		this.childPin8 = childPin8;
	}

	public BigDecimal getChildPin9() {
		return this.childPin9;
	}

	public void setChildPin9(BigDecimal childPin9) {
		this.childPin9 = childPin9;
	}

	public String getCivilActionNbr() {
		return this.civilActionNbr;
	}

	public void setCivilActionNbr(String civilActionNbr) {
		this.civilActionNbr = civilActionNbr;
	}

	public String getContactFax() {
		return this.contactFax;
	}

	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getCoverageType() {
		return this.coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public Date getCtMailDate() {
		return this.ctMailDate;
	}

	public void setCtMailDate(Date ctMailDate) {
		this.ctMailDate = ctMailDate;
	}

	public String getEmployerFein() {
		return this.employerFein;
	}

	public void setEmployerFein(String employerFein) {
		this.employerFein = employerFein;
	}

	public String getEmployerRespCd() {
		return this.employerRespCd;
	}

	public void setEmployerRespCd(String employerRespCd) {
		this.employerRespCd = employerRespCd;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExclusionCode() {
		return this.exclusionCode;
	}

	public void setExclusionCode(String exclusionCode) {
		this.exclusionCode = exclusionCode;
	}

	public String getGroupNbr() {
		return this.groupNbr;
	}

	public void setGroupNbr(String groupNbr) {
		this.groupNbr = groupNbr;
	}

	public BigDecimal getHolderPin() {
		return this.holderPin;
	}

	public void setHolderPin(BigDecimal holderPin) {
		this.holderPin = holderPin;
	}

	public String getInsuranceCoCode() {
		return this.insuranceCoCode;
	}

	public void setInsuranceCoCode(String insuranceCoCode) {
		this.insuranceCoCode = insuranceCoCode;
	}

	public Date getNmsnMailDate() {
		return this.nmsnMailDate;
	}

	public void setNmsnMailDate(Date nmsnMailDate) {
		this.nmsnMailDate = nmsnMailDate;
	}

	public Date getNmsnResponseDt() {
		return this.nmsnResponseDt;
	}

	public void setNmsnResponseDt(Date nmsnResponseDt) {
		this.nmsnResponseDt = nmsnResponseDt;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPlanAdminRespCd() {
		return this.planAdminRespCd;
	}

	public void setPlanAdminRespCd(String planAdminRespCd) {
		this.planAdminRespCd = planAdminRespCd;
	}

	public String getPlanChosenBy() {
		return this.planChosenBy;
	}

	public void setPlanChosenBy(String planChosenBy) {
		this.planChosenBy = planChosenBy;
	}

	public String getPlanOption() {
		return this.planOption;
	}

	public void setPlanOption(String planOption) {
		this.planOption = planOption;
	}

	public String getPolicyNbr() {
		return this.policyNbr;
	}

	public void setPolicyNbr(String policyNbr) {
		this.policyNbr = policyNbr;
	}

	public String getPolicyholderType() {
		return this.policyholderType;
	}

	public void setPolicyholderType(String policyholderType) {
		this.policyholderType = policyholderType;
	}

	public String getPrimaryPolicyInd() {
		return this.primaryPolicyInd;
	}

	public void setPrimaryPolicyInd(String primaryPolicyInd) {
		this.primaryPolicyInd = primaryPolicyInd;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Date getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(Date timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public String getTrdPrtyFrstName() {
		return this.trdPrtyFrstName;
	}

	public void setTrdPrtyFrstName(String trdPrtyFrstName) {
		this.trdPrtyFrstName = trdPrtyFrstName;
	}

	public String getTrdPrtyLastName() {
		return this.trdPrtyLastName;
	}

	public void setTrdPrtyLastName(String trdPrtyLastName) {
		this.trdPrtyLastName = trdPrtyLastName;
	}

	public String getTrdPrtyMidInit() {
		return this.trdPrtyMidInit;
	}

	public void setTrdPrtyMidInit(String trdPrtyMidInit) {
		this.trdPrtyMidInit = trdPrtyMidInit;
	}

	public String getTrdPrtyModName() {
		return this.trdPrtyModName;
	}

	public void setTrdPrtyModName(String trdPrtyModName) {
		this.trdPrtyModName = trdPrtyModName;
	}

	public Date getTrnaDate() {
		return this.trnaDate;
	}

	public void setTrnaDate(Date trnaDate) {
		this.trnaDate = trnaDate;
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

	public Date getWaitingPrdDate() {
		return this.waitingPrdDate;
	}

	public void setWaitingPrdDate(Date waitingPrdDate) {
		this.waitingPrdDate = waitingPrdDate;
	}

}