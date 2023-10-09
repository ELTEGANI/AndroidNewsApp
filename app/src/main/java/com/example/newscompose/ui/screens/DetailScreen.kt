package com.example.newscompose.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.newscompose.R


@Composable
fun DetailScreen(title: String?,description:String?,url:String?) {
   Column {
      Text(text = title?:"N/A")
      Spacer(modifier = Modifier.height(20.dp))
      AsyncImage(model = url?:R.drawable.broken_image_24, contentDescription = null,
         contentScale= ContentScale.Fit,
         placeholder= painterResource(id = R.drawable.broken_image_24),
         error = painterResource(id = R.drawable.broken_image_24),
         modifier = Modifier
            .size(80.dp, 80.dp)
            .clip(MaterialTheme.shapes.large))
      Spacer(modifier = Modifier.height(20.dp))
      Text(text = description?:"N/A")
   }
}