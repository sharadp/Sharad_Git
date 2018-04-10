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
 * The persistent class for the WEOVMTH_SUMMARY database table.
 * 
 */
@Entity
@Table(name="WEOVMTH_SUMMARY")
@NamedQuery(name="WeovmthSummary.findAll", query="SELECT w FROM WeovmthSummary w")
public class WeovmthSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="A_CH_SUP_IN_GRACE")
	private BigDecimal aChSupInGrace;

	@Column(name="A_CS_IN_GRACE_RCVD")
	private BigDecimal aCsInGraceRcvd;

	@Column(name="A_MD_SUP_IN_GRACE")
	private BigDecimal aMdSupInGrace;

	@Column(name="A_MS_IN_GRACE_RCVD")
	private BigDecimal aMsInGraceRcvd;

	@Column(name="A_SP_SUP_IN_GRACE")
	private BigDecimal aSpSupInGrace;

	@Column(name="A_SS_IN_GRACE_RCVD")
	private BigDecimal aSsInGraceRcvd;

	@Id
	@Column(name="CASE_ID")
	private BigDecimal caseId;

	@Column(name="CT_EXP_GRACE_RCVD")
	private BigDecimal ctExpGraceRcvd;

	@Column(name="CT_MD_EXP_IN_GRACE")
	private BigDecimal ctMdExpInGrace;

	@Column(name="DISREGARD_AMT")
	private BigDecimal disregardAmt;

	@Column(name="FST_SP_SUP_DUE")
	private BigDecimal fstSpSupDue;

	@Column(name="FST_SUPPORT_DUE")
	private BigDecimal fstSupportDue;

	@Column(name="INT_ACCRUING_IND")
	private String intAccruingInd;

	@Column(name="LAST_BILL_AMT")
	private BigDecimal lastBillAmt;

	@Column(name="LAST_BILL_DATE")
	private Date lastBillDate;

	@Column(name="LAST_EMP_BILL_DATE")
	private Date lastEmpBillDate;

	@Column(name="LAST_EMP_BILL_ID")
	private String lastEmpBillId;

	@Column(name="LAST_INT_DATE")
	private Date lastIntDate;

	@Column(name="LAST_PAY_AMT")
	private BigDecimal lastPayAmt;

	@Column(name="LAST_PAY_DATE")
	private Date lastPayDate;

	@Column(name="MC_EXP_GRACE_RCVD")
	private BigDecimal mcExpGraceRcvd;

	@Column(name="MC_MD_EXP_IN_GRACE")
	private BigDecimal mcMdExpInGrace;

	@Column(name="MTD_AFDC_GRANT_PD")
	private BigDecimal mtdAfdcGrantPd;

	@Column(name="MTD_ESCROW_AMT")
	private BigDecimal mtdEscrowAmt;

	@Column(name="MTD_NPA_CHECK_AMT")
	private BigDecimal mtdNpaCheckAmt;

	@Column(name="MTH_A_ARRS_CINT")
	private BigDecimal mthAArrsCint;

	@Column(name="MTH_A_MED_CINT")
	private BigDecimal mthAMedCint;

	@Column(name="MTH_A_SPOUSAL_CINT")
	private BigDecimal mthASpousalCint;

	@Column(name="MTH_B_TST_FEE_DUE")
	private BigDecimal mthBTstFeeDue;

	@Column(name="MTH_B_TST_FEE_RCVD")
	private BigDecimal mthBTstFeeRcvd;

	@Column(name="MTH_CCOST_FEE_DUE")
	private BigDecimal mthCcostFeeDue;

	@Column(name="MTH_CCOST_FEE_RCVD")
	private BigDecimal mthCcostFeeRcvd;

	@Column(name="MTH_CT_MD_EXP")
	private BigDecimal mthCtMdExp;

	@Column(name="MTH_FLM_FEE_DUE")
	private BigDecimal mthFlmFeeDue;

	@Column(name="MTH_FLM_FEE_RCVD")
	private BigDecimal mthFlmFeeRcvd;

	@Column(name="MTH_G_TST_FEE_DUE")
	private BigDecimal mthGTstFeeDue;

	@Column(name="MTH_G_TST_FEE_RCVD")
	private BigDecimal mthGTstFeeRcvd;

	@Column(name="MTH_IVE_AMT_REC")
	private BigDecimal mthIveAmtRec;

	@Column(name="MTH_MC_MD_EXP")
	private BigDecimal mthMcMdExp;

	@Column(name="MTH_MDCL_SUP_DUE")
	private BigDecimal mthMdclSupDue;

	@Column(name="MTH_MDCL_SUP_RCVD")
	private BigDecimal mthMdclSupRcvd;

	@Column(name="MTH_N_ARRS_CINT")
	private BigDecimal mthNArrsCint;

	@Column(name="MTH_N_MED_CINT")
	private BigDecimal mthNMedCint;

	@Column(name="MTH_N_SPOUSAL_CINT")
	private BigDecimal mthNSpousalCint;

	@Column(name="MTH_NONIVE_AMT_REC")
	private BigDecimal mthNoniveAmtRec;

	@Column(name="MTH_PAST_SUPP_RCVD")
	private BigDecimal mthPastSuppRcvd;

	@Column(name="MTH_SPOUS_SUP_DUE")
	private BigDecimal mthSpousSupDue;

	@Column(name="MTH_SPOUS_SUP_RCVD")
	private BigDecimal mthSpousSupRcvd;

	@Column(name="MTH_SUPP_RETAINED")
	private BigDecimal mthSuppRetained;

	@Column(name="MTH_SUPPORT_DUE")
	private BigDecimal mthSupportDue;

	@Column(name="MTH_SUPPORT_RCVD")
	private BigDecimal mthSupportRcvd;

	@Column(name="N_CH_SUP_IN_GRACE")
	private BigDecimal nChSupInGrace;

	@Column(name="N_CS_IN_GRACE_RCVD")
	private BigDecimal nCsInGraceRcvd;

	@Column(name="N_MD_SUP_IN_GRACE")
	private BigDecimal nMdSupInGrace;

	@Column(name="N_MS_IN_GRACE_RCVD")
	private BigDecimal nMsInGraceRcvd;

	@Column(name="N_SP_SUP_IN_GRACE")
	private BigDecimal nSpSupInGrace;

	@Column(name="N_SS_IN_GRACE_RCVD")
	private BigDecimal nSsInGraceRcvd;

	@Column(name="PRD_MDCL_BAL_DUE")
	private BigDecimal prdMdclBalDue;

	@Column(name="PRD_MDCL_SUP_DUE")
	private BigDecimal prdMdclSupDue;

	@Column(name="PRD_SPOUS_BAL_DUE")
	private BigDecimal prdSpousBalDue;

	@Column(name="PRD_SPOUSAL_DUE")
	private BigDecimal prdSpousalDue;

	@Column(name="PRD_START_DATE")
	private Date prdStartDate;

	@Column(name="PRD_SUPP_BAL_DUE")
	private BigDecimal prdSuppBalDue;

	@Column(name="PRD_SUPPORT_DUE")
	private BigDecimal prdSupportDue;

	@Column(name="RPAY_TOTAL_DUE")
	private BigDecimal rpayTotalDue;

	@Column(name="RPAY_TOTAL_RCVD")
	private BigDecimal rpayTotalRcvd;

	@Column(name="SSI_RATE")
	private BigDecimal ssiRate;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="TOT_A_ARRS_CINT")
	private BigDecimal totAArrsCint;

	@Column(name="TOT_A_ARRS_DUE")
	private BigDecimal totAArrsDue;

	@Column(name="TOT_A_ARRS_RCVD")
	private BigDecimal totAArrsRcvd;

	@Column(name="TOT_A_ARRS_SINT")
	private BigDecimal totAArrsSint;

	@Column(name="TOT_A_CH_SUP_DELQ")
	private BigDecimal totAChSupDelq;

	@Column(name="TOT_A_CS_DELQ_RCVD")
	private BigDecimal totACsDelqRcvd;

	@Column(name="TOT_A_MD_SUP_DELQ")
	private BigDecimal totAMdSupDelq;

	@Column(name="TOT_A_MED_CINT")
	private BigDecimal totAMedCint;

	@Column(name="TOT_A_MED_DUE")
	private BigDecimal totAMedDue;

	@Column(name="TOT_A_MED_SINT")
	private BigDecimal totAMedSint;

	@Column(name="TOT_A_MEDICAL_RCVD")
	private BigDecimal totAMedicalRcvd;

	@Column(name="TOT_A_MS_DELQ_RCVD")
	private BigDecimal totAMsDelqRcvd;

	@Column(name="TOT_A_SP_SUP_DELQ")
	private BigDecimal totASpSupDelq;

	@Column(name="TOT_A_SPOUSAL_CINT")
	private BigDecimal totASpousalCint;

	@Column(name="TOT_A_SPOUSAL_DUE")
	private BigDecimal totASpousalDue;

	@Column(name="TOT_A_SPOUSAL_RCVD")
	private BigDecimal totASpousalRcvd;

	@Column(name="TOT_A_SPOUSAL_SINT")
	private BigDecimal totASpousalSint;

	@Column(name="TOT_A_SS_DELQ_RCVD")
	private BigDecimal totASsDelqRcvd;

	@Column(name="TOT_ADVANCE_AMT")
	private BigDecimal totAdvanceAmt;

	@Column(name="TOT_AFDC_FUT_AMT")
	private BigDecimal totAfdcFutAmt;

	@Column(name="TOT_AFDC_GRANT_PD")
	private BigDecimal totAfdcGrantPd;

	@Column(name="TOT_B_TST_FEE_DUE")
	private BigDecimal totBTstFeeDue;

	@Column(name="TOT_B_TST_FEE_RCVD")
	private BigDecimal totBTstFeeRcvd;

	@Column(name="TOT_CCOST_FEE_DUE")
	private BigDecimal totCcostFeeDue;

	@Column(name="TOT_CCOST_FEE_RCVD")
	private BigDecimal totCcostFeeRcvd;

	@Column(name="TOT_CT_MD_EXP_DELQ")
	private BigDecimal totCtMdExpDelq;

	@Column(name="TOT_CTEXP_DEL_RCVD")
	private BigDecimal totCtexpDelRcvd;

	@Column(name="TOT_ESCROW_AMT")
	private BigDecimal totEscrowAmt;

	@Column(name="TOT_FLM_FEE_DUE")
	private BigDecimal totFlmFeeDue;

	@Column(name="TOT_FLM_FEE_RCVD")
	private BigDecimal totFlmFeeRcvd;

	@Column(name="TOT_G_TST_FEE_DUE")
	private BigDecimal totGTstFeeDue;

	@Column(name="TOT_G_TST_FEE_RCVD")
	private BigDecimal totGTstFeeRcvd;

	@Column(name="TOT_IVE_AMT_REC")
	private BigDecimal totIveAmtRec;

	@Column(name="TOT_MC_MD_EXP_DELQ")
	private BigDecimal totMcMdExpDelq;

	@Column(name="TOT_MCEXP_DEL_RCVD")
	private BigDecimal totMcexpDelRcvd;

	@Column(name="TOT_MDCL_SUP_RCVD")
	private BigDecimal totMdclSupRcvd;

	@Column(name="TOT_N_ARRS_CINT")
	private BigDecimal totNArrsCint;

	@Column(name="TOT_N_ARRS_DUE")
	private BigDecimal totNArrsDue;

	@Column(name="TOT_N_ARRS_RCVD")
	private BigDecimal totNArrsRcvd;

	@Column(name="TOT_N_ARRS_SINT")
	private BigDecimal totNArrsSint;

	@Column(name="TOT_N_CH_SUP_DELQ")
	private BigDecimal totNChSupDelq;

	@Column(name="TOT_N_CS_DELQ_RCVD")
	private BigDecimal totNCsDelqRcvd;

	@Column(name="TOT_N_MD_SUP_DELQ")
	private BigDecimal totNMdSupDelq;

	@Column(name="TOT_N_MED_CINT")
	private BigDecimal totNMedCint;

	@Column(name="TOT_N_MED_DUE")
	private BigDecimal totNMedDue;

	@Column(name="TOT_N_MED_SINT")
	private BigDecimal totNMedSint;

	@Column(name="TOT_N_MEDICAL_RCVD")
	private BigDecimal totNMedicalRcvd;

	@Column(name="TOT_N_MS_DELQ_RCVD")
	private BigDecimal totNMsDelqRcvd;

	@Column(name="TOT_N_SP_SUP_DELQ")
	private BigDecimal totNSpSupDelq;

	@Column(name="TOT_N_SPOUSAL_CINT")
	private BigDecimal totNSpousalCint;

	@Column(name="TOT_N_SPOUSAL_DUE")
	private BigDecimal totNSpousalDue;

	@Column(name="TOT_N_SPOUSAL_RCVD")
	private BigDecimal totNSpousalRcvd;

	@Column(name="TOT_N_SPOUSAL_SINT")
	private BigDecimal totNSpousalSint;

	@Column(name="TOT_N_SS_DELQ_RCVD")
	private BigDecimal totNSsDelqRcvd;

	@Column(name="TOT_NONIVE_AMT_REC")
	private BigDecimal totNoniveAmtRec;

	@Column(name="TOT_NURA")
	private BigDecimal totNura;

	@Column(name="TOT_QTD_RCVD")
	private BigDecimal totQtdRcvd;

	@Column(name="TOT_SPOUS_SUP_RCVD")
	private BigDecimal totSpousSupRcvd;

	@Column(name="TOT_SUPPORT_RCVD")
	private BigDecimal totSupportRcvd;

	@Column(name="TOT_URA")
	private BigDecimal totUra;

	@Column(name="TOT_YTD_RCVD")
	private BigDecimal totYtdRcvd;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovmthSummary() {
	}

	public BigDecimal getAChSupInGrace() {
		return this.aChSupInGrace;
	}

	public void setAChSupInGrace(BigDecimal aChSupInGrace) {
		this.aChSupInGrace = aChSupInGrace;
	}

	public BigDecimal getACsInGraceRcvd() {
		return this.aCsInGraceRcvd;
	}

	public void setACsInGraceRcvd(BigDecimal aCsInGraceRcvd) {
		this.aCsInGraceRcvd = aCsInGraceRcvd;
	}

	public BigDecimal getAMdSupInGrace() {
		return this.aMdSupInGrace;
	}

	public void setAMdSupInGrace(BigDecimal aMdSupInGrace) {
		this.aMdSupInGrace = aMdSupInGrace;
	}

	public BigDecimal getAMsInGraceRcvd() {
		return this.aMsInGraceRcvd;
	}

	public void setAMsInGraceRcvd(BigDecimal aMsInGraceRcvd) {
		this.aMsInGraceRcvd = aMsInGraceRcvd;
	}

	public BigDecimal getASpSupInGrace() {
		return this.aSpSupInGrace;
	}

	public void setASpSupInGrace(BigDecimal aSpSupInGrace) {
		this.aSpSupInGrace = aSpSupInGrace;
	}

	public BigDecimal getASsInGraceRcvd() {
		return this.aSsInGraceRcvd;
	}

	public void setASsInGraceRcvd(BigDecimal aSsInGraceRcvd) {
		this.aSsInGraceRcvd = aSsInGraceRcvd;
	}

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public BigDecimal getCtExpGraceRcvd() {
		return this.ctExpGraceRcvd;
	}

	public void setCtExpGraceRcvd(BigDecimal ctExpGraceRcvd) {
		this.ctExpGraceRcvd = ctExpGraceRcvd;
	}

	public BigDecimal getCtMdExpInGrace() {
		return this.ctMdExpInGrace;
	}

	public void setCtMdExpInGrace(BigDecimal ctMdExpInGrace) {
		this.ctMdExpInGrace = ctMdExpInGrace;
	}

	public BigDecimal getDisregardAmt() {
		return this.disregardAmt;
	}

	public void setDisregardAmt(BigDecimal disregardAmt) {
		this.disregardAmt = disregardAmt;
	}

	public BigDecimal getFstSpSupDue() {
		return this.fstSpSupDue;
	}

	public void setFstSpSupDue(BigDecimal fstSpSupDue) {
		this.fstSpSupDue = fstSpSupDue;
	}

	public BigDecimal getFstSupportDue() {
		return this.fstSupportDue;
	}

	public void setFstSupportDue(BigDecimal fstSupportDue) {
		this.fstSupportDue = fstSupportDue;
	}

	public String getIntAccruingInd() {
		return this.intAccruingInd;
	}

	public void setIntAccruingInd(String intAccruingInd) {
		this.intAccruingInd = intAccruingInd;
	}

	public BigDecimal getLastBillAmt() {
		return this.lastBillAmt;
	}

	public void setLastBillAmt(BigDecimal lastBillAmt) {
		this.lastBillAmt = lastBillAmt;
	}

	public Date getLastBillDate() {
		return this.lastBillDate;
	}

	public void setLastBillDate(Date lastBillDate) {
		this.lastBillDate = lastBillDate;
	}

	public Date getLastEmpBillDate() {
		return this.lastEmpBillDate;
	}

	public void setLastEmpBillDate(Date lastEmpBillDate) {
		this.lastEmpBillDate = lastEmpBillDate;
	}

	public String getLastEmpBillId() {
		return this.lastEmpBillId;
	}

	public void setLastEmpBillId(String lastEmpBillId) {
		this.lastEmpBillId = lastEmpBillId;
	}

	public Date getLastIntDate() {
		return this.lastIntDate;
	}

	public void setLastIntDate(Date lastIntDate) {
		this.lastIntDate = lastIntDate;
	}

	public BigDecimal getLastPayAmt() {
		return this.lastPayAmt;
	}

	public void setLastPayAmt(BigDecimal lastPayAmt) {
		this.lastPayAmt = lastPayAmt;
	}

	public Date getLastPayDate() {
		return this.lastPayDate;
	}

	public void setLastPayDate(Date lastPayDate) {
		this.lastPayDate = lastPayDate;
	}

	public BigDecimal getMcExpGraceRcvd() {
		return this.mcExpGraceRcvd;
	}

	public void setMcExpGraceRcvd(BigDecimal mcExpGraceRcvd) {
		this.mcExpGraceRcvd = mcExpGraceRcvd;
	}

	public BigDecimal getMcMdExpInGrace() {
		return this.mcMdExpInGrace;
	}

	public void setMcMdExpInGrace(BigDecimal mcMdExpInGrace) {
		this.mcMdExpInGrace = mcMdExpInGrace;
	}

	public BigDecimal getMtdAfdcGrantPd() {
		return this.mtdAfdcGrantPd;
	}

	public void setMtdAfdcGrantPd(BigDecimal mtdAfdcGrantPd) {
		this.mtdAfdcGrantPd = mtdAfdcGrantPd;
	}

	public BigDecimal getMtdEscrowAmt() {
		return this.mtdEscrowAmt;
	}

	public void setMtdEscrowAmt(BigDecimal mtdEscrowAmt) {
		this.mtdEscrowAmt = mtdEscrowAmt;
	}

	public BigDecimal getMtdNpaCheckAmt() {
		return this.mtdNpaCheckAmt;
	}

	public void setMtdNpaCheckAmt(BigDecimal mtdNpaCheckAmt) {
		this.mtdNpaCheckAmt = mtdNpaCheckAmt;
	}

	public BigDecimal getMthAArrsCint() {
		return this.mthAArrsCint;
	}

	public void setMthAArrsCint(BigDecimal mthAArrsCint) {
		this.mthAArrsCint = mthAArrsCint;
	}

	public BigDecimal getMthAMedCint() {
		return this.mthAMedCint;
	}

	public void setMthAMedCint(BigDecimal mthAMedCint) {
		this.mthAMedCint = mthAMedCint;
	}

	public BigDecimal getMthASpousalCint() {
		return this.mthASpousalCint;
	}

	public void setMthASpousalCint(BigDecimal mthASpousalCint) {
		this.mthASpousalCint = mthASpousalCint;
	}

	public BigDecimal getMthBTstFeeDue() {
		return this.mthBTstFeeDue;
	}

	public void setMthBTstFeeDue(BigDecimal mthBTstFeeDue) {
		this.mthBTstFeeDue = mthBTstFeeDue;
	}

	public BigDecimal getMthBTstFeeRcvd() {
		return this.mthBTstFeeRcvd;
	}

	public void setMthBTstFeeRcvd(BigDecimal mthBTstFeeRcvd) {
		this.mthBTstFeeRcvd = mthBTstFeeRcvd;
	}

	public BigDecimal getMthCcostFeeDue() {
		return this.mthCcostFeeDue;
	}

	public void setMthCcostFeeDue(BigDecimal mthCcostFeeDue) {
		this.mthCcostFeeDue = mthCcostFeeDue;
	}

	public BigDecimal getMthCcostFeeRcvd() {
		return this.mthCcostFeeRcvd;
	}

	public void setMthCcostFeeRcvd(BigDecimal mthCcostFeeRcvd) {
		this.mthCcostFeeRcvd = mthCcostFeeRcvd;
	}

	public BigDecimal getMthCtMdExp() {
		return this.mthCtMdExp;
	}

	public void setMthCtMdExp(BigDecimal mthCtMdExp) {
		this.mthCtMdExp = mthCtMdExp;
	}

	public BigDecimal getMthFlmFeeDue() {
		return this.mthFlmFeeDue;
	}

	public void setMthFlmFeeDue(BigDecimal mthFlmFeeDue) {
		this.mthFlmFeeDue = mthFlmFeeDue;
	}

	public BigDecimal getMthFlmFeeRcvd() {
		return this.mthFlmFeeRcvd;
	}

	public void setMthFlmFeeRcvd(BigDecimal mthFlmFeeRcvd) {
		this.mthFlmFeeRcvd = mthFlmFeeRcvd;
	}

	public BigDecimal getMthGTstFeeDue() {
		return this.mthGTstFeeDue;
	}

	public void setMthGTstFeeDue(BigDecimal mthGTstFeeDue) {
		this.mthGTstFeeDue = mthGTstFeeDue;
	}

	public BigDecimal getMthGTstFeeRcvd() {
		return this.mthGTstFeeRcvd;
	}

	public void setMthGTstFeeRcvd(BigDecimal mthGTstFeeRcvd) {
		this.mthGTstFeeRcvd = mthGTstFeeRcvd;
	}

	public BigDecimal getMthIveAmtRec() {
		return this.mthIveAmtRec;
	}

	public void setMthIveAmtRec(BigDecimal mthIveAmtRec) {
		this.mthIveAmtRec = mthIveAmtRec;
	}

	public BigDecimal getMthMcMdExp() {
		return this.mthMcMdExp;
	}

	public void setMthMcMdExp(BigDecimal mthMcMdExp) {
		this.mthMcMdExp = mthMcMdExp;
	}

	public BigDecimal getMthMdclSupDue() {
		return this.mthMdclSupDue;
	}

	public void setMthMdclSupDue(BigDecimal mthMdclSupDue) {
		this.mthMdclSupDue = mthMdclSupDue;
	}

	public BigDecimal getMthMdclSupRcvd() {
		return this.mthMdclSupRcvd;
	}

	public void setMthMdclSupRcvd(BigDecimal mthMdclSupRcvd) {
		this.mthMdclSupRcvd = mthMdclSupRcvd;
	}

	public BigDecimal getMthNArrsCint() {
		return this.mthNArrsCint;
	}

	public void setMthNArrsCint(BigDecimal mthNArrsCint) {
		this.mthNArrsCint = mthNArrsCint;
	}

	public BigDecimal getMthNMedCint() {
		return this.mthNMedCint;
	}

	public void setMthNMedCint(BigDecimal mthNMedCint) {
		this.mthNMedCint = mthNMedCint;
	}

	public BigDecimal getMthNSpousalCint() {
		return this.mthNSpousalCint;
	}

	public void setMthNSpousalCint(BigDecimal mthNSpousalCint) {
		this.mthNSpousalCint = mthNSpousalCint;
	}

	public BigDecimal getMthNoniveAmtRec() {
		return this.mthNoniveAmtRec;
	}

	public void setMthNoniveAmtRec(BigDecimal mthNoniveAmtRec) {
		this.mthNoniveAmtRec = mthNoniveAmtRec;
	}

	public BigDecimal getMthPastSuppRcvd() {
		return this.mthPastSuppRcvd;
	}

	public void setMthPastSuppRcvd(BigDecimal mthPastSuppRcvd) {
		this.mthPastSuppRcvd = mthPastSuppRcvd;
	}

	public BigDecimal getMthSpousSupDue() {
		return this.mthSpousSupDue;
	}

	public void setMthSpousSupDue(BigDecimal mthSpousSupDue) {
		this.mthSpousSupDue = mthSpousSupDue;
	}

	public BigDecimal getMthSpousSupRcvd() {
		return this.mthSpousSupRcvd;
	}

	public void setMthSpousSupRcvd(BigDecimal mthSpousSupRcvd) {
		this.mthSpousSupRcvd = mthSpousSupRcvd;
	}

	public BigDecimal getMthSuppRetained() {
		return this.mthSuppRetained;
	}

	public void setMthSuppRetained(BigDecimal mthSuppRetained) {
		this.mthSuppRetained = mthSuppRetained;
	}

	public BigDecimal getMthSupportDue() {
		return this.mthSupportDue;
	}

	public void setMthSupportDue(BigDecimal mthSupportDue) {
		this.mthSupportDue = mthSupportDue;
	}

	public BigDecimal getMthSupportRcvd() {
		return this.mthSupportRcvd;
	}

	public void setMthSupportRcvd(BigDecimal mthSupportRcvd) {
		this.mthSupportRcvd = mthSupportRcvd;
	}

	public BigDecimal getNChSupInGrace() {
		return this.nChSupInGrace;
	}

	public void setNChSupInGrace(BigDecimal nChSupInGrace) {
		this.nChSupInGrace = nChSupInGrace;
	}

	public BigDecimal getNCsInGraceRcvd() {
		return this.nCsInGraceRcvd;
	}

	public void setNCsInGraceRcvd(BigDecimal nCsInGraceRcvd) {
		this.nCsInGraceRcvd = nCsInGraceRcvd;
	}

	public BigDecimal getNMdSupInGrace() {
		return this.nMdSupInGrace;
	}

	public void setNMdSupInGrace(BigDecimal nMdSupInGrace) {
		this.nMdSupInGrace = nMdSupInGrace;
	}

	public BigDecimal getNMsInGraceRcvd() {
		return this.nMsInGraceRcvd;
	}

	public void setNMsInGraceRcvd(BigDecimal nMsInGraceRcvd) {
		this.nMsInGraceRcvd = nMsInGraceRcvd;
	}

	public BigDecimal getNSpSupInGrace() {
		return this.nSpSupInGrace;
	}

	public void setNSpSupInGrace(BigDecimal nSpSupInGrace) {
		this.nSpSupInGrace = nSpSupInGrace;
	}

	public BigDecimal getNSsInGraceRcvd() {
		return this.nSsInGraceRcvd;
	}

	public void setNSsInGraceRcvd(BigDecimal nSsInGraceRcvd) {
		this.nSsInGraceRcvd = nSsInGraceRcvd;
	}

	public BigDecimal getPrdMdclBalDue() {
		return this.prdMdclBalDue;
	}

	public void setPrdMdclBalDue(BigDecimal prdMdclBalDue) {
		this.prdMdclBalDue = prdMdclBalDue;
	}

	public BigDecimal getPrdMdclSupDue() {
		return this.prdMdclSupDue;
	}

	public void setPrdMdclSupDue(BigDecimal prdMdclSupDue) {
		this.prdMdclSupDue = prdMdclSupDue;
	}

	public BigDecimal getPrdSpousBalDue() {
		return this.prdSpousBalDue;
	}

	public void setPrdSpousBalDue(BigDecimal prdSpousBalDue) {
		this.prdSpousBalDue = prdSpousBalDue;
	}

	public BigDecimal getPrdSpousalDue() {
		return this.prdSpousalDue;
	}

	public void setPrdSpousalDue(BigDecimal prdSpousalDue) {
		this.prdSpousalDue = prdSpousalDue;
	}

	public Date getPrdStartDate() {
		return this.prdStartDate;
	}

	public void setPrdStartDate(Date prdStartDate) {
		this.prdStartDate = prdStartDate;
	}

	public BigDecimal getPrdSuppBalDue() {
		return this.prdSuppBalDue;
	}

	public void setPrdSuppBalDue(BigDecimal prdSuppBalDue) {
		this.prdSuppBalDue = prdSuppBalDue;
	}

	public BigDecimal getPrdSupportDue() {
		return this.prdSupportDue;
	}

	public void setPrdSupportDue(BigDecimal prdSupportDue) {
		this.prdSupportDue = prdSupportDue;
	}

	public BigDecimal getRpayTotalDue() {
		return this.rpayTotalDue;
	}

	public void setRpayTotalDue(BigDecimal rpayTotalDue) {
		this.rpayTotalDue = rpayTotalDue;
	}

	public BigDecimal getRpayTotalRcvd() {
		return this.rpayTotalRcvd;
	}

	public void setRpayTotalRcvd(BigDecimal rpayTotalRcvd) {
		this.rpayTotalRcvd = rpayTotalRcvd;
	}

	public BigDecimal getSsiRate() {
		return this.ssiRate;
	}

	public void setSsiRate(BigDecimal ssiRate) {
		this.ssiRate = ssiRate;
	}

	public String getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(String timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public BigDecimal getTotAArrsCint() {
		return this.totAArrsCint;
	}

	public void setTotAArrsCint(BigDecimal totAArrsCint) {
		this.totAArrsCint = totAArrsCint;
	}

	public BigDecimal getTotAArrsDue() {
		return this.totAArrsDue;
	}

	public void setTotAArrsDue(BigDecimal totAArrsDue) {
		this.totAArrsDue = totAArrsDue;
	}

	public BigDecimal getTotAArrsRcvd() {
		return this.totAArrsRcvd;
	}

	public void setTotAArrsRcvd(BigDecimal totAArrsRcvd) {
		this.totAArrsRcvd = totAArrsRcvd;
	}

	public BigDecimal getTotAArrsSint() {
		return this.totAArrsSint;
	}

	public void setTotAArrsSint(BigDecimal totAArrsSint) {
		this.totAArrsSint = totAArrsSint;
	}

	public BigDecimal getTotAChSupDelq() {
		return this.totAChSupDelq;
	}

	public void setTotAChSupDelq(BigDecimal totAChSupDelq) {
		this.totAChSupDelq = totAChSupDelq;
	}

	public BigDecimal getTotACsDelqRcvd() {
		return this.totACsDelqRcvd;
	}

	public void setTotACsDelqRcvd(BigDecimal totACsDelqRcvd) {
		this.totACsDelqRcvd = totACsDelqRcvd;
	}

	public BigDecimal getTotAMdSupDelq() {
		return this.totAMdSupDelq;
	}

	public void setTotAMdSupDelq(BigDecimal totAMdSupDelq) {
		this.totAMdSupDelq = totAMdSupDelq;
	}

	public BigDecimal getTotAMedCint() {
		return this.totAMedCint;
	}

	public void setTotAMedCint(BigDecimal totAMedCint) {
		this.totAMedCint = totAMedCint;
	}

	public BigDecimal getTotAMedDue() {
		return this.totAMedDue;
	}

	public void setTotAMedDue(BigDecimal totAMedDue) {
		this.totAMedDue = totAMedDue;
	}

	public BigDecimal getTotAMedSint() {
		return this.totAMedSint;
	}

	public void setTotAMedSint(BigDecimal totAMedSint) {
		this.totAMedSint = totAMedSint;
	}

	public BigDecimal getTotAMedicalRcvd() {
		return this.totAMedicalRcvd;
	}

	public void setTotAMedicalRcvd(BigDecimal totAMedicalRcvd) {
		this.totAMedicalRcvd = totAMedicalRcvd;
	}

	public BigDecimal getTotAMsDelqRcvd() {
		return this.totAMsDelqRcvd;
	}

	public void setTotAMsDelqRcvd(BigDecimal totAMsDelqRcvd) {
		this.totAMsDelqRcvd = totAMsDelqRcvd;
	}

	public BigDecimal getTotASpSupDelq() {
		return this.totASpSupDelq;
	}

	public void setTotASpSupDelq(BigDecimal totASpSupDelq) {
		this.totASpSupDelq = totASpSupDelq;
	}

	public BigDecimal getTotASpousalCint() {
		return this.totASpousalCint;
	}

	public void setTotASpousalCint(BigDecimal totASpousalCint) {
		this.totASpousalCint = totASpousalCint;
	}

	public BigDecimal getTotASpousalDue() {
		return this.totASpousalDue;
	}

	public void setTotASpousalDue(BigDecimal totASpousalDue) {
		this.totASpousalDue = totASpousalDue;
	}

	public BigDecimal getTotASpousalRcvd() {
		return this.totASpousalRcvd;
	}

	public void setTotASpousalRcvd(BigDecimal totASpousalRcvd) {
		this.totASpousalRcvd = totASpousalRcvd;
	}

	public BigDecimal getTotASpousalSint() {
		return this.totASpousalSint;
	}

	public void setTotASpousalSint(BigDecimal totASpousalSint) {
		this.totASpousalSint = totASpousalSint;
	}

	public BigDecimal getTotASsDelqRcvd() {
		return this.totASsDelqRcvd;
	}

	public void setTotASsDelqRcvd(BigDecimal totASsDelqRcvd) {
		this.totASsDelqRcvd = totASsDelqRcvd;
	}

	public BigDecimal getTotAdvanceAmt() {
		return this.totAdvanceAmt;
	}

	public void setTotAdvanceAmt(BigDecimal totAdvanceAmt) {
		this.totAdvanceAmt = totAdvanceAmt;
	}

	public BigDecimal getTotAfdcFutAmt() {
		return this.totAfdcFutAmt;
	}

	public void setTotAfdcFutAmt(BigDecimal totAfdcFutAmt) {
		this.totAfdcFutAmt = totAfdcFutAmt;
	}

	public BigDecimal getTotAfdcGrantPd() {
		return this.totAfdcGrantPd;
	}

	public void setTotAfdcGrantPd(BigDecimal totAfdcGrantPd) {
		this.totAfdcGrantPd = totAfdcGrantPd;
	}

	public BigDecimal getTotBTstFeeDue() {
		return this.totBTstFeeDue;
	}

	public void setTotBTstFeeDue(BigDecimal totBTstFeeDue) {
		this.totBTstFeeDue = totBTstFeeDue;
	}

	public BigDecimal getTotBTstFeeRcvd() {
		return this.totBTstFeeRcvd;
	}

	public void setTotBTstFeeRcvd(BigDecimal totBTstFeeRcvd) {
		this.totBTstFeeRcvd = totBTstFeeRcvd;
	}

	public BigDecimal getTotCcostFeeDue() {
		return this.totCcostFeeDue;
	}

	public void setTotCcostFeeDue(BigDecimal totCcostFeeDue) {
		this.totCcostFeeDue = totCcostFeeDue;
	}

	public BigDecimal getTotCcostFeeRcvd() {
		return this.totCcostFeeRcvd;
	}

	public void setTotCcostFeeRcvd(BigDecimal totCcostFeeRcvd) {
		this.totCcostFeeRcvd = totCcostFeeRcvd;
	}

	public BigDecimal getTotCtMdExpDelq() {
		return this.totCtMdExpDelq;
	}

	public void setTotCtMdExpDelq(BigDecimal totCtMdExpDelq) {
		this.totCtMdExpDelq = totCtMdExpDelq;
	}

	public BigDecimal getTotCtexpDelRcvd() {
		return this.totCtexpDelRcvd;
	}

	public void setTotCtexpDelRcvd(BigDecimal totCtexpDelRcvd) {
		this.totCtexpDelRcvd = totCtexpDelRcvd;
	}

	public BigDecimal getTotEscrowAmt() {
		return this.totEscrowAmt;
	}

	public void setTotEscrowAmt(BigDecimal totEscrowAmt) {
		this.totEscrowAmt = totEscrowAmt;
	}

	public BigDecimal getTotFlmFeeDue() {
		return this.totFlmFeeDue;
	}

	public void setTotFlmFeeDue(BigDecimal totFlmFeeDue) {
		this.totFlmFeeDue = totFlmFeeDue;
	}

	public BigDecimal getTotFlmFeeRcvd() {
		return this.totFlmFeeRcvd;
	}

	public void setTotFlmFeeRcvd(BigDecimal totFlmFeeRcvd) {
		this.totFlmFeeRcvd = totFlmFeeRcvd;
	}

	public BigDecimal getTotGTstFeeDue() {
		return this.totGTstFeeDue;
	}

	public void setTotGTstFeeDue(BigDecimal totGTstFeeDue) {
		this.totGTstFeeDue = totGTstFeeDue;
	}

	public BigDecimal getTotGTstFeeRcvd() {
		return this.totGTstFeeRcvd;
	}

	public void setTotGTstFeeRcvd(BigDecimal totGTstFeeRcvd) {
		this.totGTstFeeRcvd = totGTstFeeRcvd;
	}

	public BigDecimal getTotIveAmtRec() {
		return this.totIveAmtRec;
	}

	public void setTotIveAmtRec(BigDecimal totIveAmtRec) {
		this.totIveAmtRec = totIveAmtRec;
	}

	public BigDecimal getTotMcMdExpDelq() {
		return this.totMcMdExpDelq;
	}

	public void setTotMcMdExpDelq(BigDecimal totMcMdExpDelq) {
		this.totMcMdExpDelq = totMcMdExpDelq;
	}

	public BigDecimal getTotMcexpDelRcvd() {
		return this.totMcexpDelRcvd;
	}

	public void setTotMcexpDelRcvd(BigDecimal totMcexpDelRcvd) {
		this.totMcexpDelRcvd = totMcexpDelRcvd;
	}

	public BigDecimal getTotMdclSupRcvd() {
		return this.totMdclSupRcvd;
	}

	public void setTotMdclSupRcvd(BigDecimal totMdclSupRcvd) {
		this.totMdclSupRcvd = totMdclSupRcvd;
	}

	public BigDecimal getTotNArrsCint() {
		return this.totNArrsCint;
	}

	public void setTotNArrsCint(BigDecimal totNArrsCint) {
		this.totNArrsCint = totNArrsCint;
	}

	public BigDecimal getTotNArrsDue() {
		return this.totNArrsDue;
	}

	public void setTotNArrsDue(BigDecimal totNArrsDue) {
		this.totNArrsDue = totNArrsDue;
	}

	public BigDecimal getTotNArrsRcvd() {
		return this.totNArrsRcvd;
	}

	public void setTotNArrsRcvd(BigDecimal totNArrsRcvd) {
		this.totNArrsRcvd = totNArrsRcvd;
	}

	public BigDecimal getTotNArrsSint() {
		return this.totNArrsSint;
	}

	public void setTotNArrsSint(BigDecimal totNArrsSint) {
		this.totNArrsSint = totNArrsSint;
	}

	public BigDecimal getTotNChSupDelq() {
		return this.totNChSupDelq;
	}

	public void setTotNChSupDelq(BigDecimal totNChSupDelq) {
		this.totNChSupDelq = totNChSupDelq;
	}

	public BigDecimal getTotNCsDelqRcvd() {
		return this.totNCsDelqRcvd;
	}

	public void setTotNCsDelqRcvd(BigDecimal totNCsDelqRcvd) {
		this.totNCsDelqRcvd = totNCsDelqRcvd;
	}

	public BigDecimal getTotNMdSupDelq() {
		return this.totNMdSupDelq;
	}

	public void setTotNMdSupDelq(BigDecimal totNMdSupDelq) {
		this.totNMdSupDelq = totNMdSupDelq;
	}

	public BigDecimal getTotNMedCint() {
		return this.totNMedCint;
	}

	public void setTotNMedCint(BigDecimal totNMedCint) {
		this.totNMedCint = totNMedCint;
	}

	public BigDecimal getTotNMedDue() {
		return this.totNMedDue;
	}

	public void setTotNMedDue(BigDecimal totNMedDue) {
		this.totNMedDue = totNMedDue;
	}

	public BigDecimal getTotNMedSint() {
		return this.totNMedSint;
	}

	public void setTotNMedSint(BigDecimal totNMedSint) {
		this.totNMedSint = totNMedSint;
	}

	public BigDecimal getTotNMedicalRcvd() {
		return this.totNMedicalRcvd;
	}

	public void setTotNMedicalRcvd(BigDecimal totNMedicalRcvd) {
		this.totNMedicalRcvd = totNMedicalRcvd;
	}

	public BigDecimal getTotNMsDelqRcvd() {
		return this.totNMsDelqRcvd;
	}

	public void setTotNMsDelqRcvd(BigDecimal totNMsDelqRcvd) {
		this.totNMsDelqRcvd = totNMsDelqRcvd;
	}

	public BigDecimal getTotNSpSupDelq() {
		return this.totNSpSupDelq;
	}

	public void setTotNSpSupDelq(BigDecimal totNSpSupDelq) {
		this.totNSpSupDelq = totNSpSupDelq;
	}

	public BigDecimal getTotNSpousalCint() {
		return this.totNSpousalCint;
	}

	public void setTotNSpousalCint(BigDecimal totNSpousalCint) {
		this.totNSpousalCint = totNSpousalCint;
	}

	public BigDecimal getTotNSpousalDue() {
		return this.totNSpousalDue;
	}

	public void setTotNSpousalDue(BigDecimal totNSpousalDue) {
		this.totNSpousalDue = totNSpousalDue;
	}

	public BigDecimal getTotNSpousalRcvd() {
		return this.totNSpousalRcvd;
	}

	public void setTotNSpousalRcvd(BigDecimal totNSpousalRcvd) {
		this.totNSpousalRcvd = totNSpousalRcvd;
	}

	public BigDecimal getTotNSpousalSint() {
		return this.totNSpousalSint;
	}

	public void setTotNSpousalSint(BigDecimal totNSpousalSint) {
		this.totNSpousalSint = totNSpousalSint;
	}

	public BigDecimal getTotNSsDelqRcvd() {
		return this.totNSsDelqRcvd;
	}

	public void setTotNSsDelqRcvd(BigDecimal totNSsDelqRcvd) {
		this.totNSsDelqRcvd = totNSsDelqRcvd;
	}

	public BigDecimal getTotNoniveAmtRec() {
		return this.totNoniveAmtRec;
	}

	public void setTotNoniveAmtRec(BigDecimal totNoniveAmtRec) {
		this.totNoniveAmtRec = totNoniveAmtRec;
	}

	public BigDecimal getTotNura() {
		return this.totNura;
	}

	public void setTotNura(BigDecimal totNura) {
		this.totNura = totNura;
	}

	public BigDecimal getTotQtdRcvd() {
		return this.totQtdRcvd;
	}

	public void setTotQtdRcvd(BigDecimal totQtdRcvd) {
		this.totQtdRcvd = totQtdRcvd;
	}

	public BigDecimal getTotSpousSupRcvd() {
		return this.totSpousSupRcvd;
	}

	public void setTotSpousSupRcvd(BigDecimal totSpousSupRcvd) {
		this.totSpousSupRcvd = totSpousSupRcvd;
	}

	public BigDecimal getTotSupportRcvd() {
		return this.totSupportRcvd;
	}

	public void setTotSupportRcvd(BigDecimal totSupportRcvd) {
		this.totSupportRcvd = totSupportRcvd;
	}

	public BigDecimal getTotUra() {
		return this.totUra;
	}

	public void setTotUra(BigDecimal totUra) {
		this.totUra = totUra;
	}

	public BigDecimal getTotYtdRcvd() {
		return this.totYtdRcvd;
	}

	public void setTotYtdRcvd(BigDecimal totYtdRcvd) {
		this.totYtdRcvd = totYtdRcvd;
	}

	public String getUidUpdated() {
		return this.uidUpdated;
	}

	public void setUidUpdated(String uidUpdated) {
		this.uidUpdated = uidUpdated;
	}

}