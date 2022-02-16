package com.example.podlodkahomework.ui.theme.model

import androidx.compose.ui.graphics.painter.Painter

interface MainScreenModel

data class MainHeader(
    val imageId: Int,
    val title: String,
    val ratio: Float,
    val iconId: Int,
    val reviewCounter: String
) : MainScreenModel

data class Tags(
    val tags: List<String>
)  : MainScreenModel

data class Description(
    val description: String
) : MainScreenModel

data class VideoRow (
    val imagesIds: List<Int>
) : MainScreenModel

data class Ratio(
    val ratio: Float,
    val reviewCounter: String,
) : MainScreenModel

data class Reviews(
    val reviewList: List<ReviewModel>
) : MainScreenModel

data class ReviewModel(
    val iconId: Int,
    val name: String,
    val date: String,
    val reviewText: String
)
