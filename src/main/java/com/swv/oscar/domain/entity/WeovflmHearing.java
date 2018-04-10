package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVFLM_HEARING database table.
 * 
 */
@Entity
@Table(name="WEOVFLM_HEARING")
@NamedQuery(name="WeovflmHearing.findAll", query="SELECT w FROM WeovflmHearing w")
public class WeovflmHearing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTIVITY_TYPE")
	private String activityType;

	@Column(name="AP_ATTY_ID")
	private String apAttyId;

	@Column(name="CAO_ATTY_ID")
	private String caoAttyId;

	
	@Id
	@Column(name="CASE_ID")
	private Integer caseId;

	@Column(name="CIVIL_ACTION_NBR")
	private String civilActionNbr;

	@Column(name="CLOSURE_CODE")
	private String closureCode;

	@Column(name="COMPLETE_IND")
	private String completeInd;

	@Column(name="COUNTY_CODE")
	private String countyCode;

	@Column(name="COURT_LOCATION")
	private String courtLocation;

	@Column(name="CS_EXTEND_18")
	private String csExtend18;

	@Column(name="CT_INSU_ORDERED")
	private String ctInsuOrdered;

	@Column(name="CTKR_ATTY_ID")
	private String ctkrAttyId;

	@Column(name="CUSTODY_TYPE")
	private String custodyType;

	@Column(name="DATE_SCHEDULED")
	private Date dateScheduled;

	@Column(name="DECREE_PARA_SELCTD")
	private String decreeParaSelctd;

	@Column(name="DELETE_REASON")
	private String deleteReason;

	@Column(name="ENTRY_DATE")
	private Date entryDate;

	@Column(name="EXCEPT_FILED_DATE")
	private Date exceptFiledDate;

	@Column(name="EXCEPTION_FLAG")
	private String exceptionFlag;

	@Column(name="EXTENSION_IND")
	private String extensionInd;

	@Column(name="FINAL_FLAG")
	private String finalFlag;

	@Column(name="HEARING_DATE")
	private Date hearingDate;

	@Column(name="HEARING_INIT_BY")
	private String hearingInitBy;

	@Column(name="HEARING_INIT_FOR")
	private String hearingInitFor;

	@Column(name="HEARING_RSN")
	private String hearingRsn;

	@Column(name="HEARING_STATUS")
	private String hearingStatus;

	@Column(name="HEARING_TIME")
	private String hearingTime;

	@Column(name="HEARING_TYPE")
	private String hearingType;

	@Column(name="INSU_ORDERED_TYPE")
	private String insuOrderedType;

	@Column(name="JUDGE_MASTER_ID")
	private String judgeMasterId;

	@Column(name="JUDGE_MASTER_IND")
	private String judgeMasterInd;

	@Column(name="NOTE")
	private String note;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="ORDERED_PER_CHILD")
	private String orderedPerChild;

	@Column(name="PARTY_SIG_CODE")
	private String partySigCode;

	@Column(name="RECOMMENDED_DATE")
	private Date recommendedDate;

	@Column(name="REPLACE_IND")
	private String replaceInd;

	@Column(name="RESCHEDULE_DATE")
	private Date rescheduleDate;

	@Column(name="RESCHEDULE_TIME")
	private String rescheduleTime;

	@Column(name="RESP_EXCEPT_DATE")
	private Date respExceptDate;

	@Column(name="REVIEW_DATE")
	private Date reviewDate;

	@Column(name="SCHED_WORKER_UID")
	private String schedWorkerUid;

	@Column(name="TEMP_ENTRY_DATE")
	private Date tempEntryDate;

	@Column(name="TEMP_ORDER_FLAG")
	private String tempOrderFlag;

	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="WITHHOLD_CODE")
	private String withholdCode;

	public WeovflmHearing() {
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getApAttyId() {
		return this.apAttyId;
	}

	public void setApAttyId(String apAttyId) {
		this.apAttyId = apAttyId;
	}

	public String getCaoAttyId() {
		return this.caoAttyId;
	}

	public void setCaoAttyId(String caoAttyId) {
		this.caoAttyId = caoAttyId;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getCivilActionNbr() {
		return this.civilActionNbr;
	}

	public void setCivilActionNbr(String civilActionNbr) {
		this.civilActionNbr = civilActionNbr;
	}

	public String getClosureCode() {
		return this.closureCode;
	}

	public void setClosureCode(String closureCode) {
		this.closureCode = closureCode;
	}

	public String getCompleteInd() {
		return this.completeInd;
	}

	public void setCompleteInd(String completeInd) {
		this.completeInd = completeInd;
	}

	public String getCountyCode() {
		return this.countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCourtLocation() {
		return this.courtLocation;
	}

	public void setCourtLocation(String courtLocation) {
		this.courtLocation = courtLocation;
	}

	public String getCsExtend18() {
		return this.csExtend18;
	}

	public void setCsExtend18(String csExtend18) {
		this.csExtend18 = csExtend18;
	}

	public String getCtInsuOrdered() {
		return this.ctInsuOrdered;
	}

	public void setCtInsuOrdered(String ctInsuOrdered) {
		this.ctInsuOrdered = ctInsuOrdered;
	}

	public String getCtkrAttyId() {
		return this.ctkrAttyId;
	}

	public void setCtkrAttyId(String ctkrAttyId) {
		this.ctkrAttyId = ctkrAttyId;
	}

	public String getCustodyType() {
		return this.custodyType;
	}

	public void setCustodyType(String custodyType) {
		this.custodyType = custodyType;
	}

	public Date getDateScheduled() {
		return this.dateScheduled;
	}

	public void setDateScheduled(Date dateScheduled) {
		this.dateScheduled = dateScheduled;
	}

	public String getDecreeParaSelctd() {
		return this.decreeParaSelctd;
	}

	public void setDecreeParaSelctd(String decreeParaSelctd) {
		this.decreeParaSelctd = decreeParaSelctd;
	}

	public String getDeleteReason() {
		return this.deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExceptFiledDate() {
		return this.exceptFiledDate;
	}

	public void setExceptFiledDate(Date exceptFiledDate) {
		this.exceptFiledDate = exceptFiledDate;
	}

	public String getExceptionFlag() {
		return this.exceptionFlag;
	}

	public void setExceptionFlag(String exceptionFlag) {
		this.exceptionFlag = exceptionFlag;
	}

	public String getExtensionInd() {
		return this.extensionInd;
	}

	public void setExtensionInd(String extensionInd) {
		this.extensionInd = extensionInd;
	}

	public String getFinalFlag() {
		return this.finalFlag;
	}

	public void setFinalFlag(String finalFlag) {
		this.finalFlag = finalFlag;
	}

	public Date getHearingDate() {
		return this.hearingDate;
	}

	public void setHearingDate(Date hearingDate) {
		this.hearingDate = hearingDate;
	}

	public String getHearingInitBy() {
		return this.hearingInitBy;
	}

	public void setHearingInitBy(String hearingInitBy) {
		this.hearingInitBy = hearingInitBy;
	}

	public String getHearingInitFor() {
		return this.hearingInitFor;
	}

	public void setHearingInitFor(String hearingInitFor) {
		this.hearingInitFor = hearingInitFor;
	}

	public String getHearingRsn() {
		return this.hearingRsn;
	}

	public void setHearingRsn(String hearingRsn) {
		this.hearingRsn = hearingRsn;
	}

	public String getHearingStatus() {
		return this.hearingStatus;
	}

	public void setHearingStatus(String hearingStatus) {
		this.hearingStatus = hearingStatus;
	}

	public String getHearingTime() {
		return this.hearingTime;
	}

	public void setHearingTime(String hearingTime) {
		this.hearingTime = hearingTime;
	}

	public String getHearingType() {
		return this.hearingType;
	}

	public void setHearingType(String hearingType) {
		this.hearingType = hearingType;
	}

	public String getInsuOrderedType() {
		return this.insuOrderedType;
	}

	public void setInsuOrderedType(String insuOrderedType) {
		this.insuOrderedType = insuOrderedType;
	}

	public String getJudgeMasterId() {
		return this.judgeMasterId;
	}

	public void setJudgeMasterId(String judgeMasterId) {
		this.judgeMasterId = judgeMasterId;
	}

	public String getJudgeMasterInd() {
		return this.judgeMasterInd;
	}

	public void setJudgeMasterInd(String judgeMasterInd) {
		this.judgeMasterInd = judgeMasterInd;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderedPerChild() {
		return this.orderedPerChild;
	}

	public void setOrderedPerChild(String orderedPerChild) {
		this.orderedPerChild = orderedPerChild;
	}

	public String getPartySigCode() {
		return this.partySigCode;
	}

	public void setPartySigCode(String partySigCode) {
		this.partySigCode = partySigCode;
	}

	public Date getRecommendedDate() {
		return this.recommendedDate;
	}

	public void setRecommendedDate(Date recommendedDate) {
		this.recommendedDate = recommendedDate;
	}

	public String getReplaceInd() {
		return this.replaceInd;
	}

	public void setReplaceInd(String replaceInd) {
		this.replaceInd = replaceInd;
	}

	public Date getRescheduleDate() {
		return this.rescheduleDate;
	}

	public void setRescheduleDate(Date rescheduleDate) {
		this.rescheduleDate = rescheduleDate;
	}

	public String getRescheduleTime() {
		return this.rescheduleTime;
	}

	public void setRescheduleTime(String rescheduleTime) {
		this.rescheduleTime = rescheduleTime;
	}

	public Date getRespExceptDate() {
		return this.respExceptDate;
	}

	public void setRespExceptDate(Date respExceptDate) {
		this.respExceptDate = respExceptDate;
	}

	public Date getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getSchedWorkerUid() {
		return this.schedWorkerUid;
	}

	public void setSchedWorkerUid(String schedWorkerUid) {
		this.schedWorkerUid = schedWorkerUid;
	}

	public Date getTempEntryDate() {
		return this.tempEntryDate;
	}

	public void setTempEntryDate(Date tempEntryDate) {
		this.tempEntryDate = tempEntryDate;
	}

	public String getTempOrderFlag() {
		return this.tempOrderFlag;
	}

	public void setTempOrderFlag(String tempOrderFlag) {
		this.tempOrderFlag = tempOrderFlag;
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

	public String getWithholdCode() {
		return this.withholdCode;
	}

	public void setWithholdCode(String withholdCode) {
		this.withholdCode = withholdCode;
	}

}