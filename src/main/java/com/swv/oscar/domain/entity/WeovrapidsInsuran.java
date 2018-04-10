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
 * The persistent class for the WEOVRAPIDS_INSURAN database table.
 * 
 */
@Entity
@Table(name="WEOVRAPIDS_INSURAN")
@NamedQuery(name="WeovrapidsInsuran.findAll", query="SELECT w FROM WeovrapidsInsuran w")
public class WeovrapidsInsuran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AP_SSN")
	private String apSsn;

	@Column(name="CARRIER_CODE")
	private String carrierCode;

	@Column(name="CHILD_1_SSN")
	private String child1Ssn;

	@Column(name="CHILD_10_SSN")
	private String child10Ssn;

	@Column(name="CHILD_2_SSN")
	private String child2Ssn;

	@Column(name="CHILD_3_SSN")
	private String child3Ssn;

	@Column(name="CHILD_4_SSN")
	private String child4Ssn;

	@Column(name="CHILD_5_SSN")
	private String child5Ssn;

	@Column(name="CHILD_6_SSN")
	private String child6Ssn;

	@Column(name="CHILD_7_SSN")
	private String child7Ssn;

	@Column(name="CHILD_8_SSN")
	private String child8Ssn;

	@Column(name="CHILD_9_SSN")
	private String child9Ssn;

	@Column(name="CTKR_IN_POLICY_IND")
	private String ctkrInPolicyInd;

	@Column(name="CTKR_SSN")
	private String ctkrSsn;

	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="GROUP_NBR")
	private String groupNbr;

	@Id
	@Column(name="OSCAR_CASE_ID")
	private BigDecimal oscarCaseId;

	@Column(name="PHLDR_ADDRESS")
	private String phldrAddress;

	@Column(name="PHLDR_CITY")
	private String phldrCity;

	@Column(name="PHLDR_FIRST_NAME")
	private String phldrFirstName;

	@Column(name="PHLDR_LAST_NAME")
	private String phldrLastName;

	@Column(name="PHLDR_MID_INIT")
	private String phldrMidInit;

	@Column(name="PHLDR_SSN")
	private String phldrSsn;

	@Column(name="PHLDR_STATE")
	private String phldrState;

	@Column(name="PHLDR_ZIP_CODE")
	private String phldrZipCode;

	@Column(name="POLICY_HOLDER")
	private String policyHolder;

	@Column(name="POLICY_NBR")
	private String policyNbr;

	@Column(name="RAPIDS_CASE_ID")
	private String rapidsCaseId;

	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="TIME_CREATED")
	private Date timeCreated;

	@Column(name="TIME_UPDATED")
	private Date timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovrapidsInsuran() {
	}

	public String getApSsn() {
		return this.apSsn;
	}

	public void setApSsn(String apSsn) {
		this.apSsn = apSsn;
	}

	public String getCarrierCode() {
		return this.carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getChild1Ssn() {
		return this.child1Ssn;
	}

	public void setChild1Ssn(String child1Ssn) {
		this.child1Ssn = child1Ssn;
	}

	public String getChild10Ssn() {
		return this.child10Ssn;
	}

	public void setChild10Ssn(String child10Ssn) {
		this.child10Ssn = child10Ssn;
	}

	public String getChild2Ssn() {
		return this.child2Ssn;
	}

	public void setChild2Ssn(String child2Ssn) {
		this.child2Ssn = child2Ssn;
	}

	public String getChild3Ssn() {
		return this.child3Ssn;
	}

	public void setChild3Ssn(String child3Ssn) {
		this.child3Ssn = child3Ssn;
	}

	public String getChild4Ssn() {
		return this.child4Ssn;
	}

	public void setChild4Ssn(String child4Ssn) {
		this.child4Ssn = child4Ssn;
	}

	public String getChild5Ssn() {
		return this.child5Ssn;
	}

	public void setChild5Ssn(String child5Ssn) {
		this.child5Ssn = child5Ssn;
	}

	public String getChild6Ssn() {
		return this.child6Ssn;
	}

	public void setChild6Ssn(String child6Ssn) {
		this.child6Ssn = child6Ssn;
	}

	public String getChild7Ssn() {
		return this.child7Ssn;
	}

	public void setChild7Ssn(String child7Ssn) {
		this.child7Ssn = child7Ssn;
	}

	public String getChild8Ssn() {
		return this.child8Ssn;
	}

	public void setChild8Ssn(String child8Ssn) {
		this.child8Ssn = child8Ssn;
	}

	public String getChild9Ssn() {
		return this.child9Ssn;
	}

	public void setChild9Ssn(String child9Ssn) {
		this.child9Ssn = child9Ssn;
	}

	public String getCtkrInPolicyInd() {
		return this.ctkrInPolicyInd;
	}

	public void setCtkrInPolicyInd(String ctkrInPolicyInd) {
		this.ctkrInPolicyInd = ctkrInPolicyInd;
	}

	public String getCtkrSsn() {
		return this.ctkrSsn;
	}

	public void setCtkrSsn(String ctkrSsn) {
		this.ctkrSsn = ctkrSsn;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getGroupNbr() {
		return this.groupNbr;
	}

	public void setGroupNbr(String groupNbr) {
		this.groupNbr = groupNbr;
	}

	public BigDecimal getOscarCaseId() {
		return this.oscarCaseId;
	}

	public void setOscarCaseId(BigDecimal oscarCaseId) {
		this.oscarCaseId = oscarCaseId;
	}

	public String getPhldrAddress() {
		return this.phldrAddress;
	}

	public void setPhldrAddress(String phldrAddress) {
		this.phldrAddress = phldrAddress;
	}

	public String getPhldrCity() {
		return this.phldrCity;
	}

	public void setPhldrCity(String phldrCity) {
		this.phldrCity = phldrCity;
	}

	public String getPhldrFirstName() {
		return this.phldrFirstName;
	}

	public void setPhldrFirstName(String phldrFirstName) {
		this.phldrFirstName = phldrFirstName;
	}

	public String getPhldrLastName() {
		return this.phldrLastName;
	}

	public void setPhldrLastName(String phldrLastName) {
		this.phldrLastName = phldrLastName;
	}

	public String getPhldrMidInit() {
		return this.phldrMidInit;
	}

	public void setPhldrMidInit(String phldrMidInit) {
		this.phldrMidInit = phldrMidInit;
	}

	public String getPhldrSsn() {
		return this.phldrSsn;
	}

	public void setPhldrSsn(String phldrSsn) {
		this.phldrSsn = phldrSsn;
	}

	public String getPhldrState() {
		return this.phldrState;
	}

	public void setPhldrState(String phldrState) {
		this.phldrState = phldrState;
	}

	public String getPhldrZipCode() {
		return this.phldrZipCode;
	}

	public void setPhldrZipCode(String phldrZipCode) {
		this.phldrZipCode = phldrZipCode;
	}

	public String getPolicyHolder() {
		return this.policyHolder;
	}

	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}

	public String getPolicyNbr() {
		return this.policyNbr;
	}

	public void setPolicyNbr(String policyNbr) {
		this.policyNbr = policyNbr;
	}

	public String getRapidsCaseId() {
		return this.rapidsCaseId;
	}

	public void setRapidsCaseId(String rapidsCaseId) {
		this.rapidsCaseId = rapidsCaseId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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