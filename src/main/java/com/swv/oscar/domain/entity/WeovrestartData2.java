package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVRESTART_DATA2 database table.
 * 
 */
@Entity
@Table(name="WEOVRESTART_DATA2")
@NamedQuery(name="WeovrestartData2.findAll", query="SELECT w FROM WeovrestartData2 w")
public class WeovrestartData2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COMMIT_DATA")
	private String commitData;

	@Column(name="END_TIME")
	private String endTime;

	@Id
	@Column(name="PROGRAM_NAME")
	private String programName;

	@Column(name="RUN_DATE")
	private Date runDate;

	@Column(name="START_TIME")
	private String startTime;

	public WeovrestartData2() {
	}

	public String getCommitData() {
		return this.commitData;
	}

	public void setCommitData(String commitData) {
		this.commitData = commitData;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Date getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}