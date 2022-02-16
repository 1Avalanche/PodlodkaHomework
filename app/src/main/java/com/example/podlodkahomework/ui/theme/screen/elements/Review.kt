package com.example.podlodkahomework.ui.theme.screen.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.podlodkahomework.ui.theme.model.ReviewModel

@Composable
fun ReviewList(reviews: List<ReviewModel>) {
    Column() {
        for (review in reviews) {
            if (review !=reviews.last()) {
                Review(name = review.name, date = review.date, reviewText = review.reviewText , imageId = review.iconId)
                Spacer(
                    modifier = Modifier
                        .padding(horizontal = 38.dp)
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(Color.White.copy(alpha = 0.1f))
                )
            } else {
                Review(name = review.name, date = review.date, reviewText = review.reviewText , imageId = review.iconId)
            }
        }
    }
}

@Composable
fun Review(name: String, date: String, reviewText: String, imageId: Int) {
    Column(modifier = Modifier.padding(24.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentHeight()
                .padding(bottom = 16.dp)) {
            Card(shape = CircleShape,
                modifier = Modifier.size(36.dp)) {
                Image(painter = painterResource(id = imageId),
                      contentDescription = "reviewer photo",
                      contentScale = ContentScale.FillBounds)
            }
            
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(text = name,
                    style = MaterialTheme.typography.h4,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.padding(bottom = 7.dp))
                Text(text = date,
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.4F))
            }
        }
        Text(text = "\"$reviewText\"",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onSecondary,)

    }
}