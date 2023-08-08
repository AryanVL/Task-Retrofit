package com.example.task_retrofit.data.remote

import com.example.task_retrofit.data.remote.model.DataModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("/v3/content/game/schedule")
    suspend fun getData(
        @Query("site") site: String,
        @Query("start") start: String,
        @Query("end") end: String,
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<DataModel>
}