package com.example.newscompose.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.newscompose.ui.components.Loader
import com.example.newscompose.ui.components.NewsList
import com.example.newscompose.ui.viewmodel.NewsViewModel
import com.example.utilites.ResourceState


const val TAG = "homeScreen"

@Composable
fun NewsScreenList(
    navController: NavController,
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    val newsResponse by newsViewModel.news.collectAsState()
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        when (newsResponse) {
            is ResourceState.Loading -> {
                Loader()
                Log.d(TAG, "Inside Loading")
            }

            is ResourceState.Success -> {
                val response = (newsResponse as ResourceState.Success).data
                NewsList(response,navController)
            }

            is ResourceState.Error -> {
                val error = (newsResponse as ResourceState.Error)
                Log.d(TAG, "Inside Error $error")
            }
        }
    }
}

