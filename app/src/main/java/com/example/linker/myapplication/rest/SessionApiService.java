package com.example.linker.myapplication.rest;

import com.example.linker.myapplication.model.SessionResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by linker on 27/4/18.
 */

public interface SessionApiService {
    @POST("/api/auth/sign_in")
    @FormUrlEncoded
    Call<SessionResponse> getSession(@Field("uid") String uid, @Field("email") String email, @Field("password") String password);
}
