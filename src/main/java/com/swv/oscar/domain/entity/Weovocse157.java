package com.swv.oscar.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WEOVOCSE_157 database table.
 * 
 */
@Entity
@Table(name="WEOVOCSE_157")
@NamedQuery(name="Weovocse157.findAll", query="SELECT w FROM Weovocse157 w")
public class Weovocse157 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AEI_CASE_COLLECT")
	private BigDecimal aeiCaseCollect;

	@Column(name="AMT_COLL_AEI_FY")
	private BigDecimal amtCollAeiFy;

	@Column(name="ARRS_ONLY_ORDR")
	private BigDecimal arrsOnlyOrdr;

	@Column(name="CASES_ORD_EST_CURR")
	private BigDecimal casesOrdEstCurr;

	@Column(name="CASES_ORD_EST_FRMR")
	private BigDecimal casesOrdEstFrmr;

	@Column(name="CASES_ORD_EST_NEVR")
	private BigDecimal casesOrdEstNevr;

	@Column(name="CASES_W_COLL_CURR")
	private BigDecimal casesWCollCurr;

	@Column(name="CASES_W_COLL_FRMR")
	private BigDecimal casesWCollFrmr;

	@Column(name="CASES_W_COLL_NEVR")
	private BigDecimal casesWCollNevr;

	@Column(name="CASES_WITH_INS_ORD")
	private BigDecimal casesWithInsOrd;

	@Column(name="CASES_WITH_INS_PRV")
	private BigDecimal casesWithInsPrv;

	@Column(name="CASES_WITH_MED_ORD")
	private BigDecimal casesWithMedOrd;

	@Column(name="CASES_WITH_MED_PRV")
	private BigDecimal casesWithMedPrv;

	@Column(name="CLSD_CASE_WITH_PMT")
	private BigDecimal clsdCaseWithPmt;

	@Column(name="CRTORD_CASES_CURR")
	private BigDecimal crtordCasesCurr;

	@Column(name="CRTORD_CASES_FRMR")
	private BigDecimal crtordCasesFrmr;

	@Column(name="CRTORD_CASES_NEVR")
	private BigDecimal crtordCasesNevr;

	@Column(name="CRTORD_M_CAS_NEVR")
	private BigDecimal crtordMCasNevr;

	@Column(name="CRTORD_UI_CAS_CURR")
	private BigDecimal crtordUiCasCurr;

	@Column(name="CRTORD_UI_CAS_FRMR")
	private BigDecimal crtordUiCasFrmr;

	@Column(name="CRTORD_UI_CAS_NEVR")
	private BigDecimal crtordUiCasNevr;

	@Column(name="CRTORD_UR_CAS_CURR")
	private BigDecimal crtordUrCasCurr;

	@Column(name="CRTORD_UR_CAS_FRMR")
	private BigDecimal crtordUrCasFrmr;

	@Column(name="CRTORD_UR_CAS_NEVR")
	private BigDecimal crtordUrCasNevr;

	@Column(name="CUR_SUPP_DIST_CURR")
	private BigDecimal curSuppDistCurr;

	@Column(name="CUR_SUPP_DIST_FRMR")
	private BigDecimal curSuppDistFrmr;

	@Column(name="CUR_SUPP_DIST_NEVR")
	private BigDecimal curSuppDistNevr;

	@Column(name="CURR_SUPP_DUE_CURR")
	private BigDecimal currSuppDueCurr;

	@Column(name="CURR_SUPP_DUE_FRMR")
	private BigDecimal currSuppDueFrmr;

	@Column(name="CURR_SUPP_DUE_NEVR")
	private BigDecimal currSuppDueNevr;

	@Column(name="FED_FISCAL_QTR")
	private BigDecimal fedFiscalQtr;

	@Column(name="FISCAL_YEAR")
	private String fiscalYear;

	@Column(name="INTER_INIT")
	private BigDecimal interInit;

	@Column(name="INTER_INIT_ORDR")
	private BigDecimal interInitOrdr;

	@Column(name="INTER_REC")
	private BigDecimal interRec;

	@Column(name="INTER_REC_ORDR")
	private BigDecimal interRecOrdr;

	@Column(name="IV_D_PAT_ESTB_CURR")
	private BigDecimal ivDPatEstbCurr;

	@Column(name="IV_D_PAT_ESTB_FRMR")
	private BigDecimal ivDPatEstbFrmr;

	@Column(name="IV_D_PAT_ESTB_NEVR")
	private BigDecimal ivDPatEstbNevr;

	@Column(name="MED_COV_ANY")
	private BigDecimal medCovAny;

	@Column(name="MED_IVD")
	private BigDecimal medIvd;

	@Column(name="MED_IVD_PRIV")
	private BigDecimal medIvdPriv;

	@Column(name="MED_SUP_REC_STATE")
	private BigDecimal medSupRecState;

	@Column(name="NO_JURS_CASES_CURR")
	private BigDecimal noJursCasesCurr;

	@Column(name="NO_JURS_CASES_FRMR")
	private BigDecimal noJursCasesFrmr;

	@Column(name="NO_JURS_CASES_NEVR")
	private BigDecimal noJursCasesNevr;

	@Column(name="OOW_IV_D_CHILD")
	private BigDecimal oowIvDChild;

	@Column(name="OOW_IV_D_CHILD_PY")
	private BigDecimal oowIvDChildPy;

	@Column(name="OOW_STATE_CHILD")
	private BigDecimal oowStateChild;

	@Column(name="OOW_STATE_CHILD_PY")
	private BigDecimal oowStateChildPy;

	@Column(name="PAT_ACK_STATE")
	private BigDecimal patAckState;

	@Column(name="PAT_ESTB_IV_D")
	private BigDecimal patEstbIvD;

	@Column(name="PAT_ESTB_STATE")
	private BigDecimal patEstbState;

	@Column(name="PAT_RSLVD_IV_D")
	private BigDecimal patRslvdIvD;

	@Column(name="REQ_ESTB_ORDR_CURR")
	private BigDecimal reqEstbOrdrCurr;

	@Column(name="REQ_ESTB_ORDR_FRMR")
	private BigDecimal reqEstbOrdrFrmr;

	@Column(name="REQ_ESTB_ORDR_NEVR")
	private BigDecimal reqEstbOrdrNevr;

	@Column(name="REQ_PAT_EST_CURR")
	private BigDecimal reqPatEstCurr;

	@Column(name="REQ_PAT_EST_FRMR")
	private BigDecimal reqPatEstFrmr;

	@Column(name="REQ_PAT_EST_NEVR")
	private BigDecimal reqPatEstNevr;

	@Id
	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="TOT_AEI_REQ_RECVD")
	private BigDecimal totAeiReqRecvd;

	@Column(name="TOT_ARRS_DIST_CURR")
	private BigDecimal totArrsDistCurr;

	@Column(name="TOT_ARRS_DIST_FRMR")
	private BigDecimal totArrsDistFrmr;

	@Column(name="TOT_ARRS_DIST_NEVR")
	private BigDecimal totArrsDistNevr;

	@Column(name="TOT_ARRS_DUE_CURR")
	private BigDecimal totArrsDueCurr;

	@Column(name="TOT_ARRS_DUE_FRMR")
	private BigDecimal totArrsDueFrmr;

	@Column(name="TOT_ARRS_DUE_NEVR")
	private BigDecimal totArrsDueNevr;

	@Column(name="TOT_CASES_CURR")
	private BigDecimal totCasesCurr;

	@Column(name="TOT_CASES_DISB_ARR")
	private BigDecimal totCasesDisbArr;

	@Column(name="TOT_CASES_FRMR")
	private BigDecimal totCasesFrmr;

	@Column(name="TOT_CASES_NEVR")
	private BigDecimal totCasesNevr;

	@Column(name="TOT_CASES_WITH_ARR")
	private BigDecimal totCasesWithArr;

	@Column(name="TOT_CHILDREN")
	private BigDecimal totChildren;

	@Column(name="TOT_COOP_AGRMT_EMP")
	private BigDecimal totCoopAgrmtEmp;

	@Column(name="TOT_FULL_TIME_EMP")
	private BigDecimal totFullTimeEmp;

	@Column(name="TOT_GOOD_CAUSE")
	private BigDecimal totGoodCause;

	@Column(name="TOT_M_CASES_NEVR")
	private BigDecimal totMCasesNevr;

	@Column(name="TOT_NON_COOPER")
	private BigDecimal totNonCooper;

	@Column(name="TOT_PRIVATE_EMP")
	private BigDecimal totPrivateEmp;

	@Column(name="TR_INIT_CURR")
	private BigDecimal trInitCurr;

	@Column(name="TR_INIT_FRMR")
	private BigDecimal trInitFrmr;

	@Column(name="TR_INIT_NEVR")
	private BigDecimal trInitNevr;

	@Column(name="TR_INIT_ORDR_CURR")
	private BigDecimal trInitOrdrCurr;

	@Column(name="TR_INIT_ORDR_FRMR")
	private BigDecimal trInitOrdrFrmr;

	@Column(name="TR_INIT_ORDR_NEVR")
	private BigDecimal trInitOrdrNevr;

	@Column(name="TR_REC_CURR")
	private BigDecimal trRecCurr;

	@Column(name="TR_REC_FRMR")
	private BigDecimal trRecFrmr;

	@Column(name="TR_REC_NEVR")
	private BigDecimal trRecNevr;

	@Column(name="TR_REC_ORDR_CURR")
	private BigDecimal trRecOrdrCurr;

	@Column(name="TR_REC_ORDR_FRMR")
	private BigDecimal trRecOrdrFrmr;

	@Column(name="TR_REC_ORDR_NEVR")
	private BigDecimal trRecOrdrNevr;

	@Column(name="UI_CASES_CURR")
	private BigDecimal uiCasesCurr;

	@Column(name="UI_CASES_FRMR")
	private BigDecimal uiCasesFrmr;

	@Column(name="UI_CASES_FY_CURR")
	private BigDecimal uiCasesFyCurr;

	@Column(name="UI_CASES_FY_FRMR")
	private BigDecimal uiCasesFyFrmr;

	@Column(name="UI_CASES_FY_NEVR")
	private BigDecimal uiCasesFyNevr;

	@Column(name="UI_CASES_NEVR")
	private BigDecimal uiCasesNevr;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="UR_CASE_COLL_CURR")
	private BigDecimal urCaseCollCurr;

	@Column(name="UR_CASE_COLL_FRMR")
	private BigDecimal urCaseCollFrmr;

	@Column(name="UR_CASE_COLL_NEVR")
	private BigDecimal urCaseCollNevr;

	@Column(name="UR_CASES_CURR")
	private BigDecimal urCasesCurr;

	@Column(name="UR_CASES_FRMR")
	private BigDecimal urCasesFrmr;

	@Column(name="UR_CASES_FY_CURR")
	private BigDecimal urCasesFyCurr;

	@Column(name="UR_CASES_FY_FRMR")
	private BigDecimal urCasesFyFrmr;

	@Column(name="UR_CASES_FY_NEVR")
	private BigDecimal urCasesFyNevr;

	@Column(name="UR_CASES_NEVR")
	private BigDecimal urCasesNevr;

	@Column(name="ZERO_ORD_CASE_CURR")
	private BigDecimal zeroOrdCaseCurr;

	@Column(name="ZERO_ORD_CASE_FRMR")
	private BigDecimal zeroOrdCaseFrmr;

	@Column(name="ZERO_ORD_CASE_NEVR")
	private BigDecimal zeroOrdCaseNevr;

	public Weovocse157() {
	}

	public BigDecimal getAeiCaseCollect() {
		return this.aeiCaseCollect;
	}

	public void setAeiCaseCollect(BigDecimal aeiCaseCollect) {
		this.aeiCaseCollect = aeiCaseCollect;
	}

	public BigDecimal getAmtCollAeiFy() {
		return this.amtCollAeiFy;
	}

	public void setAmtCollAeiFy(BigDecimal amtCollAeiFy) {
		this.amtCollAeiFy = amtCollAeiFy;
	}

	public BigDecimal getArrsOnlyOrdr() {
		return this.arrsOnlyOrdr;
	}

	public void setArrsOnlyOrdr(BigDecimal arrsOnlyOrdr) {
		this.arrsOnlyOrdr = arrsOnlyOrdr;
	}

	public BigDecimal getCasesOrdEstCurr() {
		return this.casesOrdEstCurr;
	}

	public void setCasesOrdEstCurr(BigDecimal casesOrdEstCurr) {
		this.casesOrdEstCurr = casesOrdEstCurr;
	}

	public BigDecimal getCasesOrdEstFrmr() {
		return this.casesOrdEstFrmr;
	}

	public void setCasesOrdEstFrmr(BigDecimal casesOrdEstFrmr) {
		this.casesOrdEstFrmr = casesOrdEstFrmr;
	}

	public BigDecimal getCasesOrdEstNevr() {
		return this.casesOrdEstNevr;
	}

	public void setCasesOrdEstNevr(BigDecimal casesOrdEstNevr) {
		this.casesOrdEstNevr = casesOrdEstNevr;
	}

	public BigDecimal getCasesWCollCurr() {
		return this.casesWCollCurr;
	}

	public void setCasesWCollCurr(BigDecimal casesWCollCurr) {
		this.casesWCollCurr = casesWCollCurr;
	}

	public BigDecimal getCasesWCollFrmr() {
		return this.casesWCollFrmr;
	}

	public void setCasesWCollFrmr(BigDecimal casesWCollFrmr) {
		this.casesWCollFrmr = casesWCollFrmr;
	}

	public BigDecimal getCasesWCollNevr() {
		return this.casesWCollNevr;
	}

	public void setCasesWCollNevr(BigDecimal casesWCollNevr) {
		this.casesWCollNevr = casesWCollNevr;
	}

	public BigDecimal getCasesWithInsOrd() {
		return this.casesWithInsOrd;
	}

	public void setCasesWithInsOrd(BigDecimal casesWithInsOrd) {
		this.casesWithInsOrd = casesWithInsOrd;
	}

	public BigDecimal getCasesWithInsPrv() {
		return this.casesWithInsPrv;
	}

	public void setCasesWithInsPrv(BigDecimal casesWithInsPrv) {
		this.casesWithInsPrv = casesWithInsPrv;
	}

	public BigDecimal getCasesWithMedOrd() {
		return this.casesWithMedOrd;
	}

	public void setCasesWithMedOrd(BigDecimal casesWithMedOrd) {
		this.casesWithMedOrd = casesWithMedOrd;
	}

	public BigDecimal getCasesWithMedPrv() {
		return this.casesWithMedPrv;
	}

	public void setCasesWithMedPrv(BigDecimal casesWithMedPrv) {
		this.casesWithMedPrv = casesWithMedPrv;
	}

	public BigDecimal getClsdCaseWithPmt() {
		return this.clsdCaseWithPmt;
	}

	public void setClsdCaseWithPmt(BigDecimal clsdCaseWithPmt) {
		this.clsdCaseWithPmt = clsdCaseWithPmt;
	}

	public BigDecimal getCrtordCasesCurr() {
		return this.crtordCasesCurr;
	}

	public void setCrtordCasesCurr(BigDecimal crtordCasesCurr) {
		this.crtordCasesCurr = crtordCasesCurr;
	}

	public BigDecimal getCrtordCasesFrmr() {
		return this.crtordCasesFrmr;
	}

	public void setCrtordCasesFrmr(BigDecimal crtordCasesFrmr) {
		this.crtordCasesFrmr = crtordCasesFrmr;
	}

	public BigDecimal getCrtordCasesNevr() {
		return this.crtordCasesNevr;
	}

	public void setCrtordCasesNevr(BigDecimal crtordCasesNevr) {
		this.crtordCasesNevr = crtordCasesNevr;
	}

	public BigDecimal getCrtordMCasNevr() {
		return this.crtordMCasNevr;
	}

	public void setCrtordMCasNevr(BigDecimal crtordMCasNevr) {
		this.crtordMCasNevr = crtordMCasNevr;
	}

	public BigDecimal getCrtordUiCasCurr() {
		return this.crtordUiCasCurr;
	}

	public void setCrtordUiCasCurr(BigDecimal crtordUiCasCurr) {
		this.crtordUiCasCurr = crtordUiCasCurr;
	}

	public BigDecimal getCrtordUiCasFrmr() {
		return this.crtordUiCasFrmr;
	}

	public void setCrtordUiCasFrmr(BigDecimal crtordUiCasFrmr) {
		this.crtordUiCasFrmr = crtordUiCasFrmr;
	}

	public BigDecimal getCrtordUiCasNevr() {
		return this.crtordUiCasNevr;
	}

	public void setCrtordUiCasNevr(BigDecimal crtordUiCasNevr) {
		this.crtordUiCasNevr = crtordUiCasNevr;
	}

	public BigDecimal getCrtordUrCasCurr() {
		return this.crtordUrCasCurr;
	}

	public void setCrtordUrCasCurr(BigDecimal crtordUrCasCurr) {
		this.crtordUrCasCurr = crtordUrCasCurr;
	}

	public BigDecimal getCrtordUrCasFrmr() {
		return this.crtordUrCasFrmr;
	}

	public void setCrtordUrCasFrmr(BigDecimal crtordUrCasFrmr) {
		this.crtordUrCasFrmr = crtordUrCasFrmr;
	}

	public BigDecimal getCrtordUrCasNevr() {
		return this.crtordUrCasNevr;
	}

	public void setCrtordUrCasNevr(BigDecimal crtordUrCasNevr) {
		this.crtordUrCasNevr = crtordUrCasNevr;
	}

	public BigDecimal getCurSuppDistCurr() {
		return this.curSuppDistCurr;
	}

	public void setCurSuppDistCurr(BigDecimal curSuppDistCurr) {
		this.curSuppDistCurr = curSuppDistCurr;
	}

	public BigDecimal getCurSuppDistFrmr() {
		return this.curSuppDistFrmr;
	}

	public void setCurSuppDistFrmr(BigDecimal curSuppDistFrmr) {
		this.curSuppDistFrmr = curSuppDistFrmr;
	}

	public BigDecimal getCurSuppDistNevr() {
		return this.curSuppDistNevr;
	}

	public void setCurSuppDistNevr(BigDecimal curSuppDistNevr) {
		this.curSuppDistNevr = curSuppDistNevr;
	}

	public BigDecimal getCurrSuppDueCurr() {
		return this.currSuppDueCurr;
	}

	public void setCurrSuppDueCurr(BigDecimal currSuppDueCurr) {
		this.currSuppDueCurr = currSuppDueCurr;
	}

	public BigDecimal getCurrSuppDueFrmr() {
		return this.currSuppDueFrmr;
	}

	public void setCurrSuppDueFrmr(BigDecimal currSuppDueFrmr) {
		this.currSuppDueFrmr = currSuppDueFrmr;
	}

	public BigDecimal getCurrSuppDueNevr() {
		return this.currSuppDueNevr;
	}

	public void setCurrSuppDueNevr(BigDecimal currSuppDueNevr) {
		this.currSuppDueNevr = currSuppDueNevr;
	}

	public BigDecimal getFedFiscalQtr() {
		return this.fedFiscalQtr;
	}

	public void setFedFiscalQtr(BigDecimal fedFiscalQtr) {
		this.fedFiscalQtr = fedFiscalQtr;
	}

	public String getFiscalYear() {
		return this.fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public BigDecimal getInterInit() {
		return this.interInit;
	}

	public void setInterInit(BigDecimal interInit) {
		this.interInit = interInit;
	}

	public BigDecimal getInterInitOrdr() {
		return this.interInitOrdr;
	}

	public void setInterInitOrdr(BigDecimal interInitOrdr) {
		this.interInitOrdr = interInitOrdr;
	}

	public BigDecimal getInterRec() {
		return this.interRec;
	}

	public void setInterRec(BigDecimal interRec) {
		this.interRec = interRec;
	}

	public BigDecimal getInterRecOrdr() {
		return this.interRecOrdr;
	}

	public void setInterRecOrdr(BigDecimal interRecOrdr) {
		this.interRecOrdr = interRecOrdr;
	}

	public BigDecimal getIvDPatEstbCurr() {
		return this.ivDPatEstbCurr;
	}

	public void setIvDPatEstbCurr(BigDecimal ivDPatEstbCurr) {
		this.ivDPatEstbCurr = ivDPatEstbCurr;
	}

	public BigDecimal getIvDPatEstbFrmr() {
		return this.ivDPatEstbFrmr;
	}

	public void setIvDPatEstbFrmr(BigDecimal ivDPatEstbFrmr) {
		this.ivDPatEstbFrmr = ivDPatEstbFrmr;
	}

	public BigDecimal getIvDPatEstbNevr() {
		return this.ivDPatEstbNevr;
	}

	public void setIvDPatEstbNevr(BigDecimal ivDPatEstbNevr) {
		this.ivDPatEstbNevr = ivDPatEstbNevr;
	}

	public BigDecimal getMedCovAny() {
		return this.medCovAny;
	}

	public void setMedCovAny(BigDecimal medCovAny) {
		this.medCovAny = medCovAny;
	}

	public BigDecimal getMedIvd() {
		return this.medIvd;
	}

	public void setMedIvd(BigDecimal medIvd) {
		this.medIvd = medIvd;
	}

	public BigDecimal getMedIvdPriv() {
		return this.medIvdPriv;
	}

	public void setMedIvdPriv(BigDecimal medIvdPriv) {
		this.medIvdPriv = medIvdPriv;
	}

	public BigDecimal getMedSupRecState() {
		return this.medSupRecState;
	}

	public void setMedSupRecState(BigDecimal medSupRecState) {
		this.medSupRecState = medSupRecState;
	}

	public BigDecimal getNoJursCasesCurr() {
		return this.noJursCasesCurr;
	}

	public void setNoJursCasesCurr(BigDecimal noJursCasesCurr) {
		this.noJursCasesCurr = noJursCasesCurr;
	}

	public BigDecimal getNoJursCasesFrmr() {
		return this.noJursCasesFrmr;
	}

	public void setNoJursCasesFrmr(BigDecimal noJursCasesFrmr) {
		this.noJursCasesFrmr = noJursCasesFrmr;
	}

	public BigDecimal getNoJursCasesNevr() {
		return this.noJursCasesNevr;
	}

	public void setNoJursCasesNevr(BigDecimal noJursCasesNevr) {
		this.noJursCasesNevr = noJursCasesNevr;
	}

	public BigDecimal getOowIvDChild() {
		return this.oowIvDChild;
	}

	public void setOowIvDChild(BigDecimal oowIvDChild) {
		this.oowIvDChild = oowIvDChild;
	}

	public BigDecimal getOowIvDChildPy() {
		return this.oowIvDChildPy;
	}

	public void setOowIvDChildPy(BigDecimal oowIvDChildPy) {
		this.oowIvDChildPy = oowIvDChildPy;
	}

	public BigDecimal getOowStateChild() {
		return this.oowStateChild;
	}

	public void setOowStateChild(BigDecimal oowStateChild) {
		this.oowStateChild = oowStateChild;
	}

	public BigDecimal getOowStateChildPy() {
		return this.oowStateChildPy;
	}

	public void setOowStateChildPy(BigDecimal oowStateChildPy) {
		this.oowStateChildPy = oowStateChildPy;
	}

	public BigDecimal getPatAckState() {
		return this.patAckState;
	}

	public void setPatAckState(BigDecimal patAckState) {
		this.patAckState = patAckState;
	}

	public BigDecimal getPatEstbIvD() {
		return this.patEstbIvD;
	}

	public void setPatEstbIvD(BigDecimal patEstbIvD) {
		this.patEstbIvD = patEstbIvD;
	}

	public BigDecimal getPatEstbState() {
		return this.patEstbState;
	}

	public void setPatEstbState(BigDecimal patEstbState) {
		this.patEstbState = patEstbState;
	}

	public BigDecimal getPatRslvdIvD() {
		return this.patRslvdIvD;
	}

	public void setPatRslvdIvD(BigDecimal patRslvdIvD) {
		this.patRslvdIvD = patRslvdIvD;
	}

	public BigDecimal getReqEstbOrdrCurr() {
		return this.reqEstbOrdrCurr;
	}

	public void setReqEstbOrdrCurr(BigDecimal reqEstbOrdrCurr) {
		this.reqEstbOrdrCurr = reqEstbOrdrCurr;
	}

	public BigDecimal getReqEstbOrdrFrmr() {
		return this.reqEstbOrdrFrmr;
	}

	public void setReqEstbOrdrFrmr(BigDecimal reqEstbOrdrFrmr) {
		this.reqEstbOrdrFrmr = reqEstbOrdrFrmr;
	}

	public BigDecimal getReqEstbOrdrNevr() {
		return this.reqEstbOrdrNevr;
	}

	public void setReqEstbOrdrNevr(BigDecimal reqEstbOrdrNevr) {
		this.reqEstbOrdrNevr = reqEstbOrdrNevr;
	}

	public BigDecimal getReqPatEstCurr() {
		return this.reqPatEstCurr;
	}

	public void setReqPatEstCurr(BigDecimal reqPatEstCurr) {
		this.reqPatEstCurr = reqPatEstCurr;
	}

	public BigDecimal getReqPatEstFrmr() {
		return this.reqPatEstFrmr;
	}

	public void setReqPatEstFrmr(BigDecimal reqPatEstFrmr) {
		this.reqPatEstFrmr = reqPatEstFrmr;
	}

	public BigDecimal getReqPatEstNevr() {
		return this.reqPatEstNevr;
	}

	public void setReqPatEstNevr(BigDecimal reqPatEstNevr) {
		this.reqPatEstNevr = reqPatEstNevr;
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

	public BigDecimal getTotAeiReqRecvd() {
		return this.totAeiReqRecvd;
	}

	public void setTotAeiReqRecvd(BigDecimal totAeiReqRecvd) {
		this.totAeiReqRecvd = totAeiReqRecvd;
	}

	public BigDecimal getTotArrsDistCurr() {
		return this.totArrsDistCurr;
	}

	public void setTotArrsDistCurr(BigDecimal totArrsDistCurr) {
		this.totArrsDistCurr = totArrsDistCurr;
	}

	public BigDecimal getTotArrsDistFrmr() {
		return this.totArrsDistFrmr;
	}

	public void setTotArrsDistFrmr(BigDecimal totArrsDistFrmr) {
		this.totArrsDistFrmr = totArrsDistFrmr;
	}

	public BigDecimal getTotArrsDistNevr() {
		return this.totArrsDistNevr;
	}

	public void setTotArrsDistNevr(BigDecimal totArrsDistNevr) {
		this.totArrsDistNevr = totArrsDistNevr;
	}

	public BigDecimal getTotArrsDueCurr() {
		return this.totArrsDueCurr;
	}

	public void setTotArrsDueCurr(BigDecimal totArrsDueCurr) {
		this.totArrsDueCurr = totArrsDueCurr;
	}

	public BigDecimal getTotArrsDueFrmr() {
		return this.totArrsDueFrmr;
	}

	public void setTotArrsDueFrmr(BigDecimal totArrsDueFrmr) {
		this.totArrsDueFrmr = totArrsDueFrmr;
	}

	public BigDecimal getTotArrsDueNevr() {
		return this.totArrsDueNevr;
	}

	public void setTotArrsDueNevr(BigDecimal totArrsDueNevr) {
		this.totArrsDueNevr = totArrsDueNevr;
	}

	public BigDecimal getTotCasesCurr() {
		return this.totCasesCurr;
	}

	public void setTotCasesCurr(BigDecimal totCasesCurr) {
		this.totCasesCurr = totCasesCurr;
	}

	public BigDecimal getTotCasesDisbArr() {
		return this.totCasesDisbArr;
	}

	public void setTotCasesDisbArr(BigDecimal totCasesDisbArr) {
		this.totCasesDisbArr = totCasesDisbArr;
	}

	public BigDecimal getTotCasesFrmr() {
		return this.totCasesFrmr;
	}

	public void setTotCasesFrmr(BigDecimal totCasesFrmr) {
		this.totCasesFrmr = totCasesFrmr;
	}

	public BigDecimal getTotCasesNevr() {
		return this.totCasesNevr;
	}

	public void setTotCasesNevr(BigDecimal totCasesNevr) {
		this.totCasesNevr = totCasesNevr;
	}

	public BigDecimal getTotCasesWithArr() {
		return this.totCasesWithArr;
	}

	public void setTotCasesWithArr(BigDecimal totCasesWithArr) {
		this.totCasesWithArr = totCasesWithArr;
	}

	public BigDecimal getTotChildren() {
		return this.totChildren;
	}

	public void setTotChildren(BigDecimal totChildren) {
		this.totChildren = totChildren;
	}

	public BigDecimal getTotCoopAgrmtEmp() {
		return this.totCoopAgrmtEmp;
	}

	public void setTotCoopAgrmtEmp(BigDecimal totCoopAgrmtEmp) {
		this.totCoopAgrmtEmp = totCoopAgrmtEmp;
	}

	public BigDecimal getTotFullTimeEmp() {
		return this.totFullTimeEmp;
	}

	public void setTotFullTimeEmp(BigDecimal totFullTimeEmp) {
		this.totFullTimeEmp = totFullTimeEmp;
	}

	public BigDecimal getTotGoodCause() {
		return this.totGoodCause;
	}

	public void setTotGoodCause(BigDecimal totGoodCause) {
		this.totGoodCause = totGoodCause;
	}

	public BigDecimal getTotMCasesNevr() {
		return this.totMCasesNevr;
	}

	public void setTotMCasesNevr(BigDecimal totMCasesNevr) {
		this.totMCasesNevr = totMCasesNevr;
	}

	public BigDecimal getTotNonCooper() {
		return this.totNonCooper;
	}

	public void setTotNonCooper(BigDecimal totNonCooper) {
		this.totNonCooper = totNonCooper;
	}

	public BigDecimal getTotPrivateEmp() {
		return this.totPrivateEmp;
	}

	public void setTotPrivateEmp(BigDecimal totPrivateEmp) {
		this.totPrivateEmp = totPrivateEmp;
	}

	public BigDecimal getTrInitCurr() {
		return this.trInitCurr;
	}

	public void setTrInitCurr(BigDecimal trInitCurr) {
		this.trInitCurr = trInitCurr;
	}

	public BigDecimal getTrInitFrmr() {
		return this.trInitFrmr;
	}

	public void setTrInitFrmr(BigDecimal trInitFrmr) {
		this.trInitFrmr = trInitFrmr;
	}

	public BigDecimal getTrInitNevr() {
		return this.trInitNevr;
	}

	public void setTrInitNevr(BigDecimal trInitNevr) {
		this.trInitNevr = trInitNevr;
	}

	public BigDecimal getTrInitOrdrCurr() {
		return this.trInitOrdrCurr;
	}

	public void setTrInitOrdrCurr(BigDecimal trInitOrdrCurr) {
		this.trInitOrdrCurr = trInitOrdrCurr;
	}

	public BigDecimal getTrInitOrdrFrmr() {
		return this.trInitOrdrFrmr;
	}

	public void setTrInitOrdrFrmr(BigDecimal trInitOrdrFrmr) {
		this.trInitOrdrFrmr = trInitOrdrFrmr;
	}

	public BigDecimal getTrInitOrdrNevr() {
		return this.trInitOrdrNevr;
	}

	public void setTrInitOrdrNevr(BigDecimal trInitOrdrNevr) {
		this.trInitOrdrNevr = trInitOrdrNevr;
	}

	public BigDecimal getTrRecCurr() {
		return this.trRecCurr;
	}

	public void setTrRecCurr(BigDecimal trRecCurr) {
		this.trRecCurr = trRecCurr;
	}

	public BigDecimal getTrRecFrmr() {
		return this.trRecFrmr;
	}

	public void setTrRecFrmr(BigDecimal trRecFrmr) {
		this.trRecFrmr = trRecFrmr;
	}

	public BigDecimal getTrRecNevr() {
		return this.trRecNevr;
	}

	public void setTrRecNevr(BigDecimal trRecNevr) {
		this.trRecNevr = trRecNevr;
	}

	public BigDecimal getTrRecOrdrCurr() {
		return this.trRecOrdrCurr;
	}

	public void setTrRecOrdrCurr(BigDecimal trRecOrdrCurr) {
		this.trRecOrdrCurr = trRecOrdrCurr;
	}

	public BigDecimal getTrRecOrdrFrmr() {
		return this.trRecOrdrFrmr;
	}

	public void setTrRecOrdrFrmr(BigDecimal trRecOrdrFrmr) {
		this.trRecOrdrFrmr = trRecOrdrFrmr;
	}

	public BigDecimal getTrRecOrdrNevr() {
		return this.trRecOrdrNevr;
	}

	public void setTrRecOrdrNevr(BigDecimal trRecOrdrNevr) {
		this.trRecOrdrNevr = trRecOrdrNevr;
	}

	public BigDecimal getUiCasesCurr() {
		return this.uiCasesCurr;
	}

	public void setUiCasesCurr(BigDecimal uiCasesCurr) {
		this.uiCasesCurr = uiCasesCurr;
	}

	public BigDecimal getUiCasesFrmr() {
		return this.uiCasesFrmr;
	}

	public void setUiCasesFrmr(BigDecimal uiCasesFrmr) {
		this.uiCasesFrmr = uiCasesFrmr;
	}

	public BigDecimal getUiCasesFyCurr() {
		return this.uiCasesFyCurr;
	}

	public void setUiCasesFyCurr(BigDecimal uiCasesFyCurr) {
		this.uiCasesFyCurr = uiCasesFyCurr;
	}

	public BigDecimal getUiCasesFyFrmr() {
		return this.uiCasesFyFrmr;
	}

	public void setUiCasesFyFrmr(BigDecimal uiCasesFyFrmr) {
		this.uiCasesFyFrmr = uiCasesFyFrmr;
	}

	public BigDecimal getUiCasesFyNevr() {
		return this.uiCasesFyNevr;
	}

	public void setUiCasesFyNevr(BigDecimal uiCasesFyNevr) {
		this.uiCasesFyNevr = uiCasesFyNevr;
	}

	public BigDecimal getUiCasesNevr() {
		return this.uiCasesNevr;
	}

	public void setUiCasesNevr(BigDecimal uiCasesNevr) {
		this.uiCasesNevr = uiCasesNevr;
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

	public BigDecimal getUrCaseCollCurr() {
		return this.urCaseCollCurr;
	}

	public void setUrCaseCollCurr(BigDecimal urCaseCollCurr) {
		this.urCaseCollCurr = urCaseCollCurr;
	}

	public BigDecimal getUrCaseCollFrmr() {
		return this.urCaseCollFrmr;
	}

	public void setUrCaseCollFrmr(BigDecimal urCaseCollFrmr) {
		this.urCaseCollFrmr = urCaseCollFrmr;
	}

	public BigDecimal getUrCaseCollNevr() {
		return this.urCaseCollNevr;
	}

	public void setUrCaseCollNevr(BigDecimal urCaseCollNevr) {
		this.urCaseCollNevr = urCaseCollNevr;
	}

	public BigDecimal getUrCasesCurr() {
		return this.urCasesCurr;
	}

	public void setUrCasesCurr(BigDecimal urCasesCurr) {
		this.urCasesCurr = urCasesCurr;
	}

	public BigDecimal getUrCasesFrmr() {
		return this.urCasesFrmr;
	}

	public void setUrCasesFrmr(BigDecimal urCasesFrmr) {
		this.urCasesFrmr = urCasesFrmr;
	}

	public BigDecimal getUrCasesFyCurr() {
		return this.urCasesFyCurr;
	}

	public void setUrCasesFyCurr(BigDecimal urCasesFyCurr) {
		this.urCasesFyCurr = urCasesFyCurr;
	}

	public BigDecimal getUrCasesFyFrmr() {
		return this.urCasesFyFrmr;
	}

	public void setUrCasesFyFrmr(BigDecimal urCasesFyFrmr) {
		this.urCasesFyFrmr = urCasesFyFrmr;
	}

	public BigDecimal getUrCasesFyNevr() {
		return this.urCasesFyNevr;
	}

	public void setUrCasesFyNevr(BigDecimal urCasesFyNevr) {
		this.urCasesFyNevr = urCasesFyNevr;
	}

	public BigDecimal getUrCasesNevr() {
		return this.urCasesNevr;
	}

	public void setUrCasesNevr(BigDecimal urCasesNevr) {
		this.urCasesNevr = urCasesNevr;
	}

	public BigDecimal getZeroOrdCaseCurr() {
		return this.zeroOrdCaseCurr;
	}

	public void setZeroOrdCaseCurr(BigDecimal zeroOrdCaseCurr) {
		this.zeroOrdCaseCurr = zeroOrdCaseCurr;
	}

	public BigDecimal getZeroOrdCaseFrmr() {
		return this.zeroOrdCaseFrmr;
	}

	public void setZeroOrdCaseFrmr(BigDecimal zeroOrdCaseFrmr) {
		this.zeroOrdCaseFrmr = zeroOrdCaseFrmr;
	}

	public BigDecimal getZeroOrdCaseNevr() {
		return this.zeroOrdCaseNevr;
	}

	public void setZeroOrdCaseNevr(BigDecimal zeroOrdCaseNevr) {
		this.zeroOrdCaseNevr = zeroOrdCaseNevr;
	}

}