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
 * The persistent class for the WEOVPERSON_AP database table.
 * 
 */
@Entity
@Table(name="WEOVPERSON_AP")
@NamedQuery(name="WeovpersonAp.findAll", query="SELECT w FROM WeovpersonAp w")
public class WeovpersonAp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AP_STATUS_CD")
	private String apStatusCd;

	@Column(name="AP_STATUS_EFF_DATE")
	private Date apStatusEffDate;

	@Column(name="BRANCH_OF_SERVICE")
	private String branchOfService;

	@Column(name="DISCHARGE_DATE")
	private Date dischargeDate;

	@Column(name="DRIVERS_LICENS_NBR")
	private String driversLicensNbr;

	@Column(name="DRIVERS_LICENSE_ST")
	private String driversLicenseSt;

	@Column(name="EXP_RELEASE_DT")
	private Date expReleaseDt;

	@Column(name="EYE_COLOR")
	private String eyeColor;

	@Column(name="HAIR_COLOR")
	private String hairColor;

	@Column(name="HEIGHT")
	private BigDecimal height;

	@Column(name="INCARC_IN_DT")
	private Date incarcInDt;

	@Column(name="INCARC_LOCATION")
	private String incarcLocation;

	@Column(name="INCARC_RELEASE_DT")
	private Date incarcReleaseDt;

	@Column(name="INSTIT_LOCATION")
	private String institLocation;

	@Column(name="MULTI_SSN_IND")
	private String multiSsnInd;

	@Column(name="PHYSICAL_MARKINGS")
	private String physicalMarkings;

	@Id
	@Column(name="PIN")
	private BigDecimal pin;

	@Column(name="SERVICE_START_DATE")
	private Date serviceStartDate;

	@Column(name="SERVICE_STATUS")
	private String serviceStatus;

	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="WEIGHT")
	private BigDecimal weight;

	public WeovpersonAp() {
	}

	public String getApStatusCd() {
		return this.apStatusCd;
	}

	public void setApStatusCd(String apStatusCd) {
		this.apStatusCd = apStatusCd;
	}

	public Date getApStatusEffDate() {
		return this.apStatusEffDate;
	}

	public void setApStatusEffDate(Date apStatusEffDate) {
		this.apStatusEffDate = apStatusEffDate;
	}

	public String getBranchOfService() {
		return this.branchOfService;
	}

	public void setBranchOfService(String branchOfService) {
		this.branchOfService = branchOfService;
	}

	public Date getDischargeDate() {
		return this.dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getDriversLicensNbr() {
		return this.driversLicensNbr;
	}

	public void setDriversLicensNbr(String driversLicensNbr) {
		this.driversLicensNbr = driversLicensNbr;
	}

	public String getDriversLicenseSt() {
		return this.driversLicenseSt;
	}

	public void setDriversLicenseSt(String driversLicenseSt) {
		this.driversLicenseSt = driversLicenseSt;
	}

	public Date getExpReleaseDt() {
		return this.expReleaseDt;
	}

	public void setExpReleaseDt(Date expReleaseDt) {
		this.expReleaseDt = expReleaseDt;
	}

	public String getEyeColor() {
		return this.eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getHairColor() {
		return this.hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public Date getIncarcInDt() {
		return this.incarcInDt;
	}

	public void setIncarcInDt(Date incarcInDt) {
		this.incarcInDt = incarcInDt;
	}

	public String getIncarcLocation() {
		return this.incarcLocation;
	}

	public void setIncarcLocation(String incarcLocation) {
		this.incarcLocation = incarcLocation;
	}

	public Date getIncarcReleaseDt() {
		return this.incarcReleaseDt;
	}

	public void setIncarcReleaseDt(Date incarcReleaseDt) {
		this.incarcReleaseDt = incarcReleaseDt;
	}

	public String getInstitLocation() {
		return this.institLocation;
	}

	public void setInstitLocation(String institLocation) {
		this.institLocation = institLocation;
	}

	public String getMultiSsnInd() {
		return this.multiSsnInd;
	}

	public void setMultiSsnInd(String multiSsnInd) {
		this.multiSsnInd = multiSsnInd;
	}

	public String getPhysicalMarkings() {
		return this.physicalMarkings;
	}

	public void setPhysicalMarkings(String physicalMarkings) {
		this.physicalMarkings = physicalMarkings;
	}

	public BigDecimal getPin() {
		return this.pin;
	}

	public void setPin(BigDecimal pin) {
		this.pin = pin;
	}

	public Date getServiceStartDate() {
		return this.serviceStartDate;
	}

	public void setServiceStartDate(Date serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
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

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}