package com.example.linker.myapplication.model;

/**
 * Created by linker on 6/5/18.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Religion {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
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
    public Religion() {
    }

    /**
     *
     * @param updatedAt
     * @param id
     * @param createdAt
     * @param name
     * @param url
     */
    public Religion(int id, String name, String createdAt, String updatedAt, String url) {
        super();
        this.id = id;
        this.name = name;
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

    public Religion withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Religion withName(String name) {
        this.name = name;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Religion withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Religion withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Religion withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("createdAt", createdAt).append("updatedAt", updatedAt).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(updatedAt).append(id).append(createdAt).append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Religion) == false) {
            return false;
        }
        Religion rhs = ((Religion) other);
        return new EqualsBuilder().append(updatedAt, rhs.updatedAt).append(id, rhs.id).append(createdAt, rhs.createdAt).append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}