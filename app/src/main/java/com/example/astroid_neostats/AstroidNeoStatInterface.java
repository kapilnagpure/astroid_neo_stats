package com.example.astroid_neostats;

import com.example.astroid_neostats.model.AstroidNeoData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AstroidNeoStatInterface {

    @GET("/neo/rest/v1/")
    Call<List<AstroidNeoData>> getAstroidData(@Query("path") String path);
}
