package com.example.podlodkahomework.ui.theme.screen.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.podlodkahomework.R

@Composable
fun ReviewAndRating(ratio: Float, reviewCounter: String) {
    val spacerWidth = calculateSpacerWidth(ratio)
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 24.dp, end = 24.dp, bottom = 6.dp)) {

        Text(text = "Review & Ratings",
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.padding(bottom = 12.dp))

        Row(verticalAlignment = Alignment.Bottom,
            modifier = Modifier.height(58.dp)) {
            Text(text = ratio.toString(),
                style = MaterialTheme.typography.h1,
                color = MaterialTheme.colors.onSurface)

            Column(verticalArrangement = Arrangement.Bottom,
                   modifier = Modifier.fillMaxHeight().align(Alignment.Bottom)
                       .padding(bottom = 8.dp, start = 16.dp)) {

                Box(modifier = Modifier.wrapContentWidth().padding(bottom = 8.dp)) {
                    Row() {
                        for (i in 0 until 5) {
                            Image(painter = painterResource(id = R.drawable.icon_star),
                                contentDescription = "Ratio star",
                                modifier = Modifier.padding(end = 4.dp).width(16.dp).height(12.dp))
                        }
                    }
                    Spacer(modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .height(14.dp)
                        .width(spacerWidth.dp)
                        .background(MaterialTheme.colors.background.copy(alpha = 0.8f)))
                }
            Text(text = "$reviewCounter Reviews",
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.onSecondary)
            }
        }
    }
}

fun calculateSpacerWidth(ratio: Float) : Int {
    return when (ratio) {
        in 4.5F..5F -> 12
        in 4f..4.5F -> 22
        in 3.5F..4.0F -> 28
        in 3F..3.5F -> 38
        in 2.5F..3F -> 44
        in 2.0F..2.5F -> 54
        in 1.5F..2.0F -> 60
        in 1.0F..1.5F -> 70
        in 0.5F..1.0F -> 76
        in 0F..0.5F -> 86
        else ->0
    }
}