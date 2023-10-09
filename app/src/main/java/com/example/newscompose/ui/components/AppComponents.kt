package com.example.newscompose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.newscompose.R
import com.example.newscompose.data.entity.Article
import com.example.newscompose.data.entity.NewsResponse
import com.example.newscompose.ui.navigation.Screens
import com.example.newscompose.ui.theme.Purple40
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun Loader() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .size(70.dp)
                .padding(15.dp),
            color = Purple40
        )
    }
}


@Composable
fun NewsList(newsResponse: NewsResponse,navController: NavController) {
    LazyColumn {
        items(newsResponse.articles) { article ->
            NewsCardList(article, onItemClick = {articalItem->
                val encodeUrl = URLEncoder.encode(articalItem.urlToImage.toString(),
                    StandardCharsets.UTF_8.toString())
                navController.navigate(
                    Screens.DetialScreen.withArgs(
                        articalItem.title.toString(),
                        articalItem.description.toString(),
                        encodeUrl)
                )
            })
            NewsDivider()
        }
    }
}

@Composable
fun NewsDivider() {
    Divider(
        modifier = Modifier.padding(horizontal = 14.dp),
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.08f)
    )
}
@Composable
fun NewsCardList(article: Article,onItemClick:(Article) -> Unit) {
    Row(
        modifier = Modifier.clickable {
           onItemClick(article)
        }
    ){
     NewsImage(article.urlToImage,Modifier.padding(16.dp))
     Column(
         modifier = Modifier
             .weight(1f)
             .padding(vertical = 10.dp)
     ) {
         NewsTitle(article.title)
         NewsAuthor(article.author)
     }
   }
}

@Composable
fun NewsAuthor(author: String?,modifier: Modifier=Modifier) {
    Row(modifier) {
        Text(
            text = "Author By: $author",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
@Composable
fun NewsTitle(title: String?) {
   Text(
       text = title?: "NA",
       style = MaterialTheme.typography.titleMedium,
       maxLines = 3,
       overflow = TextOverflow.Ellipsis
   )
}
@Composable
fun NewsImage(urlToImage: String?, modifier: Modifier) {
    AsyncImage(model = urlToImage, contentDescription = null,
        contentScale=ContentScale.Fit,
        placeholder= painterResource(id = R.drawable.broken_image_24),
        error = painterResource(id = R.drawable.broken_image_24),
        modifier = modifier
            .size(80.dp, 80.dp)
            .clip(MaterialTheme.shapes.large))
}


