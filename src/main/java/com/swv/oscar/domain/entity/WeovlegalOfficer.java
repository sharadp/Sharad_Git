package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVLEGAL_OFFICER database table.
 * 
 */
@Entity
@Table(name="WEOVLEGAL_OFFICER")
@NamedQuery(name="WeovlegalOfficer.findAll", query="SELECT w FROM WeovlegalOfficer w")
public class WeovlegalOfficer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_1")
	private String address1;

	@Column(name="ADDRESS_2")
	private String address2;

	
	@Column(name="BAR_ID")
	private String barId;

	@Column(name="CITY")
	private String city;

	@Column(name="EMAIL")
	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Id
	@Column(name="LEGAL_OFFICER_ID")
	private String legalOfficerId;

	@Column(name="LEGAL_OFFICER_TYPE")
	private String legalOfficerType;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	@Column(name="MOD_NAME")
	private String modName;

	@Column(name="NOTES")
	private String notes;

	@Column(name="OFFICE_NAME")
	private String officeName;

	@Column(name="PHONE_EXTN")
	private String phoneExtn;

	@Column(name="PHONE_NBR")
	private String phoneNbr;

	@Column(name="STATE")
	private String state;

	@Column(name="TIME_CREATED")
	private Timestamp timeCreated;

	@Column(name="TIME_UPDATED")
	private Timestamp timeUpdated;

	@Column(name="TITLE")
	private String title;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="ZIP")
	private String zip;

	public WeovlegalOfficer() {
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

	public String getBarId() {
		return this.barId;
	}

	public void setBarId(String barId) {
		this.barId = barId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLegalOfficerId() {
		return this.legalOfficerId;
	}

	public void setLegalOfficerId(String legalOfficerId) {
		this.legalOfficerId = legalOfficerId;
	}

	public String getLegalOfficerType() {
		return this.legalOfficerType;
	}

	public void setLegalOfficerType(String legalOfficerType) {
		this.legalOfficerType = legalOfficerType;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getModName() {
		return this.modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOfficeName() {
		return this.officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}