package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the WEOVCHECKPT_DATA2 database table.
 * 
 */
@Entity
@Table(name="WEOVCHECKPT_DATA2")
@NamedQuery(name="WeovcheckptData2.findAll", query="SELECT w FROM WeovcheckptData2 w")
public class WeovcheckptData2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COMMIT_CNT")
	private short commitCnt;

	@Id
	@Column(name="PROGRAM_NAME")
	private String programName;

	@Column(name="TIME_LAST_RUN")
	private Timestamp timeLastRun;

	public WeovcheckptData2() {
	}

	public short getCommitCnt() {
		return this.commitCnt;
	}

	public void setCommitCnt(short commitCnt) {
		this.commitCnt = commitCnt;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Timestamp getTimeLastRun() {
		return this.timeLastRun;
	}

	public void setTimeLastRun(Timestamp timeLastRun) {
		this.timeLastRun = timeLastRun;
	}

}