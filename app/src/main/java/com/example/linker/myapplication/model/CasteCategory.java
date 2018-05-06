package com.example.linker.myapplication.model;

/**
 * Created by linker on 6/5/18.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CasteCategory {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("category")
    @Expose
    private String category;
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
    public CasteCategory() {
    }

    /**
     *
     * @param updatedAt
     * @param id
     * @param category
     * @param createdAt
     * @param url
     */
    public CasteCategory(int id, String category, String createdAt, String updatedAt, String url) {
        super();
        this.id = id;
        this.category = category;
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

    public CasteCategory withId(int id) {
        this.id = id;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CasteCategory withCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CasteCategory withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CasteCategory withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CasteCategory withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("category", category).append("createdAt", createdAt).append("updatedAt", updatedAt).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(updatedAt).append(id).append(category).append(createdAt).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CasteCategory) == false) {
            return false;
        }
        CasteCategory rhs = ((CasteCategory) other);
        return new EqualsBuilder().append(updatedAt, rhs.updatedAt).append(id, rhs.id).append(category, rhs.category).append(createdAt, rhs.createdAt).append(url, rhs.url).isEquals();
    }

}