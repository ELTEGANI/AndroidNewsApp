package com.example.utilites

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object CoreUtilities {
  fun isInternetConnected(context: Context):Boolean{
      val connectivityManger = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
      val networkCapabilities = connectivityManger.activeNetwork ?: return false
      val actNetwork = connectivityManger.getNetworkCapabilities(networkCapabilities) ?: return false
      val result = when {
          actNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
          actNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
          actNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
          else -> false
      }
      return  result
  }
}