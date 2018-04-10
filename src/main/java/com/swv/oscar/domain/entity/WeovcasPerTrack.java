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
 * The persistent class for the WEOVCAS_PER_TRACK database table.
 * 
 */
@Entity
@Table(name="WEOVCAS_PER_TRACK")
@NamedQuery(name="WeovcasPerTrack.findAll", query="SELECT w FROM WeovcasPerTrack w")
public class WeovcasPerTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DATA_AUDIT_ID")
	private BigDecimal dataAuditId;

	@Column(name="DATA_AUDIT_TYPE")
	private String dataAuditType;

	@Column(name="EVENT_TYPE")
	private String eventType;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	@Column(name="TIME_OF_EVENT")
	private Date timeOfEvent;

	@Column(name="UID_CREATED")
	private String uidCreated;

	public WeovcasPerTrack() {
	}

	public BigDecimal getDataAuditId() {
		return this.dataAuditId;
	}

	public void setDataAuditId(BigDecimal dataAuditId) {
		this.dataAuditId = dataAuditId;
	}

	public String getDataAuditType() {
		return this.dataAuditType;
	}

	public void setDataAuditType(String dataAuditType) {
		this.dataAuditType = dataAuditType;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public Date getTimeOfEvent() {
		return this.timeOfEvent;
	}

	public void setTimeOfEvent(Date timeOfEvent) {
		this.timeOfEvent = timeOfEvent;
	}

	public String getUidCreated() {
		return this.uidCreated;
	}

	public void setUidCreated(String uidCreated) {
		this.uidCreated = uidCreated;
	}

}