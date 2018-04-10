package com.swv.oscar.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the WEOVCASE_CHILD database table.
 * 
 */
@Entity
@Table(name="WEOVCASE_CHILD")
@NamedQuery(name="WeovcaseChild.findAll", query="SELECT w FROM WeovcaseChild w")
public class WeovcaseChild implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADVANCE_AMT")
	private BigDecimal advanceAmt;

	@Column(name="AFDC_CURR_BENEFIT")
	private BigDecimal afdcCurrBenefit;

	@Column(name="AP_REL_CD")
	private String apRelCd;

	@Column(name="ARRS_AFDC_AMT")
	private BigDecimal arrsAfdcAmt;

	@Column(name="ARRS_INT_AFDC_AMT")
	private BigDecimal arrsIntAfdcAmt;

	@Column(name="ARRS_INT_NAFDC_AMT")
	private BigDecimal arrsIntNafdcAmt;

	@Column(name="ARRS_INT_TC_AMT")
	private BigDecimal arrsIntTcAmt;

	@Column(name="ARRS_INT_U_AMT")
	private BigDecimal arrsIntUAmt;

	@Column(name="ARRS_NAFDC_AMT")
	private BigDecimal arrsNafdcAmt;

	@Column(name="ARRS_REIMB_INT_AMT")
	private BigDecimal arrsReimbIntAmt;

	@Column(name="ARRS_TC_AMT")
	private BigDecimal arrsTcAmt;

	@Column(name="ARRS_U_AMT")
	private BigDecimal arrsUAmt;
	
	@Id
	@Column(name="CASE_ID")
	private BigDecimal caseId;

	@Column(name="CHILD_AMT")
	private BigDecimal childAmt;

	@Column(name="CS_PAST_20")
	private String csPast20;

	@Column(name="CTKR_REL_CD")
	private String ctkrRelCd;

	@Column(name="DEPRIVATION_CODE")
	private String deprivationCode;

	@Column(name="FIRST_BLOOD_PROB")
	private BigDecimal firstBloodProb;

	@Column(name="FUTURE_AMT")
	private BigDecimal futureAmt;

	@Column(name="IN_ORDER_IND")
	private String inOrderInd;

	@Column(name="INC_BLOOD_ORDER")
	private String incBloodOrder;

	@Column(name="INC_BLOOD_ORDER2")
	private String incBloodOrder2;

	@Column(name="IV_A_REMOVAL_DATE")
	private Date ivARemovalDate;

	@Column(name="IV_A_REMOVAL_RSN")
	private String ivARemovalRsn;

	@Column(name="IV_D_REMOVAL_DATE")
	private Date ivDRemovalDate;

	@Column(name="IV_D_REMOVAL_RSN")
	private String ivDRemovalRsn;

	@Column(name="OBLIGATION_AMT")
	private BigDecimal obligationAmt;

	@Column(name="OBLIGATION_FREQ")
	private String obligationFreq;

	@Column(name="OUT_OF_WEDLOCK")
	private String outOfWedlock;

	@Column(name="PATERNITY_DATE")
	private Date paternityDate;

	@Column(name="PATERNITY_STATUS")
	private String paternityStatus;

	@Column(name="PAY_UNTIL_18_IND")
	private String payUntil18Ind;

	@Column(name="PIN")
	private BigDecimal pin;

	@Column(name="REIMB_ARRS_AMT")
	private BigDecimal reimbArrsAmt;

	@Column(name="SECOND_BLOOD_PROB")
	private BigDecimal secondBloodProb;

	@Column(name="STATUTRY_DEBIT_AMT")
	private BigDecimal statutryDebitAmt;

	@Column(name="TIME_UPDATED")
	private Timestamp timeUpdated;

	@Column(name="TOT_AFDC_AMT")
	private BigDecimal totAfdcAmt;

	@Column(name="TOT_NAFDC_AMT")
	private BigDecimal totNafdcAmt;

	@Column(name="TOT_SUPP_RCVD_AMT")
	private BigDecimal totSuppRcvdAmt;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="UNREIM_ARS_ACR_AMT")
	private BigDecimal unreimArsAcrAmt;

	public WeovcaseChild() {
	}

	public BigDecimal getAdvanceAmt() {
		return this.advanceAmt;
	}

	public void setAdvanceAmt(BigDecimal advanceAmt) {
		this.advanceAmt = advanceAmt;
	}

	public BigDecimal getAfdcCurrBenefit() {
		return this.afdcCurrBenefit;
	}

	public void setAfdcCurrBenefit(BigDecimal afdcCurrBenefit) {
		this.afdcCurrBenefit = afdcCurrBenefit;
	}

	public String getApRelCd() {
		return this.apRelCd;
	}

	public void setApRelCd(String apRelCd) {
		this.apRelCd = apRelCd;
	}

	public BigDecimal getArrsAfdcAmt() {
		return this.arrsAfdcAmt;
	}

	public void setArrsAfdcAmt(BigDecimal arrsAfdcAmt) {
		this.arrsAfdcAmt = arrsAfdcAmt;
	}

	public BigDecimal getArrsIntAfdcAmt() {
		return this.arrsIntAfdcAmt;
	}

	public void setArrsIntAfdcAmt(BigDecimal arrsIntAfdcAmt) {
		this.arrsIntAfdcAmt = arrsIntAfdcAmt;
	}

	public BigDecimal getArrsIntNafdcAmt() {
		return this.arrsIntNafdcAmt;
	}

	public void setArrsIntNafdcAmt(BigDecimal arrsIntNafdcAmt) {
		this.arrsIntNafdcAmt = arrsIntNafdcAmt;
	}

	public BigDecimal getArrsIntTcAmt() {
		return this.arrsIntTcAmt;
	}

	public void setArrsIntTcAmt(BigDecimal arrsIntTcAmt) {
		this.arrsIntTcAmt = arrsIntTcAmt;
	}

	public BigDecimal getArrsIntUAmt() {
		return this.arrsIntUAmt;
	}

	public void setArrsIntUAmt(BigDecimal arrsIntUAmt) {
		this.arrsIntUAmt = arrsIntUAmt;
	}

	public BigDecimal getArrsNafdcAmt() {
		return this.arrsNafdcAmt;
	}

	public void setArrsNafdcAmt(BigDecimal arrsNafdcAmt) {
		this.arrsNafdcAmt = arrsNafdcAmt;
	}

	public BigDecimal getArrsReimbIntAmt() {
		return this.arrsReimbIntAmt;
	}

	public void setArrsReimbIntAmt(BigDecimal arrsReimbIntAmt) {
		this.arrsReimbIntAmt = arrsReimbIntAmt;
	}

	public BigDecimal getArrsTcAmt() {
		return this.arrsTcAmt;
	}

	public void setArrsTcAmt(BigDecimal arrsTcAmt) {
		this.arrsTcAmt = arrsTcAmt;
	}

	public BigDecimal getArrsUAmt() {
		return this.arrsUAmt;
	}

	public void setArrsUAmt(BigDecimal arrsUAmt) {
		this.arrsUAmt = arrsUAmt;
	}

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public BigDecimal getChildAmt() {
		return this.childAmt;
	}

	public void setChildAmt(BigDecimal childAmt) {
		this.childAmt = childAmt;
	}

	public String getCsPast20() {
		return this.csPast20;
	}

	public void setCsPast20(String csPast20) {
		this.csPast20 = csPast20;
	}

	public String getCtkrRelCd() {
		return this.ctkrRelCd;
	}

	public void setCtkrRelCd(String ctkrRelCd) {
		this.ctkrRelCd = ctkrRelCd;
	}

	public String getDeprivationCode() {
		return this.deprivationCode;
	}

	public void setDeprivationCode(String deprivationCode) {
		this.deprivationCode = deprivationCode;
	}

	public BigDecimal getFirstBloodProb() {
		return this.firstBloodProb;
	}

	public void setFirstBloodProb(BigDecimal firstBloodProb) {
		this.firstBloodProb = firstBloodProb;
	}

	public BigDecimal getFutureAmt() {
		return this.futureAmt;
	}

	public void setFutureAmt(BigDecimal futureAmt) {
		this.futureAmt = futureAmt;
	}

	public String getInOrderInd() {
		return this.inOrderInd;
	}

	public void setInOrderInd(String inOrderInd) {
		this.inOrderInd = inOrderInd;
	}

	public String getIncBloodOrder() {
		return this.incBloodOrder;
	}

	public void setIncBloodOrder(String incBloodOrder) {
		this.incBloodOrder = incBloodOrder;
	}

	public String getIncBloodOrder2() {
		return this.incBloodOrder2;
	}

	public void setIncBloodOrder2(String incBloodOrder2) {
		this.incBloodOrder2 = incBloodOrder2;
	}

	public Date getIvARemovalDate() {
		return this.ivARemovalDate;
	}

	public void setIvARemovalDate(Date ivARemovalDate) {
		this.ivARemovalDate = ivARemovalDate;
	}

	public String getIvARemovalRsn() {
		return this.ivARemovalRsn;
	}

	public void setIvARemovalRsn(String ivARemovalRsn) {
		this.ivARemovalRsn = ivARemovalRsn;
	}

	public Date getIvDRemovalDate() {
		return this.ivDRemovalDate;
	}

	public void setIvDRemovalDate(Date ivDRemovalDate) {
		this.ivDRemovalDate = ivDRemovalDate;
	}

	public String getIvDRemovalRsn() {
		return this.ivDRemovalRsn;
	}

	public void setIvDRemovalRsn(String ivDRemovalRsn) {
		this.ivDRemovalRsn = ivDRemovalRsn;
	}

	public BigDecimal getObligationAmt() {
		return this.obligationAmt;
	}

	public void setObligationAmt(BigDecimal obligationAmt) {
		this.obligationAmt = obligationAmt;
	}

	public String getObligationFreq() {
		return this.obligationFreq;
	}

	public void setObligationFreq(String obligationFreq) {
		this.obligationFreq = obligationFreq;
	}

	public String getOutOfWedlock() {
		return this.outOfWedlock;
	}

	public void setOutOfWedlock(String outOfWedlock) {
		this.outOfWedlock = outOfWedlock;
	}

	public Date getPaternityDate() {
		return this.paternityDate;
	}

	public void setPaternityDate(Date paternityDate) {
		this.paternityDate = paternityDate;
	}

	public String getPaternityStatus() {
		return this.paternityStatus;
	}

	public void setPaternityStatus(String paternityStatus) {
		this.paternityStatus = paternityStatus;
	}

	public String getPayUntil18Ind() {
		return this.payUntil18Ind;
	}

	public void setPayUntil18Ind(String payUntil18Ind) {
		this.payUntil18Ind = payUntil18Ind;
	}

	public BigDecimal getPin() {
		return this.pin;
	}

	public void setPin(BigDecimal pin) {
		this.pin = pin;
	}

	public BigDecimal getReimbArrsAmt() {
		return this.reimbArrsAmt;
	}

	public void setReimbArrsAmt(BigDecimal reimbArrsAmt) {
		this.reimbArrsAmt = reimbArrsAmt;
	}

	public BigDecimal getSecondBloodProb() {
		return this.secondBloodProb;
	}

	public void setSecondBloodProb(BigDecimal secondBloodProb) {
		this.secondBloodProb = secondBloodProb;
	}

	public BigDecimal getStatutryDebitAmt() {
		return this.statutryDebitAmt;
	}

	public void setStatutryDebitAmt(BigDecimal statutryDebitAmt) {
		this.statutryDebitAmt = statutryDebitAmt;
	}

	public Timestamp getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(Timestamp timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public BigDecimal getTotAfdcAmt() {
		return this.totAfdcAmt;
	}

	public void setTotAfdcAmt(BigDecimal totAfdcAmt) {
		this.totAfdcAmt = totAfdcAmt;
	}

	public BigDecimal getTotNafdcAmt() {
		return this.totNafdcAmt;
	}

	public void setTotNafdcAmt(BigDecimal totNafdcAmt) {
		this.totNafdcAmt = totNafdcAmt;
	}

	public BigDecimal getTotSuppRcvdAmt() {
		return this.totSuppRcvdAmt;
	}

	public void setTotSuppRcvdAmt(BigDecimal totSuppRcvdAmt) {
		this.totSuppRcvdAmt = totSuppRcvdAmt;
	}

	public String getUidUpdated() {
		return this.uidUpdated;
	}

	public void setUidUpdated(String uidUpdated) {
		this.uidUpdated = uidUpdated;
	}

	public BigDecimal getUnreimArsAcrAmt() {
		return this.unreimArsAcrAmt;
	}

	public void setUnreimArsAcrAmt(BigDecimal unreimArsAcrAmt) {
		this.unreimArsAcrAmt = unreimArsAcrAmt;
	}

}