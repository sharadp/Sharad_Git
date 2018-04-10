package com.swv.oscar.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WEOVCIV_ACT_CHILD database table.
 * 
 */
@Entity
@Table(name="WEOVCIV_ACT_CHILD")
@NamedQuery(name="WeovcivActChild.findAll", query="SELECT w FROM WeovcivActChild w")
public class WeovcivActChild implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CASE_ID")
	private BigDecimal caseId;

	@Column(name="CHILD_PIN")
	private BigDecimal childPin;

	@Column(name="CIVIL_ACTION_NBR")
	private String civilActionNbr;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovcivActChild() {
	}

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public BigDecimal getChildPin() {
		return this.childPin;
	}

	public void setChildPin(BigDecimal childPin) {
		this.childPin = childPin;
	}

	public String getCivilActionNbr() {
		return this.civilActionNbr;
	}

	public void setCivilActionNbr(String civilActionNbr) {
		this.civilActionNbr = civilActionNbr;
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