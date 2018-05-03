package com.example.linker.myapplication.rest;

import com.example.linker.myapplication.model.Profile;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by linker on 28/4/18.
 */

public interface StudentApiInterface {

    @GET("students/{id}")
    Call<Profile> getStudentDetails(@Path("id") int id, @Query("uid") String uid, @Query("access-token") String access_token, @Query("token-type") String token_type, @Query("client") String client, @Query("expiry") String expiry);
}
