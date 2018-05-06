package com.example.linker.myapplication.model;


//public class ProfilePhoto {
//
//    @SerializedName("url")
//    @Expose
//    private static String url;
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public ProfilePhoto() {
//    }
//
//    /**
//     *
//     * @param url
//     */
//    public ProfilePhoto(String url) {
//
//        String mURL = url.replaceAll("^\\{|\\}$", "");
//        String keyValPair[] = mURL.split("=");
//        ProfilePhoto.url = keyValPair[1];
//    }
//
//    public static String getUrl() {
//        return url;
//    }
//
//    public static void setUrl(String url) {
//        String mURL = url.replaceAll("^\\{|\\}$", "");
//        String keyValPair[] = mURL.split("=");
//        ProfilePhoto.url = keyValPair[1];
//    }
//
//}

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ProfilePhoto {

    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProfilePhoto() {
    }

    /**
     *
     * @param url
     */
    public ProfilePhoto(String url) {
        super();
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ProfilePhoto withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfilePhoto) == false) {
            return false;
        }
        ProfilePhoto rhs = ((ProfilePhoto) other);
        return new EqualsBuilder().append(url, rhs.url).isEquals();
    }

}