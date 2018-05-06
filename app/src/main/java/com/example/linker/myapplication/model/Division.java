package com.example.linker.myapplication.model;

/**
 * Created by linker on 6/5/18.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Division {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("standard_id")
    @Expose
    private int standardId;
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
    public Division() {
    }

    /**
     *
     * @param updatedAt
     * @param standardId
     * @param id
     * @param createdAt
     * @param name
     * @param url
     */
    public Division(int id, String name, int standardId, String createdAt, String updatedAt, String url) {
        super();
        this.id = id;
        this.name = name;
        this.standardId = standardId;
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

    public Division withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Division withName(String name) {
        this.name = name;
        return this;
    }

    public int getStandardId() {
        return standardId;
    }

    public void setStandardId(int standardId) {
        this.standardId = standardId;
    }

    public Division withStandardId(int standardId) {
        this.standardId = standardId;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Division withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Division withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Division withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("standardId", standardId).append("createdAt", createdAt).append("updatedAt", updatedAt).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(updatedAt).append(standardId).append(id).append(createdAt).append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Division) == false) {
            return false;
        }
        Division rhs = ((Division) other);
        return new EqualsBuilder().append(updatedAt, rhs.updatedAt).append(standardId, rhs.standardId).append(id, rhs.id).append(createdAt, rhs.createdAt).append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}