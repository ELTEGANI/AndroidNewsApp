package com.example.newscompose.data.datasource

import com.example.newscompose.data.entity.NewsResponse
import retrofit2.Response


interface NewsDataSource {
    suspend fun getNewsHeadLine(
        country:String
    ):Response<NewsResponse>
}