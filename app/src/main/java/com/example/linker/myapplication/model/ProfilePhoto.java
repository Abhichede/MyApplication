package com.example.linker.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

public class ProfilePhoto {

    @SerializedName("url")
    @Expose
    private static String url;

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

        String mURL = url.replaceAll("^\\{|\\}$", "");
        String keyValPair[] = mURL.split("=");
        ProfilePhoto.url = keyValPair[1];
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        String mURL = url.replaceAll("^\\{|\\}$", "");
        String keyValPair[] = mURL.split("=");
        ProfilePhoto.url = keyValPair[1];
    }

}