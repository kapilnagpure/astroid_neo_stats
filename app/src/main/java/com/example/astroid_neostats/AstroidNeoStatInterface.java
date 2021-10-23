package com.example.astroid_neostats;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AstroidNeoStatInterface {

    @GET("/neo/rest/v1/feed")
    Call<List<NeoData>> getAstroidData(@Query("start_date") String startDate, @Query("end_date") String endDate,@Query("api_key") String apiMode);
}
