package com.example.linker.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class Profile {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("birth_place")
    @Expose
    private String birthPlace;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("student_mobile")
    @Expose
    private String studentMobile;
    @SerializedName("blood_group")
    @Expose
    private String bloodGroup;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("mother_tongue")
    @Expose
    private String motherTongue;
    @SerializedName("caste_category_id")
    @Expose
    private int casteCategoryId;
    @SerializedName("caste_id")
    @Expose
    private int casteId;
    @SerializedName("religion_id")
    @Expose
    private int religionId;
    @SerializedName("father_first_name")
    @Expose
    private String fatherFirstName;
    @SerializedName("father_middle_name")
    @Expose
    private String fatherMiddleName;
    @SerializedName("father_last_name")
    @Expose
    private String fatherLastName;
    @SerializedName("mother_first_name")
    @Expose
    private String motherFirstName;
    @SerializedName("mother_middle_name")
    @Expose
    private String motherMiddleName;
    @SerializedName("mother_last_name")
    @Expose
    private String motherLastName;
    @SerializedName("residential_address_one")
    @Expose
    private String residentialAddressOne;
    @SerializedName("residential_address_two")
    @Expose
    private String residentialAddressTwo;
    @SerializedName("residential_city")
    @Expose
    private String residentialCity;
    @SerializedName("residential_state")
    @Expose
    private String residentialState;
    @SerializedName("residential_country")
    @Expose
    private Object residentialCountry;
    @SerializedName("residential_pincode")
    @Expose
    private String residentialPincode;
    @SerializedName("permanent_address_one")
    @Expose
    private String permanentAddressOne;
    @SerializedName("permanent_address_two")
    @Expose
    private String permanentAddressTwo;
    @SerializedName("permanent_city")
    @Expose
    private String permanentCity;
    @SerializedName("permanent_state")
    @Expose
    private String permanentState;
    @SerializedName("permanent_country")
    @Expose
    private Object permanentCountry;
    @SerializedName("permanent_pincode")
    @Expose
    private String permanentPincode;
    @SerializedName("father_mobile")
    @Expose
    private String fatherMobile;
    @SerializedName("mother_mobile")
    @Expose
    private String motherMobile;
    @SerializedName("father_occupation")
    @Expose
    private String fatherOccupation;
    @SerializedName("mother_occupation")
    @Expose
    private String motherOccupation;
    @SerializedName("father_email")
    @Expose
    private String fatherEmail;
    @SerializedName("mother_email")
    @Expose
    private String motherEmail;
    @SerializedName("student_email")
    @Expose
    private String studentEmail;
    @SerializedName("prn")
    @Expose
    private String prn;
    @SerializedName("last_school_attended")
    @Expose
    private String lastSchoolAttended;
    @SerializedName("joining_date")
    @Expose
    private String joiningDate;
    @SerializedName("roll_no")
    @Expose
    private String rollNo;
    @SerializedName("student_adhar")
    @Expose
    private String studentAdhar;
    @SerializedName("father_adhar")
    @Expose
    private String fatherAdhar;
    @SerializedName("prev_standard")
    @Expose
    private String prevStandard;
    @SerializedName("prev_year")
    @Expose
    private String prevYear;
    @SerializedName("prev_marks")
    @Expose
    private String prevMarks;
    @SerializedName("mother_adhar")
    @Expose
    private String motherAdhar;
    @SerializedName("is_enquiry")
    @Expose
    private boolean isEnquiry;
    @SerializedName("medical_history")
    @Expose
    private String medicalHistory;
    @SerializedName("skill_of_child")
    @Expose
    private String skillOfChild;
    @SerializedName("disability_of_student")
    @Expose
    private String disabilityOfStudent;
    @SerializedName("siblings_schooling_details")
    @Expose
    private String siblingsSchoolingDetails;
    @SerializedName("is_transportation_required")
    @Expose
    private boolean isTransportationRequired;
    @SerializedName("transport_pickup_point")
    @Expose
    private String transportPickupPoint;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("profile_photo")
    @Expose
    private ProfilePhoto profilePhoto;
    @SerializedName("standard")
    @Expose
    private Standard standard;
    @SerializedName("division")
    @Expose
    private Division division;
    @SerializedName("caste_category")
    @Expose
    private CasteCategory casteCategory;
    @SerializedName("caste")
    @Expose
    private Caste caste;
    @SerializedName("religion")
    @Expose
    private Religion religion;
    @SerializedName("fees")
    @Expose
    private List<Fee> fees = null;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Profile() {
    }

    /**
     *
     * @param isTransportationRequired
     * @param bloodGroup
     * @param motherMiddleName
     * @param casteId
     * @param permanentCity
     * @param studentMobile
     * @param permanentCountry
     * @param religion
     * @param lastSchoolAttended
     * @param joiningDate
     * @param gender
     * @param motherEmail
     * @param transportPickupPoint
     * @param middleName
     * @param lastName
     * @param motherOccupation
     * @param fatherLastName
     * @param studentEmail
     * @param siblingsSchoolingDetails
     * @param fatherMiddleName
     * @param isEnquiry
     * @param motherFirstName
     * @param motherMobile
     * @param url
     * @param rollNo
     * @param motherAdhar
     * @param dateOfBirth
     * @param motherTongue
     * @param medicalHistory
     * @param fatherEmail
     * @param caste
     * @param casteCategory
     * @param fatherFirstName
     * @param permanentPincode
     * @param residentialState
     * @param birthPlace
     * @param id
     * @param residentialPincode
     * @param division
     * @param disabilityOfStudent
     * @param createdAt
     * @param religionId
     * @param motherLastName
     * @param fatherOccupation
     * @param profilePhoto
     * @param prevStandard
     * @param firstName
     * @param fatherAdhar
     * @param skillOfChild
     * @param residentialCountry
     * @param standard
     * @param fatherMobile
     * @param permanentAddressTwo
     * @param residentialAddressOne
     * @param fees
     * @param residentialAddressTwo
     * @param updatedAt
     * @param studentAdhar
     * @param prevYear
     * @param residentialCity
     * @param nationality
     * @param prevMarks
     * @param casteCategoryId
     * @param permanentAddressOne
     * @param prn
     * @param permanentState
     */
    public Profile(int id, String firstName, String middleName, String lastName, String dateOfBirth, String birthPlace, String gender, String studentMobile, String bloodGroup, String nationality, String motherTongue, int casteCategoryId, int casteId, int religionId, String fatherFirstName, String fatherMiddleName, String fatherLastName, String motherFirstName, String motherMiddleName, String motherLastName, String residentialAddressOne, String residentialAddressTwo, String residentialCity, String residentialState, Object residentialCountry, String residentialPincode, String permanentAddressOne, String permanentAddressTwo, String permanentCity, String permanentState, Object permanentCountry, String permanentPincode, String fatherMobile, String motherMobile, String fatherOccupation, String motherOccupation, String fatherEmail, String motherEmail, String studentEmail, String prn, String lastSchoolAttended, String joiningDate, String rollNo, String studentAdhar, String fatherAdhar, String prevStandard, String prevYear, String prevMarks, String motherAdhar, boolean isEnquiry, String medicalHistory, String skillOfChild, String disabilityOfStudent, String siblingsSchoolingDetails, boolean isTransportationRequired, String transportPickupPoint, String createdAt, String updatedAt, ProfilePhoto profilePhoto, Standard standard, Division division, CasteCategory casteCategory, Caste caste, Religion religion, List<Fee> fees, String url) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.studentMobile = studentMobile;
        this.bloodGroup = bloodGroup;
        this.nationality = nationality;
        this.motherTongue = motherTongue;
        this.casteCategoryId = casteCategoryId;
        this.casteId = casteId;
        this.religionId = religionId;
        this.fatherFirstName = fatherFirstName;
        this.fatherMiddleName = fatherMiddleName;
        this.fatherLastName = fatherLastName;
        this.motherFirstName = motherFirstName;
        this.motherMiddleName = motherMiddleName;
        this.motherLastName = motherLastName;
        this.residentialAddressOne = residentialAddressOne;
        this.residentialAddressTwo = residentialAddressTwo;
        this.residentialCity = residentialCity;
        this.residentialState = residentialState;
        this.residentialCountry = residentialCountry;
        this.residentialPincode = residentialPincode;
        this.permanentAddressOne = permanentAddressOne;
        this.permanentAddressTwo = permanentAddressTwo;
        this.permanentCity = permanentCity;
        this.permanentState = permanentState;
        this.permanentCountry = permanentCountry;
        this.permanentPincode = permanentPincode;
        this.fatherMobile = fatherMobile;
        this.motherMobile = motherMobile;
        this.fatherOccupation = fatherOccupation;
        this.motherOccupation = motherOccupation;
        this.fatherEmail = fatherEmail;
        this.motherEmail = motherEmail;
        this.studentEmail = studentEmail;
        this.prn = prn;
        this.lastSchoolAttended = lastSchoolAttended;
        this.joiningDate = joiningDate;
        this.rollNo = rollNo;
        this.studentAdhar = studentAdhar;
        this.fatherAdhar = fatherAdhar;
        this.prevStandard = prevStandard;
        this.prevYear = prevYear;
        this.prevMarks = prevMarks;
        this.motherAdhar = motherAdhar;
        this.isEnquiry = isEnquiry;
        this.medicalHistory = medicalHistory;
        this.skillOfChild = skillOfChild;
        this.disabilityOfStudent = disabilityOfStudent;
        this.siblingsSchoolingDetails = siblingsSchoolingDetails;
        this.isTransportationRequired = isTransportationRequired;
        this.transportPickupPoint = transportPickupPoint;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profilePhoto = profilePhoto;
        this.standard = standard;
        this.division = division;
        this.casteCategory = casteCategory;
        this.caste = caste;
        this.religion = religion;
        this.fees = fees;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile withId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Profile withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Profile withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Profile withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Profile withDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Profile withBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Profile withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public Profile withStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
        return this;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Profile withBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Profile withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public Profile withMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
        return this;
    }

    public int getCasteCategoryId() {
        return casteCategoryId;
    }

    public void setCasteCategoryId(int casteCategoryId) {
        this.casteCategoryId = casteCategoryId;
    }

    public Profile withCasteCategoryId(int casteCategoryId) {
        this.casteCategoryId = casteCategoryId;
        return this;
    }

    public int getCasteId() {
        return casteId;
    }

    public void setCasteId(int casteId) {
        this.casteId = casteId;
    }

    public Profile withCasteId(int casteId) {
        this.casteId = casteId;
        return this;
    }

    public int getReligionId() {
        return religionId;
    }

    public void setReligionId(int religionId) {
        this.religionId = religionId;
    }

    public Profile withReligionId(int religionId) {
        this.religionId = religionId;
        return this;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public Profile withFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
        return this;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public Profile withFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
        return this;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public Profile withFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
        return this;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public Profile withMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
        return this;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public Profile withMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
        return this;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public Profile withMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
        return this;
    }

    public String getResidentialAddressOne() {
        return residentialAddressOne;
    }

    public void setResidentialAddressOne(String residentialAddressOne) {
        this.residentialAddressOne = residentialAddressOne;
    }

    public Profile withResidentialAddressOne(String residentialAddressOne) {
        this.residentialAddressOne = residentialAddressOne;
        return this;
    }

    public String getResidentialAddressTwo() {
        return residentialAddressTwo;
    }

    public void setResidentialAddressTwo(String residentialAddressTwo) {
        this.residentialAddressTwo = residentialAddressTwo;
    }

    public Profile withResidentialAddressTwo(String residentialAddressTwo) {
        this.residentialAddressTwo = residentialAddressTwo;
        return this;
    }

    public String getResidentialCity() {
        return residentialCity;
    }

    public void setResidentialCity(String residentialCity) {
        this.residentialCity = residentialCity;
    }

    public Profile withResidentialCity(String residentialCity) {
        this.residentialCity = residentialCity;
        return this;
    }

    public String getResidentialState() {
        return residentialState;
    }

    public void setResidentialState(String residentialState) {
        this.residentialState = residentialState;
    }

    public Profile withResidentialState(String residentialState) {
        this.residentialState = residentialState;
        return this;
    }

    public Object getResidentialCountry() {
        return residentialCountry;
    }

    public void setResidentialCountry(Object residentialCountry) {
        this.residentialCountry = residentialCountry;
    }

    public Profile withResidentialCountry(Object residentialCountry) {
        this.residentialCountry = residentialCountry;
        return this;
    }

    public String getResidentialPincode() {
        return residentialPincode;
    }

    public void setResidentialPincode(String residentialPincode) {
        this.residentialPincode = residentialPincode;
    }

    public Profile withResidentialPincode(String residentialPincode) {
        this.residentialPincode = residentialPincode;
        return this;
    }

    public String getPermanentAddressOne() {
        return permanentAddressOne;
    }

    public void setPermanentAddressOne(String permanentAddressOne) {
        this.permanentAddressOne = permanentAddressOne;
    }

    public Profile withPermanentAddressOne(String permanentAddressOne) {
        this.permanentAddressOne = permanentAddressOne;
        return this;
    }

    public String getPermanentAddressTwo() {
        return permanentAddressTwo;
    }

    public void setPermanentAddressTwo(String permanentAddressTwo) {
        this.permanentAddressTwo = permanentAddressTwo;
    }

    public Profile withPermanentAddressTwo(String permanentAddressTwo) {
        this.permanentAddressTwo = permanentAddressTwo;
        return this;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }

    public Profile withPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
        return this;
    }

    public String getPermanentState() {
        return permanentState;
    }

    public void setPermanentState(String permanentState) {
        this.permanentState = permanentState;
    }

    public Profile withPermanentState(String permanentState) {
        this.permanentState = permanentState;
        return this;
    }

    public Object getPermanentCountry() {
        return permanentCountry;
    }

    public void setPermanentCountry(Object permanentCountry) {
        this.permanentCountry = permanentCountry;
    }

    public Profile withPermanentCountry(Object permanentCountry) {
        this.permanentCountry = permanentCountry;
        return this;
    }

    public String getPermanentPincode() {
        return permanentPincode;
    }

    public void setPermanentPincode(String permanentPincode) {
        this.permanentPincode = permanentPincode;
    }

    public Profile withPermanentPincode(String permanentPincode) {
        this.permanentPincode = permanentPincode;
        return this;
    }

    public String getFatherMobile() {
        return fatherMobile;
    }

    public void setFatherMobile(String fatherMobile) {
        this.fatherMobile = fatherMobile;
    }

    public Profile withFatherMobile(String fatherMobile) {
        this.fatherMobile = fatherMobile;
        return this;
    }

    public String getMotherMobile() {
        return motherMobile;
    }

    public void setMotherMobile(String motherMobile) {
        this.motherMobile = motherMobile;
    }

    public Profile withMotherMobile(String motherMobile) {
        this.motherMobile = motherMobile;
        return this;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public Profile withFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
        return this;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public Profile withMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
        return this;
    }

    public String getFatherEmail() {
        return fatherEmail;
    }

    public void setFatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
    }

    public Profile withFatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
        return this;
    }

    public String getMotherEmail() {
        return motherEmail;
    }

    public void setMotherEmail(String motherEmail) {
        this.motherEmail = motherEmail;
    }

    public Profile withMotherEmail(String motherEmail) {
        this.motherEmail = motherEmail;
        return this;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Profile withStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
        return this;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public Profile withPrn(String prn) {
        this.prn = prn;
        return this;
    }

    public String getLastSchoolAttended() {
        return lastSchoolAttended;
    }

    public void setLastSchoolAttended(String lastSchoolAttended) {
        this.lastSchoolAttended = lastSchoolAttended;
    }

    public Profile withLastSchoolAttended(String lastSchoolAttended) {
        this.lastSchoolAttended = lastSchoolAttended;
        return this;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Profile withJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
        return this;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Profile withRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getStudentAdhar() {
        return studentAdhar;
    }

    public void setStudentAdhar(String studentAdhar) {
        this.studentAdhar = studentAdhar;
    }

    public Profile withStudentAdhar(String studentAdhar) {
        this.studentAdhar = studentAdhar;
        return this;
    }

    public String getFatherAdhar() {
        return fatherAdhar;
    }

    public void setFatherAdhar(String fatherAdhar) {
        this.fatherAdhar = fatherAdhar;
    }

    public Profile withFatherAdhar(String fatherAdhar) {
        this.fatherAdhar = fatherAdhar;
        return this;
    }

    public String getPrevStandard() {
        return prevStandard;
    }

    public void setPrevStandard(String prevStandard) {
        this.prevStandard = prevStandard;
    }

    public Profile withPrevStandard(String prevStandard) {
        this.prevStandard = prevStandard;
        return this;
    }

    public String getPrevYear() {
        return prevYear;
    }

    public void setPrevYear(String prevYear) {
        this.prevYear = prevYear;
    }

    public Profile withPrevYear(String prevYear) {
        this.prevYear = prevYear;
        return this;
    }

    public String getPrevMarks() {
        return prevMarks;
    }

    public void setPrevMarks(String prevMarks) {
        this.prevMarks = prevMarks;
    }

    public Profile withPrevMarks(String prevMarks) {
        this.prevMarks = prevMarks;
        return this;
    }

    public String getMotherAdhar() {
        return motherAdhar;
    }

    public void setMotherAdhar(String motherAdhar) {
        this.motherAdhar = motherAdhar;
    }

    public Profile withMotherAdhar(String motherAdhar) {
        this.motherAdhar = motherAdhar;
        return this;
    }

    public boolean isIsEnquiry() {
        return isEnquiry;
    }

    public void setIsEnquiry(boolean isEnquiry) {
        this.isEnquiry = isEnquiry;
    }

    public Profile withIsEnquiry(boolean isEnquiry) {
        this.isEnquiry = isEnquiry;
        return this;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Profile withMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
        return this;
    }

    public String getSkillOfChild() {
        return skillOfChild;
    }

    public void setSkillOfChild(String skillOfChild) {
        this.skillOfChild = skillOfChild;
    }

    public Profile withSkillOfChild(String skillOfChild) {
        this.skillOfChild = skillOfChild;
        return this;
    }

    public String getDisabilityOfStudent() {
        return disabilityOfStudent;
    }

    public void setDisabilityOfStudent(String disabilityOfStudent) {
        this.disabilityOfStudent = disabilityOfStudent;
    }

    public Profile withDisabilityOfStudent(String disabilityOfStudent) {
        this.disabilityOfStudent = disabilityOfStudent;
        return this;
    }

    public String getSiblingsSchoolingDetails() {
        return siblingsSchoolingDetails;
    }

    public void setSiblingsSchoolingDetails(String siblingsSchoolingDetails) {
        this.siblingsSchoolingDetails = siblingsSchoolingDetails;
    }

    public Profile withSiblingsSchoolingDetails(String siblingsSchoolingDetails) {
        this.siblingsSchoolingDetails = siblingsSchoolingDetails;
        return this;
    }

    public boolean isIsTransportationRequired() {
        return isTransportationRequired;
    }

    public void setIsTransportationRequired(boolean isTransportationRequired) {
        this.isTransportationRequired = isTransportationRequired;
    }

    public Profile withIsTransportationRequired(boolean isTransportationRequired) {
        this.isTransportationRequired = isTransportationRequired;
        return this;
    }

    public String getTransportPickupPoint() {
        return transportPickupPoint;
    }

    public void setTransportPickupPoint(String transportPickupPoint) {
        this.transportPickupPoint = transportPickupPoint;
    }

    public Profile withTransportPickupPoint(String transportPickupPoint) {
        this.transportPickupPoint = transportPickupPoint;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Profile withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Profile withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public ProfilePhoto getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(ProfilePhoto profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public Profile withProfilePhoto(ProfilePhoto profilePhoto) {
        this.profilePhoto = profilePhoto;
        return this;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public Profile withStandard(Standard standard) {
        this.standard = standard;
        return this;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Profile withDivision(Division division) {
        this.division = division;
        return this;
    }

    public CasteCategory getCasteCategory() {
        return casteCategory;
    }

    public void setCasteCategory(CasteCategory casteCategory) {
        this.casteCategory = casteCategory;
    }

    public Profile withCasteCategory(CasteCategory casteCategory) {
        this.casteCategory = casteCategory;
        return this;
    }

    public Caste getCaste() {
        return caste;
    }

    public void setCaste(Caste caste) {
        this.caste = caste;
    }

    public Profile withCaste(Caste caste) {
        this.caste = caste;
        return this;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public Profile withReligion(Religion religion) {
        this.religion = religion;
        return this;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public Profile withFees(List<Fee> fees) {
        this.fees = fees;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Profile withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("firstName", firstName).append("middleName", middleName).append("lastName", lastName).append("dateOfBirth", dateOfBirth).append("birthPlace", birthPlace).append("gender", gender).append("studentMobile", studentMobile).append("bloodGroup", bloodGroup).append("nationality", nationality).append("motherTongue", motherTongue).append("casteCategoryId", casteCategoryId).append("casteId", casteId).append("religionId", religionId).append("fatherFirstName", fatherFirstName).append("fatherMiddleName", fatherMiddleName).append("fatherLastName", fatherLastName).append("motherFirstName", motherFirstName).append("motherMiddleName", motherMiddleName).append("motherLastName", motherLastName).append("residentialAddressOne", residentialAddressOne).append("residentialAddressTwo", residentialAddressTwo).append("residentialCity", residentialCity).append("residentialState", residentialState).append("residentialCountry", residentialCountry).append("residentialPincode", residentialPincode).append("permanentAddressOne", permanentAddressOne).append("permanentAddressTwo", permanentAddressTwo).append("permanentCity", permanentCity).append("permanentState", permanentState).append("permanentCountry", permanentCountry).append("permanentPincode", permanentPincode).append("fatherMobile", fatherMobile).append("motherMobile", motherMobile).append("fatherOccupation", fatherOccupation).append("motherOccupation", motherOccupation).append("fatherEmail", fatherEmail).append("motherEmail", motherEmail).append("studentEmail", studentEmail).append("prn", prn).append("lastSchoolAttended", lastSchoolAttended).append("joiningDate", joiningDate).append("rollNo", rollNo).append("studentAdhar", studentAdhar).append("fatherAdhar", fatherAdhar).append("prevStandard", prevStandard).append("prevYear", prevYear).append("prevMarks", prevMarks).append("motherAdhar", motherAdhar).append("isEnquiry", isEnquiry).append("medicalHistory", medicalHistory).append("skillOfChild", skillOfChild).append("disabilityOfStudent", disabilityOfStudent).append("siblingsSchoolingDetails", siblingsSchoolingDetails).append("isTransportationRequired", isTransportationRequired).append("transportPickupPoint", transportPickupPoint).append("createdAt", createdAt).append("updatedAt", updatedAt).append("profilePhoto", profilePhoto).append("standard", standard).append("division", division).append("casteCategory", casteCategory).append("caste", caste).append("religion", religion).append("fees", fees).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isTransportationRequired).append(bloodGroup).append(motherMiddleName).append(permanentCity).append(casteId).append(studentMobile).append(permanentCountry).append(religion).append(joiningDate).append(lastSchoolAttended).append(gender).append(motherEmail).append(transportPickupPoint).append(middleName).append(lastName).append(motherOccupation).append(fatherLastName).append(studentEmail).append(siblingsSchoolingDetails).append(fatherMiddleName).append(isEnquiry).append(motherMobile).append(motherFirstName).append(url).append(rollNo).append(motherAdhar).append(motherTongue).append(dateOfBirth).append(medicalHistory).append(fatherEmail).append(caste).append(casteCategory).append(fatherFirstName).append(permanentPincode).append(residentialState).append(birthPlace).append(id).append(residentialPincode).append(division).append(disabilityOfStudent).append(createdAt).append(religionId).append(fatherOccupation).append(motherLastName).append(profilePhoto).append(prevStandard).append(firstName).append(fatherAdhar).append(skillOfChild).append(residentialCountry).append(standard).append(fatherMobile).append(permanentAddressTwo).append(residentialAddressOne).append(fees).append(residentialAddressTwo).append(updatedAt).append(prevYear).append(studentAdhar).append(residentialCity).append(nationality).append(prevMarks).append(casteCategoryId).append(permanentAddressOne).append(prn).append(permanentState).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile rhs = ((Profile) other);
        return new EqualsBuilder().append(isTransportationRequired, rhs.isTransportationRequired).append(bloodGroup, rhs.bloodGroup).append(motherMiddleName, rhs.motherMiddleName).append(permanentCity, rhs.permanentCity).append(casteId, rhs.casteId).append(studentMobile, rhs.studentMobile).append(permanentCountry, rhs.permanentCountry).append(religion, rhs.religion).append(joiningDate, rhs.joiningDate).append(lastSchoolAttended, rhs.lastSchoolAttended).append(gender, rhs.gender).append(motherEmail, rhs.motherEmail).append(transportPickupPoint, rhs.transportPickupPoint).append(middleName, rhs.middleName).append(lastName, rhs.lastName).append(motherOccupation, rhs.motherOccupation).append(fatherLastName, rhs.fatherLastName).append(studentEmail, rhs.studentEmail).append(siblingsSchoolingDetails, rhs.siblingsSchoolingDetails).append(fatherMiddleName, rhs.fatherMiddleName).append(isEnquiry, rhs.isEnquiry).append(motherMobile, rhs.motherMobile).append(motherFirstName, rhs.motherFirstName).append(url, rhs.url).append(rollNo, rhs.rollNo).append(motherAdhar, rhs.motherAdhar).append(motherTongue, rhs.motherTongue).append(dateOfBirth, rhs.dateOfBirth).append(medicalHistory, rhs.medicalHistory).append(fatherEmail, rhs.fatherEmail).append(caste, rhs.caste).append(casteCategory, rhs.casteCategory).append(fatherFirstName, rhs.fatherFirstName).append(permanentPincode, rhs.permanentPincode).append(residentialState, rhs.residentialState).append(birthPlace, rhs.birthPlace).append(id, rhs.id).append(residentialPincode, rhs.residentialPincode).append(division, rhs.division).append(disabilityOfStudent, rhs.disabilityOfStudent).append(createdAt, rhs.createdAt).append(religionId, rhs.religionId).append(fatherOccupation, rhs.fatherOccupation).append(motherLastName, rhs.motherLastName).append(profilePhoto, rhs.profilePhoto).append(prevStandard, rhs.prevStandard).append(firstName, rhs.firstName).append(fatherAdhar, rhs.fatherAdhar).append(skillOfChild, rhs.skillOfChild).append(residentialCountry, rhs.residentialCountry).append(standard, rhs.standard).append(fatherMobile, rhs.fatherMobile).append(permanentAddressTwo, rhs.permanentAddressTwo).append(residentialAddressOne, rhs.residentialAddressOne).append(fees, rhs.fees).append(residentialAddressTwo, rhs.residentialAddressTwo).append(updatedAt, rhs.updatedAt).append(prevYear, rhs.prevYear).append(studentAdhar, rhs.studentAdhar).append(residentialCity, rhs.residentialCity).append(nationality, rhs.nationality).append(prevMarks, rhs.prevMarks).append(casteCategoryId, rhs.casteCategoryId).append(permanentAddressOne, rhs.permanentAddressOne).append(prn, rhs.prn).append(permanentState, rhs.permanentState).isEquals();
    }

}