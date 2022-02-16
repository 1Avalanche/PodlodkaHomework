package com.example.podlodkahomework.ui.theme.screen.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GameHeader(imageId: Int, name: String, ratio: Float, reviewCounter: String,
               iconPainterId: Int, iconDescription: String) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(378.dp)) {

        Image(painter = painterResource(id = imageId),
              contentDescription = name,
              contentScale = ContentScale.FillBounds,
              modifier = Modifier
            .fillMaxWidth()
            .height(312.dp))

        Column(verticalArrangement = Arrangement.SpaceBetween,
               modifier = Modifier
                   .fillMaxSize()
                   .padding( start = 24.dp, end = 24.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp)) {
                RoundBlurButton(icon = painterResource(id = com.example.podlodkahomework.R.drawable.ic_arrowleft), description = "button back")
                RoundBlurButton(icon = painterResource(id = com.example.podlodkahomework.R.drawable.ic_more_square), description = "button more")
            }
            TitleWithRatio(
                name = name,
                ratio = ratio,
                reviewCounter = reviewCounter,
                iconPainterId = iconPainterId,
                iconDescription = iconDescription
            )
        }
    }
}