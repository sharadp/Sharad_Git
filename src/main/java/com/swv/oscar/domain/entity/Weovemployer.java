package com.swv.oscar.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the WEOVEMPLOYER database table.
 * 
 */
@Entity
@Table(name="WEOVEMPLOYER")
@NamedQuery(name="Weovemployer.findAll", query="SELECT w FROM Weovemployer w")
public class Weovemployer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_1")
	private String address1;

	@Column(name="ADDRESS_2")
	private String address2;

	@Column(name="ADDRESS_3")
	private String address3;

	@Column(name="BUSINESS_NAME")
	private String businessName;

	@Column(name="CITY")
	private String city;

	@Column(name="CLOSED_DATE")
	private Date closedDate;

	@Column(name="COMPANY_TYPE")
	private String companyType;

	@Column(name="CONTACT_PERSON")
	private String contactPerson;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="EIWO")
	private String eiwo;

	@Column(name="EMAIL")
	private String email;

	@Column(name="EMPLOYER_ADDR_TYPE")
	private String employerAddrType;

	@Column(name="EMPLOYER_FED_ID")
	private String employerFedId;

	@Id
	@Column(name="EMPLOYER_ID")
	private String employerId;

	@Column(name="EMPLOYER_NAME")
	private String employerName;

	@Column(name="ERC_PIN")
	private String ercPin;

	@Column(name="FAX")
	private String fax;

	@Column(name="FIPS_COUNTY_CODE")
	private String fipsCountyCode;

	@Column(name="FIPS_STATE_CODE")
	private String fipsStateCode;

	@Column(name="HEALTH_INSU_IND")
	private String healthInsuInd;

	@Column(name="PHONE_EXTN")
	private String phoneExtn;

	@Column(name="PHONE_NBR")
	private String phoneNbr;

	@Column(name="REGISTER_AGENT")
	private String registerAgent;

	@Column(name="[STATE]")
	private String state;

	@Column(name="SUSPEND_BILL")
	private String suspendBill;

	@Column(name="TIME_CREATED")
	private Timestamp timeCreated;

	@Column(name="TIME_UPDATED")
	private Timestamp timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="WV_EMPL_ACCT_NBR")
	private String wvEmplAcctNbr;

	@Column(name="ZIP")
	private String zip;

	public Weovemployer() {
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

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEiwo() {
		return this.eiwo;
	}

	public void setEiwo(String eiwo) {
		this.eiwo = eiwo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployerAddrType() {
		return this.employerAddrType;
	}

	public void setEmployerAddrType(String employerAddrType) {
		this.employerAddrType = employerAddrType;
	}

	public String getEmployerFedId() {
		return this.employerFedId;
	}

	public void setEmployerFedId(String employerFedId) {
		this.employerFedId = employerFedId;
	}

	public String getEmployerId() {
		return this.employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return this.employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getErcPin() {
		return this.ercPin;
	}

	public void setErcPin(String ercPin) {
		this.ercPin = ercPin;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFipsCountyCode() {
		return this.fipsCountyCode;
	}

	public void setFipsCountyCode(String fipsCountyCode) {
		this.fipsCountyCode = fipsCountyCode;
	}

	public String getFipsStateCode() {
		return this.fipsStateCode;
	}

	public void setFipsStateCode(String fipsStateCode) {
		this.fipsStateCode = fipsStateCode;
	}

	public String getHealthInsuInd() {
		return this.healthInsuInd;
	}

	public void setHealthInsuInd(String healthInsuInd) {
		this.healthInsuInd = healthInsuInd;
	}

	public String getPhoneExtn() {
		return this.phoneExtn;
	}

	public void setPhoneExtn(String phoneExtn) {
		this.phoneExtn = phoneExtn;
	}

	public String getPhoneNbr() {
		return this.phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	public String getRegisterAgent() {
		return this.registerAgent;
	}

	public void setRegisterAgent(String registerAgent) {
		this.registerAgent = registerAgent;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSuspendBill() {
		return this.suspendBill;
	}

	public void setSuspendBill(String suspendBill) {
		this.suspendBill = suspendBill;
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

	public String getWvEmplAcctNbr() {
		return this.wvEmplAcctNbr;
	}

	public void setWvEmplAcctNbr(String wvEmplAcctNbr) {
		this.wvEmplAcctNbr = wvEmplAcctNbr;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}