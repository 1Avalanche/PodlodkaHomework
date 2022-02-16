package com.example.podlodkahomework.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.podlodkahomework.R
import com.example.podlodkahomework.ui.theme.elements.GameHeader
import com.example.podlodkahomework.ui.theme.elements.TagRow
import com.example.podlodkahomework.ui.theme.elements.TitleWithRatio

val tags = listOf("MOBA", "MULTIPLAYER", "STRATEGY")

@Composable
fun MainScreen() {
    Column(modifier = Modifier
        .background(color = MaterialTheme.colors.background)
        .fillMaxWidth()) {
        GameHeader(
            imageId = R.drawable.img_top,
            name = "DoTA 2",
            ratio =5 ,
            reviewCounter = 70,
            iconPainterId = R.drawable.icon_dota,
            iconDescription = ""
        )
        TagRow(listTags = tags)
    }


}