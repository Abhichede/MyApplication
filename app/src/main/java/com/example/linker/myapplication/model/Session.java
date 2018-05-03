
package com.example.linker.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Session {

    @SerializedName("approved")
    @Expose
    private Boolean approved;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("allow_password_change")
    @Expose
    private Boolean allowPasswordChange;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("roles_mask")
    @Expose
    private int rolesMask;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @SerializedName("student_id")
    @Expose
    private int student_id;

    /**
     * No args constructor for use in serialization
     *
     */
    public Session() {
    }

    /**
     *
     * @param uid
     * @param id
     * @param approved
     * @param rolesMask
     * @param nickname
     * @param email
     * @param name
     * @param image
     * @param provider
     * @param allowPasswordChange
     */
    public Session(Boolean approved, int id, String email, String provider, String uid, Boolean allowPasswordChange, String name, String nickname, String image, int rolesMask, int student_id) {
        //super();
        this.approved = approved;
        this.id = id;
        this.email = email;
        this.provider = provider;
        this.uid = uid;
        this.allowPasswordChange = allowPasswordChange;
        this.name = name;
        this.nickname = nickname;
        this.image = image;
        this.rolesMask = rolesMask;
        this.student_id = student_id;
    }

    public Session(JSONObject jsonObject) throws JSONException {
        this.approved  = jsonObject.getBoolean("approved");
        this.id = jsonObject.getInt("id");
        this.email = jsonObject.getString("email");
        this.provider = jsonObject.getString("provider");
        this.uid = jsonObject.getString("uid");
        this.name = jsonObject.getString("name");
        this.nickname = jsonObject.getString("nickname");
        this.image = jsonObject.getString("image");
        this.allowPasswordChange = jsonObject.getBoolean("allow_password_change");
        this.rolesMask = jsonObject.getInt("roles_mask");
        this.student_id = jsonObject.getInt("student_id");
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getAllowPasswordChange() {
        return allowPasswordChange;
    }

    public void setAllowPasswordChange(Boolean allowPasswordChange) {
        this.allowPasswordChange = allowPasswordChange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRolesMask() {
        return rolesMask;
    }

    public void setRolesMask(int rolesMask) {
        this.rolesMask = rolesMask;
    }

    @Override
    public String toString() {
        return "Session{" +
                "Email='" + email + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

}