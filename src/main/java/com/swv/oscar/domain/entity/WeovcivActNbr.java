package com.swv.oscar.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the WEOVCIV_ACT_NBR database table.
 * 
 */
@Entity
@Table(name="WEOVCIV_ACT_NBR")
@NamedQuery(name="WeovcivActNbr.findAll", query="SELECT w FROM WeovcivActNbr w")
public class WeovcivActNbr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CASE_ID")
	private String caseId;

	@Column(name="CEJ_IND")
	private String cejInd;

	@Column(name="CIVIL_ACTION_NBR")
	private BigDecimal civilActionNbr;

	@Column(name="CIVIL_ACTION_STAT")
	private String civilActionStat;

	@Column(name="COUNTY_FIPS")
	private String countyFips;

	@Column(name="DEFENDANT_IND")
	private String defendantInd;

	@Column(name="DEFENDANT_PIN")
	private String defendantPin;

	@Column(name="INACTIVE_REASON")
	private String inactiveReason;

	@Column(name="MED_ORDERED_DATE")
	private String medOrderedDate;

	@Column(name="MPLOYER_ID")
	private String mployerId;

	@Column(name="MULTI_DEFEND_IND")
	private String multiDefendInd;

	@Column(name="OOS_CIV_ACT_NBR")
	private String oosCivActNbr;

	@Column(name="OTHER_CASE_ID")
	private String otherCaseId;

	@Column(name="PETITIONER_IND")
	private String petitionerInd;

	@Column(name="PLAINTIFF_IND")
	private String plaintiffInd;

	@Column(name="PLAINTIFF_PIN")
	private String plaintiffPin;

	@Column(name="REGISTRATION_RSN")
	private String registrationRsn;

	@Column(name="REVIEW_DATE")
	private String reviewDate;

	@Column(name="REVIEW_RSN_CD")
	private String reviewRsnCd;

	@Column(name="STATE_FIPS")
	private String stateFips;

	@Column(name="TIME_CREATED")
	private Timestamp timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovcivActNbr() {
	}

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCejInd() {
		return this.cejInd;
	}

	public void setCejInd(String cejInd) {
		this.cejInd = cejInd;
	}

	public BigDecimal getCivilActionNbr() {
		return this.civilActionNbr;
	}

	public void setCivilActionNbr(BigDecimal civilActionNbr) {
		this.civilActionNbr = civilActionNbr;
	}

	public String getCivilActionStat() {
		return this.civilActionStat;
	}

	public void setCivilActionStat(String civilActionStat) {
		this.civilActionStat = civilActionStat;
	}

	public String getCountyFips() {
		return this.countyFips;
	}

	public void setCountyFips(String countyFips) {
		this.countyFips = countyFips;
	}

	public String getDefendantInd() {
		return this.defendantInd;
	}

	public void setDefendantInd(String defendantInd) {
		this.defendantInd = defendantInd;
	}

	public String getDefendantPin() {
		return this.defendantPin;
	}

	public void setDefendantPin(String defendantPin) {
		this.defendantPin = defendantPin;
	}

	public String getInactiveReason() {
		return this.inactiveReason;
	}

	public void setInactiveReason(String inactiveReason) {
		this.inactiveReason = inactiveReason;
	}

	public String getMedOrderedDate() {
		return this.medOrderedDate;
	}

	public void setMedOrderedDate(String medOrderedDate) {
		this.medOrderedDate = medOrderedDate;
	}

	public String getMployerId() {
		return this.mployerId;
	}

	public void setMployerId(String mployerId) {
		this.mployerId = mployerId;
	}

	public String getMultiDefendInd() {
		return this.multiDefendInd;
	}

	public void setMultiDefendInd(String multiDefendInd) {
		this.multiDefendInd = multiDefendInd;
	}

	public String getOosCivActNbr() {
		return this.oosCivActNbr;
	}

	public void setOosCivActNbr(String oosCivActNbr) {
		this.oosCivActNbr = oosCivActNbr;
	}

	public String getOtherCaseId() {
		return this.otherCaseId;
	}

	public void setOtherCaseId(String otherCaseId) {
		this.otherCaseId = otherCaseId;
	}

	public String getPetitionerInd() {
		return this.petitionerInd;
	}

	public void setPetitionerInd(String petitionerInd) {
		this.petitionerInd = petitionerInd;
	}

	public String getPlaintiffInd() {
		return this.plaintiffInd;
	}

	public void setPlaintiffInd(String plaintiffInd) {
		this.plaintiffInd = plaintiffInd;
	}

	public String getPlaintiffPin() {
		return this.plaintiffPin;
	}

	public void setPlaintiffPin(String plaintiffPin) {
		this.plaintiffPin = plaintiffPin;
	}

	public String getRegistrationRsn() {
		return this.registrationRsn;
	}

	public void setRegistrationRsn(String registrationRsn) {
		this.registrationRsn = registrationRsn;
	}

	public String getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewRsnCd() {
		return this.reviewRsnCd;
	}

	public void setReviewRsnCd(String reviewRsnCd) {
		this.reviewRsnCd = reviewRsnCd;
	}

	public String getStateFips() {
		return this.stateFips;
	}

	public void setStateFips(String stateFips) {
		this.stateFips = stateFips;
	}

	public Timestamp getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
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