package com.example.newscompose.data.datasource

import com.example.newscompose.data.api.ApiService
import com.example.newscompose.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImp @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getNewsHeadLine(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadLine(country)
    }
}