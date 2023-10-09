package com.example.newscompose.data.api

import com.example.newscompose.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    suspend fun getNewsHeadLine(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "34b3866485c3423b858e1d80cb39769c"
    ): Response<NewsResponse>
}
