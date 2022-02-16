package com.example.podlodkahomework.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.recyclerview.widget.RecyclerView
import com.example.podlodkahomework.R
import com.example.podlodkahomework.ui.theme.model.*
import com.example.podlodkahomework.ui.theme.screen.elements.*


@Composable
fun MainScreen() {
    val data = getData()

    LazyColumn(modifier = Modifier
        .background(color = MaterialTheme.colors.background)
        .fillMaxWidth()) {
        data.forEach {
            item {
                when (it) {
                    is MainHeader -> GameHeader(it.imageId, it.title, it.ratio, it.reviewCounter, it.iconId, it.title)
                    is Tags -> TagRow(it.tags)
                    is Description-> GameDescription(it.description)
                    is VideoRow -> VideoPreviewRow(it.imagesIds)
                    is Ratio -> ReviewAndRating(it.ratio, it.reviewCounter)
                    is Reviews -> ReviewList(it.reviewList)

                }
            }
        }

        item {
            Button(
                onClick = { },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp, top = 16.dp, bottom = 40.dp)
                    .height(64.dp),
            ) {
                Text(
                    text = "Install",
                    style = MaterialTheme.typography.h2,
                    color = MaterialTheme.colors.background,
                )
            }
        }
    }
}

fun getData() : MutableList<MainScreenModel> {
    val data = mutableListOf<MainScreenModel>()
    val tags = listOf("MOBA", "MULTIPLAYER", "STRATEGY")
    val textDescription = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own."
    val imageVideoList = listOf(R.drawable.image_18, R.drawable.image_18)
    val reviewList = mutableListOf(
        ReviewModel(iconId = R.drawable.human1, name = "Auguste Conte", date = "February 14, 2019", reviewText = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."),
        ReviewModel(iconId = R.drawable.human2, name = "Jang Marcelino", date = "February 14, 2019", reviewText = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.")
    )
    data.add(MainHeader(R.drawable.img_top, "DoTA 2", 4.9F,  R.drawable.icon_dota,"70M"))
    data.add(Tags(tags))
    data.add(Description(textDescription))
    data.add(VideoRow(imageVideoList))
    data.add(Ratio(4.9F, "70M"))
    data.add(Reviews(reviewList))

    return data
}