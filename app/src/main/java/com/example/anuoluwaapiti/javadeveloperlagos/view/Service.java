package com.example.anuoluwaapiti.javadeveloperlagos.view;

import com.example.anuoluwaapiti.javadeveloperlagos.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Anuoluwa APITI on 9/13/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();

}
