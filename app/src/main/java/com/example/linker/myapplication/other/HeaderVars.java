package com.example.linker.myapplication.other;

import android.app.Application;

/**
 * Created by linker on 2/5/18.
 */

public class HeaderVars extends Application {


    static String accessToken;
    static String tokenType;
    static String client;
    static String expiry;

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        HeaderVars.accessToken = accessToken;
    }

    public static String getTokenType() {
        return tokenType;
    }

    public static void setTokenType(String tokenType) {
        HeaderVars.tokenType = tokenType;
    }

    public static String getClient() {
        return client;
    }

    public static void setClient(String client) {
        HeaderVars.client = client;
    }

    public static String getExpiry() {
        return expiry;
    }

    public static void setExpiry(String expiry) {
        HeaderVars.expiry = expiry;
    }

}
