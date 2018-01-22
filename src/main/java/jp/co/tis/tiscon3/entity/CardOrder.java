package jp.co.tis.tiscon3.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 *
 */
@Entity
@Table(name = "CARD_ORDER")
public class CardOrder {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    /**  */
    @Column(name = "KANJI_NAME")
    String kanjiName;

    /**  */
    @Column(name = "KANA_NAME")
    String kanaName;

    /**  */
    @Column(name = "ALPHABET_NAME")
    String alphabetName;

    /**  */
    @Column(name = "DATE_OF_BIRTH")
    String dateOfBirth;

    /**  */
    @Column(name = "GENDER")
    String gender;

    /**  */
    @Column(name = "ZIP_CODE")
    String zipCode;

    /**  */
    @Column(name = "ADDRESS")
    String address;

    /**  */
    @Column(name = "HOME_PHONE_NUMBER")
    String homePhoneNumber;

    /**  */
    @Column(name = "MOBILE_PHONE_NUMBER")
    String mobilePhoneNumber;

    /**  */
    @Column(name = "EMAIL_ADDRESS")
    String emailAddress;

    /**  */
    @Column(name = "SPOUSE")
    String spouse;

    /**  */
    @Column(name = "HOUSE_CLASSIFICATION")
    String houseClassification;

    /**  */
    @Column(name = "DEBT")
    Integer debt;

    /**  */
    @Column(name = "JOB")
    String job;

    /**  */
    @Column(name = "INCOME")
    Integer income;

    /**  */
    @Column(name = "EMPLOYER_NAME")
    String employerName;

    /**  */
    @Column(name = "EMPLOYER_ZIP_CODE")
    String employerZipCode;

    /**  */
    @Column(name = "EMPLOYER_ADDRESS")
    String employerAddress;

    /**  */
    @Column(name = "EMPLOYER_PHONE_NUMBER")
    String employerPhoneNumber;

    /**  */
    @Column(name = "INDUSTRY_TYPE")
    String industryType;

    /**  */
    @Column(name = "CAPITAL")
    Integer capital;

    /**  */
    @Column(name = "COMPANY_SIZE")
    String companySize;

    /**  */
    @Column(name = "POSITION")
    String position;

    /**  */
    @Column(name = "DEPARTMENT")
    String department;

    /**  */
    @Column(name = "EMPLOYEE_LENGTH")
    Integer employeeLength;

    /**
     * Returns the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the kanjiName.
     *
     * @return the kanjiName
     */
    public String getKanjiName() {
        return kanjiName;
    }

    /**
     * Sets the kanjiName.
     *
     * @param kanjiName the kanjiName
     */
    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    /**
     * Returns the kanaName.
     *
     * @return the kanaName
     */
    public String getKanaName() {
        return kanaName;
    }

    /**
     * Sets the kanaName.
     *
     * @param kanaName the kanaName
     */
    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

    /**
     * Returns the alphabetName.
     *
     * @return the alphabetName
     */
    public String getAlphabetName() {
        return alphabetName;
    }

    /**
     * Sets the alphabetName.
     *
     * @param alphabetName the alphabetName
     */
    public void setAlphabetName(String alphabetName) {
        this.alphabetName = alphabetName;
    }

    /**
     * Returns the dateOfBirth.
     *
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the dateOfBirth.
     *
     * @param dateOfBirth the dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns the zipCode.
     *
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the zipCode.
     *
     * @param zipCode the zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Returns the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the homePhoneNumber.
     *
     * @return the homePhoneNumber
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Sets the homePhoneNumber.
     *
     * @param homePhoneNumber the homePhoneNumber
     */
    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    /**
     * Returns the mobilePhoneNumber.
     *
     * @return the mobilePhoneNumber
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the mobilePhoneNumber.
     *
     * @param mobilePhoneNumber the mobilePhoneNumber
     */
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    /**
     * Returns the emailAddress.
     *
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the emailAddress.
     *
     * @param emailAddress the emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Returns the spouse.
     *
     * @return the spouse
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the spouse.
     *
     * @param spouse the spouse
     */
    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    /**
     * Returns the houseClassification.
     *
     * @return the houseClassification
     */
    public String getHouseClassification() {
        return houseClassification;
    }

    /**
     * Sets the houseClassification.
     *
     * @param houseClassification the houseClassification
     */
    public void setHouseClassification(String houseClassification) {
        this.houseClassification = houseClassification;
    }

    /**
     * Returns the debt.
     *
     * @return the debt
     */
    public Integer getDebt() {
        return debt;
    }

    /**
     * Sets the debt.
     *
     * @param debt the debt
     */
    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    /**
     * Returns the job.
     *
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * Sets the job.
     *
     * @param job the job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * Returns the income.
     *
     * @return the income
     */
    public Integer getIncome() {
        return income;
    }

    /**
     * Sets the income.
     *
     * @param income the income
     */
    public void setIncome(Integer income) {
        this.income = income;
    }

    /**
     * Returns the employerName.
     *
     * @return the employerName
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Sets the employerName.
     *
     * @param employerName the employerName
     */
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    /**
     * Returns the employerZipCode.
     *
     * @return the employerZipCode
     */
    public String getEmployerZipCode() {
        return employerZipCode;
    }

    /**
     * Sets the employerZipCode.
     *
     * @param employerZipCode the employerZipCode
     */
    public void setEmployerZipCode(String employerZipCode) {
        this.employerZipCode = employerZipCode;
    }

    /**
     * Returns the employerAddress.
     *
     * @return the employerAddress
     */
    public String getEmployerAddress() {
        return employerAddress;
    }

    /**
     * Sets the employerAddress.
     *
     * @param employerAddress the employerAddress
     */
    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    /**
     * Returns the employerPhoneNumber.
     *
     * @return the employerPhoneNumber
     */
    public String getEmployerPhoneNumber() {
        return employerPhoneNumber;
    }

    /**
     * Sets the employerPhoneNumber.
     *
     * @param employerPhoneNumber the employerPhoneNumber
     */
    public void setEmployerPhoneNumber(String employerPhoneNumber) {
        this.employerPhoneNumber = employerPhoneNumber;
    }

    /**
     * Returns the industryType.
     *
     * @return the industryType
     */
    public String getIndustryType() {
        return industryType;
    }

    /**
     * Sets the industryType.
     *
     * @param industryType the industryType
     */
    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    /**
     * Returns the capital.
     *
     * @return the capital
     */
    public Integer getCapital() {
        return capital;
    }

    /**
     * Sets the capital.
     *
     * @param capital the capital
     */
    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    /**
     * Returns the companySize.
     *
     * @return the companySize
     */
    public String getCompanySize() {
        return companySize;
    }

    /**
     * Sets the companySize.
     *
     * @param companySize the companySize
     */
    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    /**
     * Returns the position.
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position.
     *
     * @param position the position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Returns the department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department.
     *
     * @param department the department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Returns the employeeLength.
     *
     * @return the employeeLength
     */
    public Integer getEmployeeLength() {
        return employeeLength;
    }

    /**
     * Sets the employeeLength.
     *
     * @param employeeLength the employeeLength
     */
    public void setEmployeeLength(Integer employeeLength) {
        this.employeeLength = employeeLength;
    }
}