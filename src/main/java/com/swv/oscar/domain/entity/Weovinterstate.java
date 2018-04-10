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
 * The persistent class for the WEOVINTERSTATE database table.
 * 
 */
@Entity
@Table(name="WEOVINTERSTATE")
@NamedQuery(name="Weovinterstate.findAll", query="SELECT w FROM Weovinterstate w")
public class Weovinterstate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACK_RECEIVED_DT")
	private Date ackReceivedDt;

	@Column(name="AGENCY_RESP_CD")
	private String agencyRespCd;

	@Column(name="CASE_OOS_IND")
	private String caseOosInd;

	@Column(name="COLL_FIPS_COUNTY")
	private String collFipsCounty;

	@Column(name="COLL_FIPS_STATE")
	private String collFipsState;

	@Column(name="COLL_FIPS_SUFX")
	private String collFipsSufx;

	@Column(name="CRCT_CLRK_SENT_DT")
	private Date crctClrkSentDt;

	@Column(name="INIT_CONTACT_PRSN")
	private String initContactPrsn;

	@Column(name="INIT_FIPS_COUNTY")
	private String initFipsCounty;

	@Column(name="INIT_FIPS_STATE")
	private String initFipsState;

	@Column(name="INIT_FIPS_SUFX")
	private String initFipsSufx;

	@Column(name="OOS_CASE")
	private String oosCase;

	@Column(name="OOS_DOCKET")
	private String oosDocket;

	@Column(name="OOS_EMAIL")
	private String oosEmail;

	@Column(name="OOS_REQUEST_ID")
	private BigDecimal oosRequestId;

	@Column(name="REQUEST_TYPE")
	private String requestType;

	@Column(name="RESP_CONTACT_PRSN")
	private String respContactPrsn;

	@Column(name="RESP_FIPS_COUNTY")
	private String respFipsCounty;

	@Column(name="RESP_FIPS_STATE")
	private String respFipsState;

	@Column(name="RESP_FIPS_SUFX")
	private String respFipsSufx;

	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UFJA_IND")
	private String ufjaInd;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="URESA_MAIL_DT")
	private Date uresaMailDt;

	@Column(name="WV_CA_NBR")
	private String wvCaNbr;

	@Id
	@Column(name="WV_CASE")
	private BigDecimal wvCase;

	@Column(name="WV_URESA_CA_NBR")
	private String wvUresaCaNbr;

	public Weovinterstate() {
	}

	public Date getAckReceivedDt() {
		return this.ackReceivedDt;
	}

	public void setAckReceivedDt(Date ackReceivedDt) {
		this.ackReceivedDt = ackReceivedDt;
	}

	public String getAgencyRespCd() {
		return this.agencyRespCd;
	}

	public void setAgencyRespCd(String agencyRespCd) {
		this.agencyRespCd = agencyRespCd;
	}

	public String getCaseOosInd() {
		return this.caseOosInd;
	}

	public void setCaseOosInd(String caseOosInd) {
		this.caseOosInd = caseOosInd;
	}

	public String getCollFipsCounty() {
		return this.collFipsCounty;
	}

	public void setCollFipsCounty(String collFipsCounty) {
		this.collFipsCounty = collFipsCounty;
	}

	public String getCollFipsState() {
		return this.collFipsState;
	}

	public void setCollFipsState(String collFipsState) {
		this.collFipsState = collFipsState;
	}

	public String getCollFipsSufx() {
		return this.collFipsSufx;
	}

	public void setCollFipsSufx(String collFipsSufx) {
		this.collFipsSufx = collFipsSufx;
	}

	public Date getCrctClrkSentDt() {
		return this.crctClrkSentDt;
	}

	public void setCrctClrkSentDt(Date crctClrkSentDt) {
		this.crctClrkSentDt = crctClrkSentDt;
	}

	public String getInitContactPrsn() {
		return this.initContactPrsn;
	}

	public void setInitContactPrsn(String initContactPrsn) {
		this.initContactPrsn = initContactPrsn;
	}

	public String getInitFipsCounty() {
		return this.initFipsCounty;
	}

	public void setInitFipsCounty(String initFipsCounty) {
		this.initFipsCounty = initFipsCounty;
	}

	public String getInitFipsState() {
		return this.initFipsState;
	}

	public void setInitFipsState(String initFipsState) {
		this.initFipsState = initFipsState;
	}

	public String getInitFipsSufx() {
		return this.initFipsSufx;
	}

	public void setInitFipsSufx(String initFipsSufx) {
		this.initFipsSufx = initFipsSufx;
	}

	public String getOosCase() {
		return this.oosCase;
	}

	public void setOosCase(String oosCase) {
		this.oosCase = oosCase;
	}

	public String getOosDocket() {
		return this.oosDocket;
	}

	public void setOosDocket(String oosDocket) {
		this.oosDocket = oosDocket;
	}

	public String getOosEmail() {
		return this.oosEmail;
	}

	public void setOosEmail(String oosEmail) {
		this.oosEmail = oosEmail;
	}

	public BigDecimal getOosRequestId() {
		return this.oosRequestId;
	}

	public void setOosRequestId(BigDecimal oosRequestId) {
		this.oosRequestId = oosRequestId;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRespContactPrsn() {
		return this.respContactPrsn;
	}

	public void setRespContactPrsn(String respContactPrsn) {
		this.respContactPrsn = respContactPrsn;
	}

	public String getRespFipsCounty() {
		return this.respFipsCounty;
	}

	public void setRespFipsCounty(String respFipsCounty) {
		this.respFipsCounty = respFipsCounty;
	}

	public String getRespFipsState() {
		return this.respFipsState;
	}

	public void setRespFipsState(String respFipsState) {
		this.respFipsState = respFipsState;
	}

	public String getRespFipsSufx() {
		return this.respFipsSufx;
	}

	public void setRespFipsSufx(String respFipsSufx) {
		this.respFipsSufx = respFipsSufx;
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

	public String getUfjaInd() {
		return this.ufjaInd;
	}

	public void setUfjaInd(String ufjaInd) {
		this.ufjaInd = ufjaInd;
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

	public Date getUresaMailDt() {
		return this.uresaMailDt;
	}

	public void setUresaMailDt(Date uresaMailDt) {
		this.uresaMailDt = uresaMailDt;
	}

	public String getWvCaNbr() {
		return this.wvCaNbr;
	}

	public void setWvCaNbr(String wvCaNbr) {
		this.wvCaNbr = wvCaNbr;
	}

	public BigDecimal getWvCase() {
		return this.wvCase;
	}

	public void setWvCase(BigDecimal wvCase) {
		this.wvCase = wvCase;
	}

	public String getWvUresaCaNbr() {
		return this.wvUresaCaNbr;
	}

	public void setWvUresaCaNbr(String wvUresaCaNbr) {
		this.wvUresaCaNbr = wvUresaCaNbr;
	}

}