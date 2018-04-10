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
 * The persistent class for the WEOVCASE database table.
 * 
 */
@Entity
@Table(name="WEOVCASE")
@NamedQuery(name="Weovcase.findAll", query="SELECT w FROM Weovcase w")
public class Weovcase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTIVITY_LEVEL")
	private String activityLevel;

	@Column(name="ACTV_LVL_CHG_DT")
	private String actvLvlChgDt;

	@Column(name="AFDC_CASE_NBR")
	private String afdcCaseNbr;

	@Column(name="AFDC_NBR_IND")
	private String afdcNbrInd;

	@Column(name="AMNESTY_ORDR_DATE")
	private String amnestyOrdrDate;
	
	@Id
	@Column(name="AP_ATTY_ID")
	private String apAttyId;

	@Column(name="AP_ATTY_NOTE")
	private String apAttyNote;

	@Column(name="AP_PIN")
	private BigDecimal apPin;

	@Column(name="APPL_PRVD_DATE")
	private String applPrvdDate;

	@Column(name="APPL_RECVD_DATE")
	private String applRecvdDate;

	@Column(name="APPL_REQ_DATE")
	private String applReqDate;

	@Column(name="APPLICANT_TYPE")
	private String applicantType;

	@Column(name="APPRVL_ENTRY_DATE")
	private String apprvlEntryDate;

	@Column(name="ARCHIVE_NBR")
	private String archiveNbr;

	@Column(name="ARREARAGE_CALC_IND")
	private String arrearageCalcInd;

	@Column(name="ASSIST_TYPE")
	private String assistType;

	@Column(name="ASSIST_TYPE_157")
	private String assistType157;

	@Column(name="BILL_CD")
	private String billCd;

	@Column(name="CAO_ATTY_ID")
	private String caoAttyId;

	@Column(name="CASE_ACTION_CD")
	private String caseActionCd;

	@Column(name="CASE_ACTION_EFF_DT")
	private String caseActionEffDt;

	@Column(name="CASE_DISPLAY_NBR")
	private String caseDisplayNbr;

	@Column(name="CASE_ID")
	private Integer caseId;

	@Column(name="CASE_REVIEW_DATE")
	private String caseReviewDate;

	@Column(name="CASE_START_DATE")
	private String caseStartDate;

	@Column(name="CASE_TYPE")
	private String caseType;

	@Column(name="CASELOAD")
	private String caseload;

	@Column(name="CLOSE_REASON")
	private String closeReason;

	@Column(name="CNTST_IW_DATE")
	private String cntstIwDate;

	@Column(name="CNTST_IW_RSN_CD")
	private String cntstIwRsnCd;

	@Column(name="CONFIDENTIAL")
	private String confidential;

	@Column(name="CRB_INTERFACE_CD")
	private String crbInterfaceCd;

	@Column(name="CRB_INTERFACE_RSN")
	private String crbInterfaceRsn;

	@Column(name="CT_AP_ADR_MTCH_IND")
	private String ctApAdrMtchInd;

	@Column(name="CTKR_ATTY_ID")
	private String ctkrAttyId;

	@Column(name="CTKR_ATTY_NOTE")
	private String ctkrAttyNote;

	@Column(name="CTKR_PIN")
	private BigDecimal ctkrPin;

	@Column(name="CURR_CASE_STATUS")
	private String currCaseStatus;

	@Column(name="DIVORCE_DATE")
	private String divorceDate;

	@Column(name="DIVORCE_LOCATION")
	private String divorceLocation;

	@Column(name="DIVORCE_NBR")
	private String divorceNbr;

	@Column(name="FC_GDCS_BASIS")
	private String fcGdcsBasis;

	@Column(name="FC_GDCS_CLM_DT")
	private String fcGdcsClmDt;

	@Column(name="FC_GDCS_COOP")
	private String fcGdcsCoop;

	@Column(name="FC_GDCS_DET")
	private String fcGdcsDet;

	@Column(name="FC_GDCS_IND")
	private String fcGdcsInd;

	@Column(name="FC_GDCS_RVWD_DT")
	private String fcGdcsRvwdDt;

	@Column(name="IMAGED")
	private String imaged;

	@Column(name="IRSF_FLAG")
	private String irsfFlag;

	@Column(name="MARITAL_NOTE")
	private String maritalNote;

	@Column(name="MARRIAGE_DATE")
	private String marriageDate;

	@Column(name="MARRIAGE_LICENSE")
	private String marriageLicense;

	@Column(name="MARRIAGE_LOCATION")
	private String marriageLocation;

	@Column(name="MULTI_DEFEND_IND")
	private String multiDefendInd;

	@Column(name="NON_CURR_ARRS_IND")
	private String nonCurrArrsInd;

	@Column(name="NONCOMPL_FILE_DATE")
	private String noncomplFileDate;

	@Column(name="NSF_IND")
	private String nsfInd;

	@Column(name="OOS_CASE_NBR")
	private String oosCaseNbr;

	@Column(name="OOS_CASE_TYPE")
	private String oosCaseType;

	@Column(name="PROTECTIVE_PAY_DT")
	private String protectivePayDt;

	@Column(name="PYMT_ARR_PRIORITY")
	private String pymtArrPriority;

	@Column(name="RAPIDS_AP_SEQ_NBR")
	private BigDecimal rapidsApSeqNbr;

	@Column(name="REL_TO_AP")
	private String relToAp;

	@Column(name="REPORTING_PERIOD")
	private String reportingPeriod;

	@Column(name="SEPARATED_LOCATION")
	private String separatedLocation;

	@Column(name="SEPARATION_DATE")
	private String separationDate;

	@Column(name="SEPARATION_NBR")
	private String separationNbr;

	@Column(name="SERVICE_FIPS")
	private String serviceFips;

	@Column(name="SERVICE_TYPE")
	private String serviceType;

	@Column(name="SPECIAL_STAT_IND")
	private String specialStatInd;

	@Column(name="SPLU_CASELOAD_ID")
	private String spluCaseloadId;

	@Column(name="SSI_IND")
	private String ssiInd;

	@Column(name="STATUS_CHG_DATE")
	private String statusChgDate;

	@Column(name="SUPPRESSION_IND")
	private String suppressionInd;

	@Column(name="SUSP_ALLOCATION")
	private String suspAllocation;

	@Column(name="SUSP_BILLING")
	private String suspBilling;

	@Column(name="SUSP_DIST_IND")
	private String suspDistInd;

	@Column(name="SUSP_INC_WH")
	private String suspIncWh;

	@Column(name="SUSP_IRS_OFFSET")
	private String suspIrsOffset;

	@Column(name="SUSP_ST_TAX_OFFSET")
	private String suspStTaxOffset;

	@Column(name="TIME_CREATED")
	private Date timeCreated;

	@Column(name="TIME_UPDATED")
	private Date timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="VS_FLAG")
	private String vsFlag;

	public Weovcase() {
	}

	public String getActivityLevel() {
		return this.activityLevel;
	}

	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

	public String getActvLvlChgDt() {
		return this.actvLvlChgDt;
	}

	public void setActvLvlChgDt(String actvLvlChgDt) {
		this.actvLvlChgDt = actvLvlChgDt;
	}

	public String getAfdcCaseNbr() {
		return this.afdcCaseNbr;
	}

	public void setAfdcCaseNbr(String afdcCaseNbr) {
		this.afdcCaseNbr = afdcCaseNbr;
	}

	public String getAfdcNbrInd() {
		return this.afdcNbrInd;
	}

	public void setAfdcNbrInd(String afdcNbrInd) {
		this.afdcNbrInd = afdcNbrInd;
	}

	public String getAmnestyOrdrDate() {
		return this.amnestyOrdrDate;
	}

	public void setAmnestyOrdrDate(String amnestyOrdrDate) {
		this.amnestyOrdrDate = amnestyOrdrDate;
	}

	public String getApAttyId() {
		return this.apAttyId;
	}

	public void setApAttyId(String apAttyId) {
		this.apAttyId = apAttyId;
	}

	public String getApAttyNote() {
		return this.apAttyNote;
	}

	public void setApAttyNote(String apAttyNote) {
		this.apAttyNote = apAttyNote;
	}

	public BigDecimal getApPin() {
		return this.apPin;
	}

	public void setApPin(BigDecimal apPin) {
		this.apPin = apPin;
	}

	public String getApplPrvdDate() {
		return this.applPrvdDate;
	}

	public void setApplPrvdDate(String applPrvdDate) {
		this.applPrvdDate = applPrvdDate;
	}

	public String getApplRecvdDate() {
		return this.applRecvdDate;
	}

	public void setApplRecvdDate(String applRecvdDate) {
		this.applRecvdDate = applRecvdDate;
	}

	public String getApplReqDate() {
		return this.applReqDate;
	}

	public void setApplReqDate(String applReqDate) {
		this.applReqDate = applReqDate;
	}

	public String getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getApprvlEntryDate() {
		return this.apprvlEntryDate;
	}

	public void setApprvlEntryDate(String apprvlEntryDate) {
		this.apprvlEntryDate = apprvlEntryDate;
	}

	public String getArchiveNbr() {
		return this.archiveNbr;
	}

	public void setArchiveNbr(String archiveNbr) {
		this.archiveNbr = archiveNbr;
	}

	public String getArrearageCalcInd() {
		return this.arrearageCalcInd;
	}

	public void setArrearageCalcInd(String arrearageCalcInd) {
		this.arrearageCalcInd = arrearageCalcInd;
	}

	public String getAssistType() {
		return this.assistType;
	}

	public void setAssistType(String assistType) {
		this.assistType = assistType;
	}

	public String getAssistType157() {
		return this.assistType157;
	}

	public void setAssistType157(String assistType157) {
		this.assistType157 = assistType157;
	}

	public String getBillCd() {
		return this.billCd;
	}

	public void setBillCd(String billCd) {
		this.billCd = billCd;
	}

	public String getCaoAttyId() {
		return this.caoAttyId;
	}

	public void setCaoAttyId(String caoAttyId) {
		this.caoAttyId = caoAttyId;
	}

	public String getCaseActionCd() {
		return this.caseActionCd;
	}

	public void setCaseActionCd(String caseActionCd) {
		this.caseActionCd = caseActionCd;
	}

	public String getCaseActionEffDt() {
		return this.caseActionEffDt;
	}

	public void setCaseActionEffDt(String caseActionEffDt) {
		this.caseActionEffDt = caseActionEffDt;
	}

	public String getCaseDisplayNbr() {
		return this.caseDisplayNbr;
	}

	public void setCaseDisplayNbr(String caseDisplayNbr) {
		this.caseDisplayNbr = caseDisplayNbr;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getCaseReviewDate() {
		return this.caseReviewDate;
	}

	public void setCaseReviewDate(String caseReviewDate) {
		this.caseReviewDate = caseReviewDate;
	}

	public String getCaseStartDate() {
		return this.caseStartDate;
	}

	public void setCaseStartDate(String caseStartDate) {
		this.caseStartDate = caseStartDate;
	}

	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getCaseload() {
		return this.caseload;
	}

	public void setCaseload(String caseload) {
		this.caseload = caseload;
	}

	public String getCloseReason() {
		return this.closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getCntstIwDate() {
		return this.cntstIwDate;
	}

	public void setCntstIwDate(String cntstIwDate) {
		this.cntstIwDate = cntstIwDate;
	}

	public String getCntstIwRsnCd() {
		return this.cntstIwRsnCd;
	}

	public void setCntstIwRsnCd(String cntstIwRsnCd) {
		this.cntstIwRsnCd = cntstIwRsnCd;
	}

	public String getConfidential() {
		return this.confidential;
	}

	public void setConfidential(String confidential) {
		this.confidential = confidential;
	}

	public String getCrbInterfaceCd() {
		return this.crbInterfaceCd;
	}

	public void setCrbInterfaceCd(String crbInterfaceCd) {
		this.crbInterfaceCd = crbInterfaceCd;
	}

	public String getCrbInterfaceRsn() {
		return this.crbInterfaceRsn;
	}

	public void setCrbInterfaceRsn(String crbInterfaceRsn) {
		this.crbInterfaceRsn = crbInterfaceRsn;
	}

	public String getCtApAdrMtchInd() {
		return this.ctApAdrMtchInd;
	}

	public void setCtApAdrMtchInd(String ctApAdrMtchInd) {
		this.ctApAdrMtchInd = ctApAdrMtchInd;
	}

	public String getCtkrAttyId() {
		return this.ctkrAttyId;
	}

	public void setCtkrAttyId(String ctkrAttyId) {
		this.ctkrAttyId = ctkrAttyId;
	}

	public String getCtkrAttyNote() {
		return this.ctkrAttyNote;
	}

	public void setCtkrAttyNote(String ctkrAttyNote) {
		this.ctkrAttyNote = ctkrAttyNote;
	}

	public BigDecimal getCtkrPin() {
		return this.ctkrPin;
	}

	public void setCtkrPin(BigDecimal ctkrPin) {
		this.ctkrPin = ctkrPin;
	}

	public String getCurrCaseStatus() {
		return this.currCaseStatus;
	}

	public void setCurrCaseStatus(String currCaseStatus) {
		this.currCaseStatus = currCaseStatus;
	}

	public String getDivorceDate() {
		return this.divorceDate;
	}

	public void setDivorceDate(String divorceDate) {
		this.divorceDate = divorceDate;
	}

	public String getDivorceLocation() {
		return this.divorceLocation;
	}

	public void setDivorceLocation(String divorceLocation) {
		this.divorceLocation = divorceLocation;
	}

	public String getDivorceNbr() {
		return this.divorceNbr;
	}

	public void setDivorceNbr(String divorceNbr) {
		this.divorceNbr = divorceNbr;
	}

	public String getFcGdcsBasis() {
		return this.fcGdcsBasis;
	}

	public void setFcGdcsBasis(String fcGdcsBasis) {
		this.fcGdcsBasis = fcGdcsBasis;
	}

	public String getFcGdcsClmDt() {
		return this.fcGdcsClmDt;
	}

	public void setFcGdcsClmDt(String fcGdcsClmDt) {
		this.fcGdcsClmDt = fcGdcsClmDt;
	}

	public String getFcGdcsCoop() {
		return this.fcGdcsCoop;
	}

	public void setFcGdcsCoop(String fcGdcsCoop) {
		this.fcGdcsCoop = fcGdcsCoop;
	}

	public String getFcGdcsDet() {
		return this.fcGdcsDet;
	}

	public void setFcGdcsDet(String fcGdcsDet) {
		this.fcGdcsDet = fcGdcsDet;
	}

	public String getFcGdcsInd() {
		return this.fcGdcsInd;
	}

	public void setFcGdcsInd(String fcGdcsInd) {
		this.fcGdcsInd = fcGdcsInd;
	}

	public String getFcGdcsRvwdDt() {
		return this.fcGdcsRvwdDt;
	}

	public void setFcGdcsRvwdDt(String fcGdcsRvwdDt) {
		this.fcGdcsRvwdDt = fcGdcsRvwdDt;
	}

	public String getImaged() {
		return this.imaged;
	}

	public void setImaged(String imaged) {
		this.imaged = imaged;
	}

	public String getIrsfFlag() {
		return this.irsfFlag;
	}

	public void setIrsfFlag(String irsfFlag) {
		this.irsfFlag = irsfFlag;
	}

	public String getMaritalNote() {
		return this.maritalNote;
	}

	public void setMaritalNote(String maritalNote) {
		this.maritalNote = maritalNote;
	}

	public String getMarriageDate() {
		return this.marriageDate;
	}

	public void setMarriageDate(String marriageDate) {
		this.marriageDate = marriageDate;
	}

	public String getMarriageLicense() {
		return this.marriageLicense;
	}

	public void setMarriageLicense(String marriageLicense) {
		this.marriageLicense = marriageLicense;
	}

	public String getMarriageLocation() {
		return this.marriageLocation;
	}

	public void setMarriageLocation(String marriageLocation) {
		this.marriageLocation = marriageLocation;
	}

	public String getMultiDefendInd() {
		return this.multiDefendInd;
	}

	public void setMultiDefendInd(String multiDefendInd) {
		this.multiDefendInd = multiDefendInd;
	}

	public String getNonCurrArrsInd() {
		return this.nonCurrArrsInd;
	}

	public void setNonCurrArrsInd(String nonCurrArrsInd) {
		this.nonCurrArrsInd = nonCurrArrsInd;
	}

	public String getNoncomplFileDate() {
		return this.noncomplFileDate;
	}

	public void setNoncomplFileDate(String noncomplFileDate) {
		this.noncomplFileDate = noncomplFileDate;
	}

	public String getNsfInd() {
		return this.nsfInd;
	}

	public void setNsfInd(String nsfInd) {
		this.nsfInd = nsfInd;
	}

	public String getOosCaseNbr() {
		return this.oosCaseNbr;
	}

	public void setOosCaseNbr(String oosCaseNbr) {
		this.oosCaseNbr = oosCaseNbr;
	}

	public String getOosCaseType() {
		return this.oosCaseType;
	}

	public void setOosCaseType(String oosCaseType) {
		this.oosCaseType = oosCaseType;
	}

	public String getProtectivePayDt() {
		return this.protectivePayDt;
	}

	public void setProtectivePayDt(String protectivePayDt) {
		this.protectivePayDt = protectivePayDt;
	}

	public String getPymtArrPriority() {
		return this.pymtArrPriority;
	}

	public void setPymtArrPriority(String pymtArrPriority) {
		this.pymtArrPriority = pymtArrPriority;
	}

	public BigDecimal getRapidsApSeqNbr() {
		return this.rapidsApSeqNbr;
	}

	public void setRapidsApSeqNbr(BigDecimal rapidsApSeqNbr) {
		this.rapidsApSeqNbr = rapidsApSeqNbr;
	}

	public String getRelToAp() {
		return this.relToAp;
	}

	public void setRelToAp(String relToAp) {
		this.relToAp = relToAp;
	}

	public String getReportingPeriod() {
		return this.reportingPeriod;
	}

	public void setReportingPeriod(String reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
	}

	public String getSeparatedLocation() {
		return this.separatedLocation;
	}

	public void setSeparatedLocation(String separatedLocation) {
		this.separatedLocation = separatedLocation;
	}

	public String getSeparationDate() {
		return this.separationDate;
	}

	public void setSeparationDate(String separationDate) {
		this.separationDate = separationDate;
	}

	public String getSeparationNbr() {
		return this.separationNbr;
	}

	public void setSeparationNbr(String separationNbr) {
		this.separationNbr = separationNbr;
	}

	public String getServiceFips() {
		return this.serviceFips;
	}

	public void setServiceFips(String serviceFips) {
		this.serviceFips = serviceFips;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSpecialStatInd() {
		return this.specialStatInd;
	}

	public void setSpecialStatInd(String specialStatInd) {
		this.specialStatInd = specialStatInd;
	}

	public String getSpluCaseloadId() {
		return this.spluCaseloadId;
	}

	public void setSpluCaseloadId(String spluCaseloadId) {
		this.spluCaseloadId = spluCaseloadId;
	}

	public String getSsiInd() {
		return this.ssiInd;
	}

	public void setSsiInd(String ssiInd) {
		this.ssiInd = ssiInd;
	}

	public String getStatusChgDate() {
		return this.statusChgDate;
	}

	public void setStatusChgDate(String statusChgDate) {
		this.statusChgDate = statusChgDate;
	}

	public String getSuppressionInd() {
		return this.suppressionInd;
	}

	public void setSuppressionInd(String suppressionInd) {
		this.suppressionInd = suppressionInd;
	}

	public String getSuspAllocation() {
		return this.suspAllocation;
	}

	public void setSuspAllocation(String suspAllocation) {
		this.suspAllocation = suspAllocation;
	}

	public String getSuspBilling() {
		return this.suspBilling;
	}

	public void setSuspBilling(String suspBilling) {
		this.suspBilling = suspBilling;
	}

	public String getSuspDistInd() {
		return this.suspDistInd;
	}

	public void setSuspDistInd(String suspDistInd) {
		this.suspDistInd = suspDistInd;
	}

	public String getSuspIncWh() {
		return this.suspIncWh;
	}

	public void setSuspIncWh(String suspIncWh) {
		this.suspIncWh = suspIncWh;
	}

	public String getSuspIrsOffset() {
		return this.suspIrsOffset;
	}

	public void setSuspIrsOffset(String suspIrsOffset) {
		this.suspIrsOffset = suspIrsOffset;
	}

	public String getSuspStTaxOffset() {
		return this.suspStTaxOffset;
	}

	public void setSuspStTaxOffset(String suspStTaxOffset) {
		this.suspStTaxOffset = suspStTaxOffset;
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

	public String getVsFlag() {
		return this.vsFlag;
	}

	public void setVsFlag(String vsFlag) {
		this.vsFlag = vsFlag;
	}

}