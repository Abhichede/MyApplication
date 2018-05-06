package com.example.linker.myapplication.model;

/**
 * Created by linker on 6/5/18.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Fee {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("student_id")
    @Expose
    private int studentId;
    @SerializedName("academic_year_id")
    @Expose
    private int academicYearId;
    @SerializedName("payment_date")
    @Expose
    private String paymentDate;
    @SerializedName("payment_mode")
    @Expose
    private String paymentMode;
    @SerializedName("payment_desc")
    @Expose
    private String paymentDesc;
    @SerializedName("amount")
    @Expose
    private double amount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Fee() {
    }

    /**
     *
     * @param updatedAt
     * @param amount
     * @param id
     * @param paymentMode
     * @param paymentDate
     * @param paymentDesc
     * @param academicYearId
     * @param studentId
     * @param createdAt
     * @param url
     */
    public Fee(int id, int studentId, int academicYearId, String paymentDate, String paymentMode, String paymentDesc, double amount, String createdAt, String updatedAt, String url) {
        super();
        this.id = id;
        this.studentId = studentId;
        this.academicYearId = academicYearId;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.paymentDesc = paymentDesc;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fee withId(int id) {
        this.id = id;
        return this;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Fee withStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public int getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(int academicYearId) {
        this.academicYearId = academicYearId;
    }

    public Fee withAcademicYearId(int academicYearId) {
        this.academicYearId = academicYearId;
        return this;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Fee withPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Fee withPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public Fee withPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Fee withAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Fee withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Fee withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Fee withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("studentId", studentId).append("academicYearId", academicYearId).append("paymentDate", paymentDate).append("paymentMode", paymentMode).append("paymentDesc", paymentDesc).append("amount", amount).append("createdAt", createdAt).append("updatedAt", updatedAt).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(updatedAt).append(amount).append(id).append(paymentMode).append(paymentDate).append(paymentDesc).append(academicYearId).append(studentId).append(createdAt).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fee) == false) {
            return false;
        }
        Fee rhs = ((Fee) other);
        return new EqualsBuilder().append(updatedAt, rhs.updatedAt).append(amount, rhs.amount).append(id, rhs.id).append(paymentMode, rhs.paymentMode).append(paymentDate, rhs.paymentDate).append(paymentDesc, rhs.paymentDesc).append(academicYearId, rhs.academicYearId).append(studentId, rhs.studentId).append(createdAt, rhs.createdAt).append(url, rhs.url).isEquals();
    }

}