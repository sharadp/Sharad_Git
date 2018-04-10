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
 * The persistent class for the WEOVADDRESS database table.
 * 
 */
@Entity
@Table(name="WEOVADDRESS")
@NamedQuery(name="Weovaddress.findAll", query="SELECT w FROM Weovaddress w")
public class Weovaddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_1")
	private String address1;

	@Column(name="ADDRESS_2")
	private String address2;

	@Column(name="ADDRESS_3")
	private String address3;

	@Column(name="ADDRESS_SOURCE_CD")
	private String addressSourceCd;

	@Column(name="ADDRESS_TYPE")
	private String addressType;

	@Column(name="CELL_EXTN")
	private String cellExtn;

	@Column(name="CELL_NOTE")
	private String cellNote;

	@Column(name="CELL_PHONE")
	private String cellPhone;

	@Column(name="CITY")
	private String city;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="EMAIL_ADDR")
	private String emailAddr;

	@Column(name="EMAIL_IND")
	private String emailInd;

	@Column(name="EMAIL_NOTE")
	private String emailNote;

	@Column(name="FIPS")
	private String fips;

	@Column(name="HOME_EXTN")
	private String homeExtn;

	@Column(name="HOME_NOTE")
	private String homeNote;

	@Column(name="HOME_PHONE")
	private String homePhone;

	@Column(name="OTHER_EXTN")
	private String otherExtn;

	@Column(name="OTHER_NOTE")
	private String otherNote;

	@Column(name="OTHER_PHONE")
	private String otherPhone;

	@Id
	@Column(name="PIN")
	private BigDecimal pin;

	@Column(name="RLSE_INFO_NAME")
	private String rlseInfoName;

	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="[STATE]")
	private String state;

	@Column(name="STATUS")
	private String status;

	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="USER_VERIFIED")
	private String userVerified;

	@Column(name="VERIFICATION_DATE")
	private Date verificationDate;

	@Column(name="WORK_EXTN")
	private String workExtn;

	@Column(name="WORK_NOTE")
	private String workNote;

	@Column(name="WORK_PHONE")
	private String workPhone;

	@Column(name="ZIP")
	private String zip;

	public Weovaddress() {
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddressSourceCd() {
		return this.addressSourceCd;
	}

	public void setAddressSourceCd(String addressSourceCd) {
		this.addressSourceCd = addressSourceCd;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCellExtn() {
		return this.cellExtn;
	}

	public void setCellExtn(String cellExtn) {
		this.cellExtn = cellExtn;
	}

	public String getCellNote() {
		return this.cellNote;
	}

	public void setCellNote(String cellNote) {
		this.cellNote = cellNote;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmailAddr() {
		return this.emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getEmailInd() {
		return this.emailInd;
	}

	public void setEmailInd(String emailInd) {
		this.emailInd = emailInd;
	}

	public String getEmailNote() {
		return this.emailNote;
	}

	public void setEmailNote(String emailNote) {
		this.emailNote = emailNote;
	}

	public String getFips() {
		return this.fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getHomeExtn() {
		return this.homeExtn;
	}

	public void setHomeExtn(String homeExtn) {
		this.homeExtn = homeExtn;
	}

	public String getHomeNote() {
		return this.homeNote;
	}

	public void setHomeNote(String homeNote) {
		this.homeNote = homeNote;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getOtherExtn() {
		return this.otherExtn;
	}

	public void setOtherExtn(String otherExtn) {
		this.otherExtn = otherExtn;
	}

	public String getOtherNote() {
		return this.otherNote;
	}

	public void setOtherNote(String otherNote) {
		this.otherNote = otherNote;
	}

	public String getOtherPhone() {
		return this.otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public BigDecimal getPin() {
		return this.pin;
	}

	public void setPin(BigDecimal pin) {
		this.pin = pin;
	}

	public String getRlseInfoName() {
		return this.rlseInfoName;
	}

	public void setRlseInfoName(String rlseInfoName) {
		this.rlseInfoName = rlseInfoName;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getUserVerified() {
		return this.userVerified;
	}

	public void setUserVerified(String userVerified) {
		this.userVerified = userVerified;
	}

	public Date getVerificationDate() {
		return this.verificationDate;
	}

	public void setVerificationDate(Date verificationDate) {
		this.verificationDate = verificationDate;
	}

	public String getWorkExtn() {
		return this.workExtn;
	}

	public void setWorkExtn(String workExtn) {
		this.workExtn = workExtn;
	}

	public String getWorkNote() {
		return this.workNote;
	}

	public void setWorkNote(String workNote) {
		this.workNote = workNote;
	}

	public String getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}