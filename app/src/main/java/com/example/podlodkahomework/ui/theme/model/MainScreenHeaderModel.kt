package com.example.podlodkahomework.ui.theme.model

import androidx.compose.ui.graphics.painter.Painter

interface MainScreenHeaderModel {
    fun getType() : MainScreenHeaderModelType
}

data class MainHeader(
    val image: String,
    val title: String,
    val ratio: Int,
    val reviewCounter: Int,
    val tags: List<String>
) : MainScreenHeaderModel {
    override fun getType(): MainScreenHeaderModelType {
        return MainScreenHeaderModelType.HEADER
    }
}


data class Description(
    val description: String
) : MainScreenHeaderModel {
    override fun getType(): MainScreenHeaderModelType {
        return MainScreenHeaderModelType.DESCRIPTION
    }
}

data class VideoDescription (
    val content: List<Painter>
) : MainScreenHeaderModel {
    override fun getType(): MainScreenHeaderModelType {
        return MainScreenHeaderModelType.VIDEO
    }
}

data class Ratio(
    val ratio: Int,
    val reviewCounter: Int,
) : MainScreenHeaderModel {
    override fun getType(): MainScreenHeaderModelType {
        return MainScreenHeaderModelType.RATIO
    }
}

data class Review(
    val icon: String,
    val name: String,
    val date: String,
    val reviewText: String
) : MainScreenHeaderModel {
    override fun getType(): MainScreenHeaderModelType {
        return MainScreenHeaderModelType.REVIEW
    }
}

enum class MainScreenHeaderModelType{
    HEADER,
    DESCRIPTION,
    VIDEO,
    RATIO,
    REVIEW,

}