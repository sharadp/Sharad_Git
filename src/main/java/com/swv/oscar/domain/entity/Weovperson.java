package com.swv.oscar.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the WEOVPERSON database table.
 * 
 */
@Entity
@Table(name="WEOVPERSON")
@NamedQuery(name="Weovperson.findAll", query="SELECT w FROM Weovperson w")
public class Weovperson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_NOTE")
	private String addressNote;

	@Column(name="AFDC_CASE_NBR")
	private String afdcCaseNbr;

	@Column(name="AFDC_IND")
	private String afdcInd;

	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BIRTH_PLACE_CITY")
	private String birthPlaceCity;

	@Column(name="BIRTH_PLACE_CNTRY")
	private String birthPlaceCntry;

	@Column(name="BIRTH_PLACE_COUNTY")
	private String birthPlaceCounty;

	@Column(name="BIRTH_PLACE_STATE")
	private String birthPlaceState;

	@Column(name="CITIZENSHIP_CD")
	private String citizenshipCd;

	@Column(name="CNCVD_IN_WV_IND")
	private String cncvdInWvInd;

	@Column(name="DEATH_DATE")
	private Date deathDate;

	@Column(name="DEATH_VERIFY_SRC")
	private String deathVerifySrc;

	@Column(name="DVS_IND")
	private String dvsInd;

	@Column(name="EDUCATION_LEVEL")
	private String educationLevel;

	@Column(name="ETHNICITY")
	private String ethnicity;

	@Column(name="EXCLUDE_DVS")
	private String excludeDvs;

	@Column(name="FACTS_CLIENT_ID")
	private BigDecimal factsClientId;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="FOREIGN_NATIONAL")
	private String foreignNational;

	@Column(name="FS_CASE_NBR")
	private String fsCaseNbr;

	@Column(name="FS_IND")
	private String fsInd;

	@Column(name="GRADUATION_DATE")
	private Date graduationDate;

	@Column(name="HIGH_SCHOOL_NAME")
	private String highSchoolName;

	@Column(name="ITIN")
	private String itin;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="LAST_SOUNDEX_CD")
	private String lastSoundexCd;

	@Column(name="MA_CASE_NBR")
	private String maCaseNbr;

	@Column(name="MA_IND")
	private String maInd;

	@Column(name="MAIDEN_NAME")
	private String maidenName;

	@Column(name="MARITAL_STATUS")
	private String maritalStatus;

	@Column(name="MID_NAME")
	private String midName;

	@Column(name="MINOR_MOTHER")
	private String minorMother;

	@Column(name="MISC_FIELD")
	private String miscField;

	@Column(name="MOD_NAME")
	private String modName;

	@Column(name="NBR_OF_DEPENDENTS")
	private BigDecimal nbrOfDependents;

	@Column(name="NICK_NAME")
	private String nickName;

	@Column(name="OTHER_NAME")
	private String otherName;

	@Column(name="PERSON_NOTE")
	private String personNote;

	@Column(name="PERSON_TYPE_CD")
	private String personTypeCd;

	@Id
	@Column(name="PIN")
	private Integer pin;

	@Column(name="PRIMARY_LANGUAGE")
	private String primaryLanguage;

	@Column(name="RAPIDS_PIN")
	private BigDecimal rapidsPin;

	@Column(name="RAPIDS_PRG_CODE")
	private String rapidsPrgCode;

	@Column(name="RAPIDS_SUBPRG_CODE")
	private String rapidsSubprgCode;

	@Column(name="REL_TO_AP")
	private String relToAp;

	@Column(name="SEX")
	private String sex;

	@Column(name="SSI_IND")
	private String ssiInd;

	@Column(name="SSIS_CASE_NBR")
	private String ssisCaseNbr;

	@Column(name="SSIS_IND")
	private String ssisInd;

	@Column(name="SSN")
	private String ssn;

	@Column(name="TIME_CREATED")
	private String timeCreated;

	@Column(name="TIME_UPDATED")
	private String timeUpdated;

	@Column(name="UID_CREATED")
	private String uidCreated;

	@Column(name="UID_UPDATED")
	private String uidUpdated;

	@Column(name="USER_VERIFIED")
	private String userVerified;

	@Column(name="VERIFIED_DATE")
	private Date verifiedDate;

	@Column(name="VERIFY_BIRTH_DATE")
	private String verifyBirthDate;

	@Column(name="VERIFY_CITIZENSHIP")
	private String verifyCitizenship;

	@Column(name="VERIFY_SSN")
	private String verifySsn;

	public Weovperson() {
	}

	public String getAddressNote() {
		return this.addressNote;
	}

	public void setAddressNote(String addressNote) {
		this.addressNote = addressNote;
	}

	public String getAfdcCaseNbr() {
		return this.afdcCaseNbr;
	}

	public void setAfdcCaseNbr(String afdcCaseNbr) {
		this.afdcCaseNbr = afdcCaseNbr;
	}

	public String getAfdcInd() {
		return this.afdcInd;
	}

	public void setAfdcInd(String afdcInd) {
		this.afdcInd = afdcInd;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlaceCity() {
		return this.birthPlaceCity;
	}

	public void setBirthPlaceCity(String birthPlaceCity) {
		this.birthPlaceCity = birthPlaceCity;
	}

	public String getBirthPlaceCntry() {
		return this.birthPlaceCntry;
	}

	public void setBirthPlaceCntry(String birthPlaceCntry) {
		this.birthPlaceCntry = birthPlaceCntry;
	}

	public String getBirthPlaceCounty() {
		return this.birthPlaceCounty;
	}

	public void setBirthPlaceCounty(String birthPlaceCounty) {
		this.birthPlaceCounty = birthPlaceCounty;
	}

	public String getBirthPlaceState() {
		return this.birthPlaceState;
	}

	public void setBirthPlaceState(String birthPlaceState) {
		this.birthPlaceState = birthPlaceState;
	}

	public String getCitizenshipCd() {
		return this.citizenshipCd;
	}

	public void setCitizenshipCd(String citizenshipCd) {
		this.citizenshipCd = citizenshipCd;
	}

	public String getCncvdInWvInd() {
		return this.cncvdInWvInd;
	}

	public void setCncvdInWvInd(String cncvdInWvInd) {
		this.cncvdInWvInd = cncvdInWvInd;
	}

	public Date getDeathDate() {
		return this.deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getDeathVerifySrc() {
		return this.deathVerifySrc;
	}

	public void setDeathVerifySrc(String deathVerifySrc) {
		this.deathVerifySrc = deathVerifySrc;
	}

	public String getDvsInd() {
		return this.dvsInd;
	}

	public void setDvsInd(String dvsInd) {
		this.dvsInd = dvsInd;
	}

	public String getEducationLevel() {
		return this.educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getExcludeDvs() {
		return this.excludeDvs;
	}

	public void setExcludeDvs(String excludeDvs) {
		this.excludeDvs = excludeDvs;
	}

	public BigDecimal getFactsClientId() {
		return this.factsClientId;
	}

	public void setFactsClientId(BigDecimal factsClientId) {
		this.factsClientId = factsClientId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getForeignNational() {
		return this.foreignNational;
	}

	public void setForeignNational(String foreignNational) {
		this.foreignNational = foreignNational;
	}

	public String getFsCaseNbr() {
		return this.fsCaseNbr;
	}

	public void setFsCaseNbr(String fsCaseNbr) {
		this.fsCaseNbr = fsCaseNbr;
	}

	public String getFsInd() {
		return this.fsInd;
	}

	public void setFsInd(String fsInd) {
		this.fsInd = fsInd;
	}

	public Date getGraduationDate() {
		return this.graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getHighSchoolName() {
		return this.highSchoolName;
	}

	public void setHighSchoolName(String highSchoolName) {
		this.highSchoolName = highSchoolName;
	}

	public String getItin() {
		return this.itin;
	}

	public void setItin(String itin) {
		this.itin = itin;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastSoundexCd() {
		return this.lastSoundexCd;
	}

	public void setLastSoundexCd(String lastSoundexCd) {
		this.lastSoundexCd = lastSoundexCd;
	}

	public String getMaCaseNbr() {
		return this.maCaseNbr;
	}

	public void setMaCaseNbr(String maCaseNbr) {
		this.maCaseNbr = maCaseNbr;
	}

	public String getMaInd() {
		return this.maInd;
	}

	public void setMaInd(String maInd) {
		this.maInd = maInd;
	}

	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMidName() {
		return this.midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getMinorMother() {
		return this.minorMother;
	}

	public void setMinorMother(String minorMother) {
		this.minorMother = minorMother;
	}

	public String getMiscField() {
		return this.miscField;
	}

	public void setMiscField(String miscField) {
		this.miscField = miscField;
	}

	public String getModName() {
		return this.modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public BigDecimal getNbrOfDependents() {
		return this.nbrOfDependents;
	}

	public void setNbrOfDependents(BigDecimal nbrOfDependents) {
		this.nbrOfDependents = nbrOfDependents;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getPersonNote() {
		return this.personNote;
	}

	public void setPersonNote(String personNote) {
		this.personNote = personNote;
	}

	public String getPersonTypeCd() {
		return this.personTypeCd;
	}

	public void setPersonTypeCd(String personTypeCd) {
		this.personTypeCd = personTypeCd;
	}

	public Integer getPin() {
		return this.pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getPrimaryLanguage() {
		return this.primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public BigDecimal getRapidsPin() {
		return this.rapidsPin;
	}

	public void setRapidsPin(BigDecimal rapidsPin) {
		this.rapidsPin = rapidsPin;
	}

	public String getRapidsPrgCode() {
		return this.rapidsPrgCode;
	}

	public void setRapidsPrgCode(String rapidsPrgCode) {
		this.rapidsPrgCode = rapidsPrgCode;
	}

	public String getRapidsSubprgCode() {
		return this.rapidsSubprgCode;
	}

	public void setRapidsSubprgCode(String rapidsSubprgCode) {
		this.rapidsSubprgCode = rapidsSubprgCode;
	}

	public String getRelToAp() {
		return this.relToAp;
	}

	public void setRelToAp(String relToAp) {
		this.relToAp = relToAp;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSsiInd() {
		return this.ssiInd;
	}

	public void setSsiInd(String ssiInd) {
		this.ssiInd = ssiInd;
	}

	public String getSsisCaseNbr() {
		return this.ssisCaseNbr;
	}

	public void setSsisCaseNbr(String ssisCaseNbr) {
		this.ssisCaseNbr = ssisCaseNbr;
	}

	public String getSsisInd() {
		return this.ssisInd;
	}

	public void setSsisInd(String ssisInd) {
		this.ssisInd = ssisInd;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
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

	public String getUserVerified() {
		return this.userVerified;
	}

	public void setUserVerified(String userVerified) {
		this.userVerified = userVerified;
	}

	public Date getVerifiedDate() {
		return this.verifiedDate;
	}

	public void setVerifiedDate(Date verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public String getVerifyBirthDate() {
		return this.verifyBirthDate;
	}

	public void setVerifyBirthDate(String verifyBirthDate) {
		this.verifyBirthDate = verifyBirthDate;
	}

	public String getVerifyCitizenship() {
		return this.verifyCitizenship;
	}

	public void setVerifyCitizenship(String verifyCitizenship) {
		this.verifyCitizenship = verifyCitizenship;
	}

	public String getVerifySsn() {
		return this.verifySsn;
	}

	public void setVerifySsn(String verifySsn) {
		this.verifySsn = verifySsn;
	}

}