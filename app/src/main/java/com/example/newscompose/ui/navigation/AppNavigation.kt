package com.example.newscompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.newscompose.ui.screens.DetailScreen
import com.example.newscompose.ui.screens.NewsScreenList


@Composable
fun AppNavigationGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.NewsListScreen.route){
    composable(Screens.NewsListScreen.route){
           NewsScreenList(navController)
    }
   composable(Screens.DetialScreen.route+"/{newsTitle}/{newsDescription}/{newsUrl}",
       arguments = listOf(
           navArgument("newsTitle"){
               type = NavType.StringType
               defaultValue = "newsTitle"
               nullable = true
           },
           navArgument("newsDescription"){
               type = NavType.StringType
               defaultValue = "newsDescription"
               nullable = true
           },
           navArgument("newsUrl"){
               type = NavType.StringType
               defaultValue = "newsUrl"
               nullable = true
           }
       )
   ){args->
          DetailScreen(args.arguments?.getString("newsTitle"),
              args.arguments?.getString("newsDescription"),
              args.arguments?.getString("newsUrl"))
   }
  }
}