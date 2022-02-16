package com.example.podlodkahomework.ui.theme.screen.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun VideoPreviewRow(listOfId: List<Int>) {
    LazyRow(modifier = Modifier
        .wrapContentHeight()
        .padding(vertical = 24.dp)) {
        item { Spacer(modifier = Modifier.width(24.dp)) }
        listOfId.forEach { item {VideoPreview(it) } }
    }
}

@Composable
fun VideoPreview(imageId: Int) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.padding(end = 15.dp)) {

        Card(shape = RoundedCornerShape(24.dp),
            modifier = Modifier.size(240.dp, 135.dp)) {

            Image(painter = painterResource(id = imageId), contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }

    RoundBlurButton(icon = painterResource(id = com.example.podlodkahomework.R.drawable.ic_arrow_right), description = "play video preview")

    }
}

