package com.example.linker.myapplication.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linker on 27/4/18.
 */

public class SessionResponse {

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @SerializedName("data")
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    @SerializedName("success")
    private boolean success = true;
    @SerializedName("errors")
    private Object errors;
}
