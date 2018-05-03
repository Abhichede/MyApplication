package com.example.linker.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

public class Profile {

    @SerializedName("id")
    @Expose
    private Integer id;
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
    private Integer casteCategoryId;
    @SerializedName("caste_id")
    @Expose
    private Integer casteId;
    @SerializedName("religion_id")
    @Expose
    private Integer religionId;
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
    @SerializedName("standard_id")
    @Expose
    private Object standardId;
    @SerializedName("prn")
    @Expose
    private String prn;
    @SerializedName("last_school_attended")
    @Expose
    private String lastSchoolAttended;
    @SerializedName("username")
    @Expose
    private Object username;
    @SerializedName("password")
    @Expose
    private Object password;
    @SerializedName("academic_year_id")
    @Expose
    private Object academicYearId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("profile_photo")
    @Expose
    private Object profilePhoto;
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
     * @param motherTongue
     * @param dateOfBirth
     * @param bloodGroup
     * @param motherMiddleName
     * @param permanentCity
     * @param casteId
     * @param fatherEmail
     * @param fatherFirstName
     * @param studentMobile
     * @param permanentPincode
     * @param permanentCountry
     * @param password
     * @param birthPlace
     * @param residentialState
     * @param lastSchoolAttended
     * @param id
     * @param residentialPincode
     * @param username
     * @param createdAt
     * @param religionId
     * @param fatherOccupation
     * @param motherLastName
     * @param gender
     * @param profilePhoto
     * @param motherEmail
     * @param firstName
     * @param standardId
     * @param middleName
     * @param lastName
     * @param motherOccupation
     * @param residentialCountry
     * @param fatherLastName
     * @param academicYearId
     * @param studentEmail
     * @param fatherMobile
     * @param permanentAddressTwo
     * @param residentialAddressOne
     * @param fatherMiddleName
     * @param residentialAddressTwo
     * @param motherMobile
     * @param motherFirstName
     * @param url
     * @param updatedAt
     * @param nationality
     * @param residentialCity
     * @param casteCategoryId
     * @param permanentAddressOne
     * @param prn
     * @param permanentState
     */
    public Profile(Integer id, String firstName, String middleName, String lastName, String dateOfBirth, String birthPlace, String gender, String studentMobile, String bloodGroup, String nationality, String motherTongue, Integer casteCategoryId, Integer casteId, Integer religionId, String fatherFirstName, String fatherMiddleName, String fatherLastName, String motherFirstName, String motherMiddleName, String motherLastName, String residentialAddressOne, String residentialAddressTwo, String residentialCity, String residentialState, Object residentialCountry, String residentialPincode, String permanentAddressOne, String permanentAddressTwo, String permanentCity, String permanentState, Object permanentCountry, String permanentPincode, String fatherMobile, String motherMobile, String fatherOccupation, String motherOccupation, String fatherEmail, String motherEmail, String studentEmail, Object standardId, String prn, String lastSchoolAttended, Object username, Object password, Object academicYearId, String createdAt, String updatedAt, Object profilePhoto, String url) {
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
        this.standardId = standardId;
        this.prn = prn;
        this.lastSchoolAttended = lastSchoolAttended;
        this.username = username;
        this.password = password;
        this.academicYearId = academicYearId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profilePhoto = profilePhoto;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public Integer getCasteCategoryId() {
        return casteCategoryId;
    }

    public void setCasteCategoryId(Integer casteCategoryId) {
        this.casteCategoryId = casteCategoryId;
    }

    public Integer getCasteId() {
        return casteId;
    }

    public void setCasteId(Integer casteId) {
        this.casteId = casteId;
    }

    public Integer getReligionId() {
        return religionId;
    }

    public void setReligionId(Integer religionId) {
        this.religionId = religionId;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getResidentialAddressOne() {
        return residentialAddressOne;
    }

    public void setResidentialAddressOne(String residentialAddressOne) {
        this.residentialAddressOne = residentialAddressOne;
    }

    public String getResidentialAddressTwo() {
        return residentialAddressTwo;
    }

    public void setResidentialAddressTwo(String residentialAddressTwo) {
        this.residentialAddressTwo = residentialAddressTwo;
    }

    public String getResidentialCity() {
        return residentialCity;
    }

    public void setResidentialCity(String residentialCity) {
        this.residentialCity = residentialCity;
    }

    public String getResidentialState() {
        return residentialState;
    }

    public void setResidentialState(String residentialState) {
        this.residentialState = residentialState;
    }

    public Object getResidentialCountry() {
        return residentialCountry;
    }

    public void setResidentialCountry(Object residentialCountry) {
        this.residentialCountry = residentialCountry;
    }

    public String getResidentialPincode() {
        return residentialPincode;
    }

    public void setResidentialPincode(String residentialPincode) {
        this.residentialPincode = residentialPincode;
    }

    public String getPermanentAddressOne() {
        return permanentAddressOne;
    }

    public void setPermanentAddressOne(String permanentAddressOne) {
        this.permanentAddressOne = permanentAddressOne;
    }

    public String getPermanentAddressTwo() {
        return permanentAddressTwo;
    }

    public void setPermanentAddressTwo(String permanentAddressTwo) {
        this.permanentAddressTwo = permanentAddressTwo;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }

    public String getPermanentState() {
        return permanentState;
    }

    public void setPermanentState(String permanentState) {
        this.permanentState = permanentState;
    }

    public Object getPermanentCountry() {
        return permanentCountry;
    }

    public void setPermanentCountry(Object permanentCountry) {
        this.permanentCountry = permanentCountry;
    }

    public String getPermanentPincode() {
        return permanentPincode;
    }

    public void setPermanentPincode(String permanentPincode) {
        this.permanentPincode = permanentPincode;
    }

    public String getFatherMobile() {
        return fatherMobile;
    }

    public void setFatherMobile(String fatherMobile) {
        this.fatherMobile = fatherMobile;
    }

    public String getMotherMobile() {
        return motherMobile;
    }

    public void setMotherMobile(String motherMobile) {
        this.motherMobile = motherMobile;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public String getFatherEmail() {
        return fatherEmail;
    }

    public void setFatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
    }

    public String getMotherEmail() {
        return motherEmail;
    }

    public void setMotherEmail(String motherEmail) {
        this.motherEmail = motherEmail;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Object getStandardId() {
        return standardId;
    }

    public void setStandardId(Object standardId) {
        this.standardId = standardId;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public String getLastSchoolAttended() {
        return lastSchoolAttended;
    }

    public void setLastSchoolAttended(String lastSchoolAttended) {
        this.lastSchoolAttended = lastSchoolAttended;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Object academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(Object profilePhoto){

        this.profilePhoto = profilePhoto;


    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}