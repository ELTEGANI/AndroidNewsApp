package com.example.newscompose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class NewsApplication :Application(){
    override fun onCreate() {
        super.onCreate()
    }
}