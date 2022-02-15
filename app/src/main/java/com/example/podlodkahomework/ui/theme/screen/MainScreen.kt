package com.example.podlodkahomework.ui.theme.screen

import androidx.compose.runtime.Composable
import com.example.podlodkahomework.R
import com.example.podlodkahomework.ui.theme.elements.GameHeader
import com.example.podlodkahomework.ui.theme.elements.TitleWithRatio

@Composable
fun MainScreen() {
    GameHeader(
        imageId = R.drawable.img_top,
        name = "DoTA 2",
        ratio =5 ,
        reviewCounter = 70,
        iconPainterId = R.drawable.icon_dota,
        iconDescription = ""
    )
}