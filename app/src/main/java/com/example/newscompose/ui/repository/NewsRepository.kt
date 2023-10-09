package com.example.newscompose.ui.repository

import android.util.Log
import com.example.newscompose.data.datasource.NewsDataSource
import com.example.newscompose.data.entity.NewsResponse
import com.example.utilites.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsDataSource: NewsDataSource) {


    suspend fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val newsResponse = newsDataSource.getNewsHeadLine(country)
            if (newsResponse.isSuccessful && newsResponse.body() != null) {
                emit(ResourceState.Success(newsResponse.body()!!))
            } else {
                emit(ResourceState.Error("Error Fetching News Data"))
            }
        }.catch { e ->
            emit(ResourceState.Error(e.localizedMessage ?: "Some Error in flow"))
        }
    }
}