package com.example.newscompose.ui.navigation

import android.util.Log


sealed class Screens(val route:String){
        object NewsListScreen:Screens("news_screen")
        object DetialScreen:Screens("detail_screen")

    fun withArgs(vararg args:String):String{
        return buildString {
            append(route)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }

    }
