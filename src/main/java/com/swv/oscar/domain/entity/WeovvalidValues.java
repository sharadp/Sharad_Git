package com.swv.oscar.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the WEOVVALID_VALUES database table.
 * 
 */
@Entity
@Table(name="WEOVVALID_VALUES")
public class WeovvalidValues implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ARG_CD")
	private String argCd;

	@Column(name="[RESULT]")
	private String result;

	@Column(name="TABLE_NBR")
	private String tableNbr;

	@Column(name="TIME_CREATED")
	private Date timeCreated;

	@Column(name="TIME_UPDATED")
	private Date timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public String getArgCd() {
		return this.argCd;
	}

	public void setArgCd(String argCd) {
		this.argCd = argCd;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTableNbr() {
		return this.tableNbr;
	}

	public void setTableNbr(String tableNbr) {
		this.tableNbr = tableNbr;
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