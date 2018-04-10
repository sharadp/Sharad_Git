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
 * The persistent class for the WEOVMTH_SUMMARY_PW database table.
 * 
 */
@Entity
@Table(name="WEOVMTH_SUMMARY_PW")
@NamedQuery(name="WeovmthSummaryPw.findAll", query="SELECT w FROM WeovmthSummaryPw w")
public class WeovmthSummaryPw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="A_ARS_CINT_RCV")
	private BigDecimal aArsCintRcv;

	@Column(name="A_ARS_SINT_RCV")
	private BigDecimal aArsSintRcv;

	@Column(name="A_MED_CINT_RCV")
	private BigDecimal aMedCintRcv;

	@Column(name="A_MED_SINT_RCV")
	private BigDecimal aMedSintRcv;

	@Column(name="A_SS_CINT_RCV")
	private BigDecimal aSsCintRcv;

	@Column(name="A_SS_SINT_RCV")
	private BigDecimal aSsSintRcv;

	@Column(name="BCSE_AP_DEBT_DUE")
	private BigDecimal bcseApDebtDue;

	@Column(name="BCSE_AP_DEBT_RCVD")
	private BigDecimal bcseApDebtRcvd;

	@Id
	@Column(name="CASE_ID")
	private BigDecimal caseId;

	@Column(name="CT_MD_ARS_RCV")
	private BigDecimal ctMdArsRcv;

	@Column(name="CT_MD_EXP_ARS")
	private BigDecimal ctMdExpArs;

	@Column(name="CT_MD_EXP_CINT")
	private BigDecimal ctMdExpCint;

	@Column(name="CT_MD_EXP_CINT_RCV")
	private BigDecimal ctMdExpCintRcv;

	@Column(name="CT_MD_EXP_SINT")
	private BigDecimal ctMdExpSint;

	@Column(name="CT_MD_EXP_SINT_RCV")
	private BigDecimal ctMdExpSintRcv;

	@Column(name="CURR_PRD_URA")
	private BigDecimal currPrdUra;

	@Column(name="CURR_PRD_URA_RCVD")
	private BigDecimal currPrdUraRcvd;

	@Column(name="IVA_TOT_URA")
	private BigDecimal ivaTotUra;

	@Column(name="IVA_TOT_URA_RCVD")
	private BigDecimal ivaTotUraRcvd;

	@Column(name="M_CT_MDEXP_INT_RCV")
	private BigDecimal mCtMdexpIntRcv;

	@Column(name="M_MC_MDEXP_INT_RCV")
	private BigDecimal mMcMdexpIntRcv;

	@Column(name="MC_MD_ARS_RCV")
	private BigDecimal mcMdArsRcv;

	@Column(name="MC_MD_EXP_ARS")
	private BigDecimal mcMdExpArs;

	@Column(name="MC_MD_EXP_CINT")
	private BigDecimal mcMdExpCint;

	@Column(name="MC_MD_EXP_CINT_RCV")
	private BigDecimal mcMdExpCintRcv;

	@Column(name="MC_MD_EXP_SINT")
	private BigDecimal mcMdExpSint;

	@Column(name="MC_MD_EXP_SINT_RCV")
	private BigDecimal mcMdExpSintRcv;

	@Column(name="MTH_A_ARS_INT_RCV")
	private BigDecimal mthAArsIntRcv;

	@Column(name="MTH_A_MED_INT_RCV")
	private BigDecimal mthAMedIntRcv;

	@Column(name="MTH_A_SS_INT_RCV")
	private BigDecimal mthASsIntRcv;

	@Column(name="MTH_CT_MD_EXP_INT")
	private BigDecimal mthCtMdExpInt;

	@Column(name="MTH_CT_MD_EXP_RCV")
	private BigDecimal mthCtMdExpRcv;

	@Column(name="MTH_MC_MD_EXP_INT")
	private BigDecimal mthMcMdExpInt;

	@Column(name="MTH_MC_MD_EXP_RCV")
	private BigDecimal mthMcMdExpRcv;

	@Column(name="MTH_N_ARS_INT_RCV")
	private BigDecimal mthNArsIntRcv;

	@Column(name="MTH_N_MED_INT_RCV")
	private BigDecimal mthNMedIntRcv;

	@Column(name="MTH_N_SS_INT_RCV")
	private BigDecimal mthNSsIntRcv;

	@Column(name="MTH_TC_ARS_INT")
	private BigDecimal mthTcArsInt;

	@Column(name="MTH_TC_ARS_INT_RCV")
	private BigDecimal mthTcArsIntRcv;

	@Column(name="MTH_TC_SS_INT")
	private BigDecimal mthTcSsInt;

	@Column(name="MTH_TC_SS_INT_RCV")
	private BigDecimal mthTcSsIntRcv;

	@Column(name="MTH_U_ARS_INT")
	private BigDecimal mthUArsInt;

	@Column(name="MTH_U_ARS_INT_RCV")
	private BigDecimal mthUArsIntRcv;

	@Column(name="MTH_U_SS_INT")
	private BigDecimal mthUSsInt;

	@Column(name="MTH_U_SS_INT_RCV")
	private BigDecimal mthUSsIntRcv;

	@Column(name="N_ARS_CINT_RCV")
	private BigDecimal nArsCintRcv;

	@Column(name="N_ARS_SINT_RCV")
	private BigDecimal nArsSintRcv;

	@Column(name="N_MED_CINT_RCV")
	private BigDecimal nMedCintRcv;

	@Column(name="N_MED_SINT_RCV")
	private BigDecimal nMedSintRcv;

	@Column(name="N_SS_CINT_RCV")
	private BigDecimal nSsCintRcv;

	@Column(name="N_SS_SINT_RCV")
	private BigDecimal nSsSintRcv;

	@Column(name="PRD_START_DATE")
	private Date prdStartDate;

	@Column(name="TC_ARS_CINT")
	private BigDecimal tcArsCint;

	@Column(name="TC_ARS_CINT_RCV")
	private BigDecimal tcArsCintRcv;

	@Column(name="TC_ARS_DUE")
	private BigDecimal tcArsDue;

	@Column(name="TC_ARS_RCV")
	private BigDecimal tcArsRcv;

	@Column(name="TC_ARS_SINT")
	private BigDecimal tcArsSint;

	@Column(name="TC_ARS_SINT_RCV")
	private BigDecimal tcArsSintRcv;

	@Column(name="TC_CH_SUP_DEL")
	private BigDecimal tcChSupDel;

	@Column(name="TC_CH_SUP_IN_GRACE")
	private BigDecimal tcChSupInGrace;

	@Column(name="TC_CS_DEL_RCV")
	private BigDecimal tcCsDelRcv;

	@Column(name="TC_CS_IN_GRACE_RCV")
	private BigDecimal tcCsInGraceRcv;

	@Column(name="TC_SS_CINT")
	private BigDecimal tcSsCint;

	@Column(name="TC_SS_CINT_RCV")
	private BigDecimal tcSsCintRcv;

	@Column(name="TC_SS_DEL")
	private BigDecimal tcSsDel;

	@Column(name="TC_SS_DEL_RCV")
	private BigDecimal tcSsDelRcv;

	@Column(name="TC_SS_DUE")
	private BigDecimal tcSsDue;

	@Column(name="TC_SS_IN_GRACE")
	private BigDecimal tcSsInGrace;

	@Column(name="TC_SS_IN_GRACE_RCV")
	private BigDecimal tcSsInGraceRcv;

	@Column(name="TC_SS_RCV")
	private BigDecimal tcSsRcv;

	@Column(name="TC_SS_SINT")
	private BigDecimal tcSsSint;

	@Column(name="TC_SS_SINT_RCV")
	private BigDecimal tcSsSintRcv;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="TOT_NURA_RCVD")
	private BigDecimal totNuraRcvd;

	@Column(name="TOT_URA_RCVD")
	private BigDecimal totUraRcvd;

	@Column(name="U_ARS_CINT")
	private BigDecimal uArsCint;

	@Column(name="U_ARS_CINT_RCV")
	private BigDecimal uArsCintRcv;

	@Column(name="U_ARS_DUE")
	private BigDecimal uArsDue;

	@Column(name="U_ARS_RCV")
	private BigDecimal uArsRcv;

	@Column(name="U_ARS_SINT")
	private BigDecimal uArsSint;

	@Column(name="U_ARS_SINT_RCV")
	private BigDecimal uArsSintRcv;

	@Column(name="U_CH_SUP_DEL")
	private BigDecimal uChSupDel;

	@Column(name="U_CH_SUP_IN_GRACE")
	private BigDecimal uChSupInGrace;

	@Column(name="U_CS_DEL_RCV")
	private BigDecimal uCsDelRcv;

	@Column(name="U_CS_IN_GRACE_RCV")
	private BigDecimal uCsInGraceRcv;

	@Column(name="U_SS_CINT")
	private BigDecimal uSsCint;

	@Column(name="U_SS_CINT_RCV")
	private BigDecimal uSsCintRcv;

	@Column(name="U_SS_DEL")
	private BigDecimal uSsDel;

	@Column(name="U_SS_DEL_RCV")
	private BigDecimal uSsDelRcv;

	@Column(name="U_SS_DUE")
	private BigDecimal uSsDue;

	@Column(name="U_SS_IN_GRACE")
	private BigDecimal uSsInGrace;

	@Column(name="U_SS_IN_GRACE_RCV")
	private BigDecimal uSsInGraceRcv;

	@Column(name="U_SS_RCV")
	private BigDecimal uSsRcv;

	@Column(name="U_SS_SINT")
	private BigDecimal uSsSint;

	@Column(name="U_SS_SINT_RCV")
	private BigDecimal uSsSintRcv;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	public WeovmthSummaryPw() {
	}

	public BigDecimal getAArsCintRcv() {
		return this.aArsCintRcv;
	}

	public void setAArsCintRcv(BigDecimal aArsCintRcv) {
		this.aArsCintRcv = aArsCintRcv;
	}

	public BigDecimal getAArsSintRcv() {
		return this.aArsSintRcv;
	}

	public void setAArsSintRcv(BigDecimal aArsSintRcv) {
		this.aArsSintRcv = aArsSintRcv;
	}

	public BigDecimal getAMedCintRcv() {
		return this.aMedCintRcv;
	}

	public void setAMedCintRcv(BigDecimal aMedCintRcv) {
		this.aMedCintRcv = aMedCintRcv;
	}

	public BigDecimal getAMedSintRcv() {
		return this.aMedSintRcv;
	}

	public void setAMedSintRcv(BigDecimal aMedSintRcv) {
		this.aMedSintRcv = aMedSintRcv;
	}

	public BigDecimal getASsCintRcv() {
		return this.aSsCintRcv;
	}

	public void setASsCintRcv(BigDecimal aSsCintRcv) {
		this.aSsCintRcv = aSsCintRcv;
	}

	public BigDecimal getASsSintRcv() {
		return this.aSsSintRcv;
	}

	public void setASsSintRcv(BigDecimal aSsSintRcv) {
		this.aSsSintRcv = aSsSintRcv;
	}

	public BigDecimal getBcseApDebtDue() {
		return this.bcseApDebtDue;
	}

	public void setBcseApDebtDue(BigDecimal bcseApDebtDue) {
		this.bcseApDebtDue = bcseApDebtDue;
	}

	public BigDecimal getBcseApDebtRcvd() {
		return this.bcseApDebtRcvd;
	}

	public void setBcseApDebtRcvd(BigDecimal bcseApDebtRcvd) {
		this.bcseApDebtRcvd = bcseApDebtRcvd;
	}

	public BigDecimal getCaseId() {
		return this.caseId;
	}

	public void setCaseId(BigDecimal caseId) {
		this.caseId = caseId;
	}

	public BigDecimal getCtMdArsRcv() {
		return this.ctMdArsRcv;
	}

	public void setCtMdArsRcv(BigDecimal ctMdArsRcv) {
		this.ctMdArsRcv = ctMdArsRcv;
	}

	public BigDecimal getCtMdExpArs() {
		return this.ctMdExpArs;
	}

	public void setCtMdExpArs(BigDecimal ctMdExpArs) {
		this.ctMdExpArs = ctMdExpArs;
	}

	public BigDecimal getCtMdExpCint() {
		return this.ctMdExpCint;
	}

	public void setCtMdExpCint(BigDecimal ctMdExpCint) {
		this.ctMdExpCint = ctMdExpCint;
	}

	public BigDecimal getCtMdExpCintRcv() {
		return this.ctMdExpCintRcv;
	}

	public void setCtMdExpCintRcv(BigDecimal ctMdExpCintRcv) {
		this.ctMdExpCintRcv = ctMdExpCintRcv;
	}

	public BigDecimal getCtMdExpSint() {
		return this.ctMdExpSint;
	}

	public void setCtMdExpSint(BigDecimal ctMdExpSint) {
		this.ctMdExpSint = ctMdExpSint;
	}

	public BigDecimal getCtMdExpSintRcv() {
		return this.ctMdExpSintRcv;
	}

	public void setCtMdExpSintRcv(BigDecimal ctMdExpSintRcv) {
		this.ctMdExpSintRcv = ctMdExpSintRcv;
	}

	public BigDecimal getCurrPrdUra() {
		return this.currPrdUra;
	}

	public void setCurrPrdUra(BigDecimal currPrdUra) {
		this.currPrdUra = currPrdUra;
	}

	public BigDecimal getCurrPrdUraRcvd() {
		return this.currPrdUraRcvd;
	}

	public void setCurrPrdUraRcvd(BigDecimal currPrdUraRcvd) {
		this.currPrdUraRcvd = currPrdUraRcvd;
	}

	public BigDecimal getIvaTotUra() {
		return this.ivaTotUra;
	}

	public void setIvaTotUra(BigDecimal ivaTotUra) {
		this.ivaTotUra = ivaTotUra;
	}

	public BigDecimal getIvaTotUraRcvd() {
		return this.ivaTotUraRcvd;
	}

	public void setIvaTotUraRcvd(BigDecimal ivaTotUraRcvd) {
		this.ivaTotUraRcvd = ivaTotUraRcvd;
	}

	public BigDecimal getMCtMdexpIntRcv() {
		return this.mCtMdexpIntRcv;
	}

	public void setMCtMdexpIntRcv(BigDecimal mCtMdexpIntRcv) {
		this.mCtMdexpIntRcv = mCtMdexpIntRcv;
	}

	public BigDecimal getMMcMdexpIntRcv() {
		return this.mMcMdexpIntRcv;
	}

	public void setMMcMdexpIntRcv(BigDecimal mMcMdexpIntRcv) {
		this.mMcMdexpIntRcv = mMcMdexpIntRcv;
	}

	public BigDecimal getMcMdArsRcv() {
		return this.mcMdArsRcv;
	}

	public void setMcMdArsRcv(BigDecimal mcMdArsRcv) {
		this.mcMdArsRcv = mcMdArsRcv;
	}

	public BigDecimal getMcMdExpArs() {
		return this.mcMdExpArs;
	}

	public void setMcMdExpArs(BigDecimal mcMdExpArs) {
		this.mcMdExpArs = mcMdExpArs;
	}

	public BigDecimal getMcMdExpCint() {
		return this.mcMdExpCint;
	}

	public void setMcMdExpCint(BigDecimal mcMdExpCint) {
		this.mcMdExpCint = mcMdExpCint;
	}

	public BigDecimal getMcMdExpCintRcv() {
		return this.mcMdExpCintRcv;
	}

	public void setMcMdExpCintRcv(BigDecimal mcMdExpCintRcv) {
		this.mcMdExpCintRcv = mcMdExpCintRcv;
	}

	public BigDecimal getMcMdExpSint() {
		return this.mcMdExpSint;
	}

	public void setMcMdExpSint(BigDecimal mcMdExpSint) {
		this.mcMdExpSint = mcMdExpSint;
	}

	public BigDecimal getMcMdExpSintRcv() {
		return this.mcMdExpSintRcv;
	}

	public void setMcMdExpSintRcv(BigDecimal mcMdExpSintRcv) {
		this.mcMdExpSintRcv = mcMdExpSintRcv;
	}

	public BigDecimal getMthAArsIntRcv() {
		return this.mthAArsIntRcv;
	}

	public void setMthAArsIntRcv(BigDecimal mthAArsIntRcv) {
		this.mthAArsIntRcv = mthAArsIntRcv;
	}

	public BigDecimal getMthAMedIntRcv() {
		return this.mthAMedIntRcv;
	}

	public void setMthAMedIntRcv(BigDecimal mthAMedIntRcv) {
		this.mthAMedIntRcv = mthAMedIntRcv;
	}

	public BigDecimal getMthASsIntRcv() {
		return this.mthASsIntRcv;
	}

	public void setMthASsIntRcv(BigDecimal mthASsIntRcv) {
		this.mthASsIntRcv = mthASsIntRcv;
	}

	public BigDecimal getMthCtMdExpInt() {
		return this.mthCtMdExpInt;
	}

	public void setMthCtMdExpInt(BigDecimal mthCtMdExpInt) {
		this.mthCtMdExpInt = mthCtMdExpInt;
	}

	public BigDecimal getMthCtMdExpRcv() {
		return this.mthCtMdExpRcv;
	}

	public void setMthCtMdExpRcv(BigDecimal mthCtMdExpRcv) {
		this.mthCtMdExpRcv = mthCtMdExpRcv;
	}

	public BigDecimal getMthMcMdExpInt() {
		return this.mthMcMdExpInt;
	}

	public void setMthMcMdExpInt(BigDecimal mthMcMdExpInt) {
		this.mthMcMdExpInt = mthMcMdExpInt;
	}

	public BigDecimal getMthMcMdExpRcv() {
		return this.mthMcMdExpRcv;
	}

	public void setMthMcMdExpRcv(BigDecimal mthMcMdExpRcv) {
		this.mthMcMdExpRcv = mthMcMdExpRcv;
	}

	public BigDecimal getMthNArsIntRcv() {
		return this.mthNArsIntRcv;
	}

	public void setMthNArsIntRcv(BigDecimal mthNArsIntRcv) {
		this.mthNArsIntRcv = mthNArsIntRcv;
	}

	public BigDecimal getMthNMedIntRcv() {
		return this.mthNMedIntRcv;
	}

	public void setMthNMedIntRcv(BigDecimal mthNMedIntRcv) {
		this.mthNMedIntRcv = mthNMedIntRcv;
	}

	public BigDecimal getMthNSsIntRcv() {
		return this.mthNSsIntRcv;
	}

	public void setMthNSsIntRcv(BigDecimal mthNSsIntRcv) {
		this.mthNSsIntRcv = mthNSsIntRcv;
	}

	public BigDecimal getMthTcArsInt() {
		return this.mthTcArsInt;
	}

	public void setMthTcArsInt(BigDecimal mthTcArsInt) {
		this.mthTcArsInt = mthTcArsInt;
	}

	public BigDecimal getMthTcArsIntRcv() {
		return this.mthTcArsIntRcv;
	}

	public void setMthTcArsIntRcv(BigDecimal mthTcArsIntRcv) {
		this.mthTcArsIntRcv = mthTcArsIntRcv;
	}

	public BigDecimal getMthTcSsInt() {
		return this.mthTcSsInt;
	}

	public void setMthTcSsInt(BigDecimal mthTcSsInt) {
		this.mthTcSsInt = mthTcSsInt;
	}

	public BigDecimal getMthTcSsIntRcv() {
		return this.mthTcSsIntRcv;
	}

	public void setMthTcSsIntRcv(BigDecimal mthTcSsIntRcv) {
		this.mthTcSsIntRcv = mthTcSsIntRcv;
	}

	public BigDecimal getMthUArsInt() {
		return this.mthUArsInt;
	}

	public void setMthUArsInt(BigDecimal mthUArsInt) {
		this.mthUArsInt = mthUArsInt;
	}

	public BigDecimal getMthUArsIntRcv() {
		return this.mthUArsIntRcv;
	}

	public void setMthUArsIntRcv(BigDecimal mthUArsIntRcv) {
		this.mthUArsIntRcv = mthUArsIntRcv;
	}

	public BigDecimal getMthUSsInt() {
		return this.mthUSsInt;
	}

	public void setMthUSsInt(BigDecimal mthUSsInt) {
		this.mthUSsInt = mthUSsInt;
	}

	public BigDecimal getMthUSsIntRcv() {
		return this.mthUSsIntRcv;
	}

	public void setMthUSsIntRcv(BigDecimal mthUSsIntRcv) {
		this.mthUSsIntRcv = mthUSsIntRcv;
	}

	public BigDecimal getNArsCintRcv() {
		return this.nArsCintRcv;
	}

	public void setNArsCintRcv(BigDecimal nArsCintRcv) {
		this.nArsCintRcv = nArsCintRcv;
	}

	public BigDecimal getNArsSintRcv() {
		return this.nArsSintRcv;
	}

	public void setNArsSintRcv(BigDecimal nArsSintRcv) {
		this.nArsSintRcv = nArsSintRcv;
	}

	public BigDecimal getNMedCintRcv() {
		return this.nMedCintRcv;
	}

	public void setNMedCintRcv(BigDecimal nMedCintRcv) {
		this.nMedCintRcv = nMedCintRcv;
	}

	public BigDecimal getNMedSintRcv() {
		return this.nMedSintRcv;
	}

	public void setNMedSintRcv(BigDecimal nMedSintRcv) {
		this.nMedSintRcv = nMedSintRcv;
	}

	public BigDecimal getNSsCintRcv() {
		return this.nSsCintRcv;
	}

	public void setNSsCintRcv(BigDecimal nSsCintRcv) {
		this.nSsCintRcv = nSsCintRcv;
	}

	public BigDecimal getNSsSintRcv() {
		return this.nSsSintRcv;
	}

	public void setNSsSintRcv(BigDecimal nSsSintRcv) {
		this.nSsSintRcv = nSsSintRcv;
	}

	public Date getPrdStartDate() {
		return this.prdStartDate;
	}

	public void setPrdStartDate(Date prdStartDate) {
		this.prdStartDate = prdStartDate;
	}

	public BigDecimal getTcArsCint() {
		return this.tcArsCint;
	}

	public void setTcArsCint(BigDecimal tcArsCint) {
		this.tcArsCint = tcArsCint;
	}

	public BigDecimal getTcArsCintRcv() {
		return this.tcArsCintRcv;
	}

	public void setTcArsCintRcv(BigDecimal tcArsCintRcv) {
		this.tcArsCintRcv = tcArsCintRcv;
	}

	public BigDecimal getTcArsDue() {
		return this.tcArsDue;
	}

	public void setTcArsDue(BigDecimal tcArsDue) {
		this.tcArsDue = tcArsDue;
	}

	public BigDecimal getTcArsRcv() {
		return this.tcArsRcv;
	}

	public void setTcArsRcv(BigDecimal tcArsRcv) {
		this.tcArsRcv = tcArsRcv;
	}

	public BigDecimal getTcArsSint() {
		return this.tcArsSint;
	}

	public void setTcArsSint(BigDecimal tcArsSint) {
		this.tcArsSint = tcArsSint;
	}

	public BigDecimal getTcArsSintRcv() {
		return this.tcArsSintRcv;
	}

	public void setTcArsSintRcv(BigDecimal tcArsSintRcv) {
		this.tcArsSintRcv = tcArsSintRcv;
	}

	public BigDecimal getTcChSupDel() {
		return this.tcChSupDel;
	}

	public void setTcChSupDel(BigDecimal tcChSupDel) {
		this.tcChSupDel = tcChSupDel;
	}

	public BigDecimal getTcChSupInGrace() {
		return this.tcChSupInGrace;
	}

	public void setTcChSupInGrace(BigDecimal tcChSupInGrace) {
		this.tcChSupInGrace = tcChSupInGrace;
	}

	public BigDecimal getTcCsDelRcv() {
		return this.tcCsDelRcv;
	}

	public void setTcCsDelRcv(BigDecimal tcCsDelRcv) {
		this.tcCsDelRcv = tcCsDelRcv;
	}

	public BigDecimal getTcCsInGraceRcv() {
		return this.tcCsInGraceRcv;
	}

	public void setTcCsInGraceRcv(BigDecimal tcCsInGraceRcv) {
		this.tcCsInGraceRcv = tcCsInGraceRcv;
	}

	public BigDecimal getTcSsCint() {
		return this.tcSsCint;
	}

	public void setTcSsCint(BigDecimal tcSsCint) {
		this.tcSsCint = tcSsCint;
	}

	public BigDecimal getTcSsCintRcv() {
		return this.tcSsCintRcv;
	}

	public void setTcSsCintRcv(BigDecimal tcSsCintRcv) {
		this.tcSsCintRcv = tcSsCintRcv;
	}

	public BigDecimal getTcSsDel() {
		return this.tcSsDel;
	}

	public void setTcSsDel(BigDecimal tcSsDel) {
		this.tcSsDel = tcSsDel;
	}

	public BigDecimal getTcSsDelRcv() {
		return this.tcSsDelRcv;
	}

	public void setTcSsDelRcv(BigDecimal tcSsDelRcv) {
		this.tcSsDelRcv = tcSsDelRcv;
	}

	public BigDecimal getTcSsDue() {
		return this.tcSsDue;
	}

	public void setTcSsDue(BigDecimal tcSsDue) {
		this.tcSsDue = tcSsDue;
	}

	public BigDecimal getTcSsInGrace() {
		return this.tcSsInGrace;
	}

	public void setTcSsInGrace(BigDecimal tcSsInGrace) {
		this.tcSsInGrace = tcSsInGrace;
	}

	public BigDecimal getTcSsInGraceRcv() {
		return this.tcSsInGraceRcv;
	}

	public void setTcSsInGraceRcv(BigDecimal tcSsInGraceRcv) {
		this.tcSsInGraceRcv = tcSsInGraceRcv;
	}

	public BigDecimal getTcSsRcv() {
		return this.tcSsRcv;
	}

	public void setTcSsRcv(BigDecimal tcSsRcv) {
		this.tcSsRcv = tcSsRcv;
	}

	public BigDecimal getTcSsSint() {
		return this.tcSsSint;
	}

	public void setTcSsSint(BigDecimal tcSsSint) {
		this.tcSsSint = tcSsSint;
	}

	public BigDecimal getTcSsSintRcv() {
		return this.tcSsSintRcv;
	}

	public void setTcSsSintRcv(BigDecimal tcSsSintRcv) {
		this.tcSsSintRcv = tcSsSintRcv;
	}

	public String getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(String timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public BigDecimal getTotNuraRcvd() {
		return this.totNuraRcvd;
	}

	public void setTotNuraRcvd(BigDecimal totNuraRcvd) {
		this.totNuraRcvd = totNuraRcvd;
	}

	public BigDecimal getTotUraRcvd() {
		return this.totUraRcvd;
	}

	public void setTotUraRcvd(BigDecimal totUraRcvd) {
		this.totUraRcvd = totUraRcvd;
	}

	public BigDecimal getUArsCint() {
		return this.uArsCint;
	}

	public void setUArsCint(BigDecimal uArsCint) {
		this.uArsCint = uArsCint;
	}

	public BigDecimal getUArsCintRcv() {
		return this.uArsCintRcv;
	}

	public void setUArsCintRcv(BigDecimal uArsCintRcv) {
		this.uArsCintRcv = uArsCintRcv;
	}

	public BigDecimal getUArsDue() {
		return this.uArsDue;
	}

	public void setUArsDue(BigDecimal uArsDue) {
		this.uArsDue = uArsDue;
	}

	public BigDecimal getUArsRcv() {
		return this.uArsRcv;
	}

	public void setUArsRcv(BigDecimal uArsRcv) {
		this.uArsRcv = uArsRcv;
	}

	public BigDecimal getUArsSint() {
		return this.uArsSint;
	}

	public void setUArsSint(BigDecimal uArsSint) {
		this.uArsSint = uArsSint;
	}

	public BigDecimal getUArsSintRcv() {
		return this.uArsSintRcv;
	}

	public void setUArsSintRcv(BigDecimal uArsSintRcv) {
		this.uArsSintRcv = uArsSintRcv;
	}

	public BigDecimal getUChSupDel() {
		return this.uChSupDel;
	}

	public void setUChSupDel(BigDecimal uChSupDel) {
		this.uChSupDel = uChSupDel;
	}

	public BigDecimal getUChSupInGrace() {
		return this.uChSupInGrace;
	}

	public void setUChSupInGrace(BigDecimal uChSupInGrace) {
		this.uChSupInGrace = uChSupInGrace;
	}

	public BigDecimal getUCsDelRcv() {
		return this.uCsDelRcv;
	}

	public void setUCsDelRcv(BigDecimal uCsDelRcv) {
		this.uCsDelRcv = uCsDelRcv;
	}

	public BigDecimal getUCsInGraceRcv() {
		return this.uCsInGraceRcv;
	}

	public void setUCsInGraceRcv(BigDecimal uCsInGraceRcv) {
		this.uCsInGraceRcv = uCsInGraceRcv;
	}

	public BigDecimal getUSsCint() {
		return this.uSsCint;
	}

	public void setUSsCint(BigDecimal uSsCint) {
		this.uSsCint = uSsCint;
	}

	public BigDecimal getUSsCintRcv() {
		return this.uSsCintRcv;
	}

	public void setUSsCintRcv(BigDecimal uSsCintRcv) {
		this.uSsCintRcv = uSsCintRcv;
	}

	public BigDecimal getUSsDel() {
		return this.uSsDel;
	}

	public void setUSsDel(BigDecimal uSsDel) {
		this.uSsDel = uSsDel;
	}

	public BigDecimal getUSsDelRcv() {
		return this.uSsDelRcv;
	}

	public void setUSsDelRcv(BigDecimal uSsDelRcv) {
		this.uSsDelRcv = uSsDelRcv;
	}

	public BigDecimal getUSsDue() {
		return this.uSsDue;
	}

	public void setUSsDue(BigDecimal uSsDue) {
		this.uSsDue = uSsDue;
	}

	public BigDecimal getUSsInGrace() {
		return this.uSsInGrace;
	}

	public void setUSsInGrace(BigDecimal uSsInGrace) {
		this.uSsInGrace = uSsInGrace;
	}

	public BigDecimal getUSsInGraceRcv() {
		return this.uSsInGraceRcv;
	}

	public void setUSsInGraceRcv(BigDecimal uSsInGraceRcv) {
		this.uSsInGraceRcv = uSsInGraceRcv;
	}

	public BigDecimal getUSsRcv() {
		return this.uSsRcv;
	}

	public void setUSsRcv(BigDecimal uSsRcv) {
		this.uSsRcv = uSsRcv;
	}

	public BigDecimal getUSsSint() {
		return this.uSsSint;
	}

	public void setUSsSint(BigDecimal uSsSint) {
		this.uSsSint = uSsSint;
	}

	public BigDecimal getUSsSintRcv() {
		return this.uSsSintRcv;
	}

	public void setUSsSintRcv(BigDecimal uSsSintRcv) {
		this.uSsSintRcv = uSsSintRcv;
	}

	public String getUidUpdated() {
		return this.uidUpdated;
	}

	public void setUidUpdated(String uidUpdated) {
		this.uidUpdated = uidUpdated;
	}

}