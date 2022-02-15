package com.example.podlodkahomework.ui.theme.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun VideoPreviewRow(listOfId: List<Int>) {
    LazyRow(modifier = Modifier
        .padding(horizontal = 24.dp, vertical = 20.dp)
        .wrapContentHeight()) {
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

        Card(shape = CircleShape,
            backgroundColor = Color.White.copy(0.3f),
            modifier = Modifier.size(48.dp).advancedShadow(Color.White, 0.5f, 5.dp, 5.dp, 0.dp, 0.dp)) {
        }

    }
}

fun Modifier.advancedShadow(
    color: Color = Color.Black,
    alpha: Float = 0f,
    cornersRadius: Dp = 0.dp,
    shadowBlurRadius: Dp = 0.dp,
    offsetY: Dp = 0.dp,
    offsetX: Dp = 0.dp
) = drawBehind {

    val shadowColor = color.copy(alpha = alpha).toArgb()
    val transparentColor = color.copy(alpha = 0f).toArgb()

    drawIntoCanvas {
        val paint = Paint()
        val frameworkPaint = paint.asFrameworkPaint()
        frameworkPaint.color = transparentColor
        frameworkPaint.setShadowLayer(
            shadowBlurRadius.toPx(),
            offsetX.toPx(),
            offsetY.toPx(),
            shadowColor
        )
        it.drawRoundRect(
            0f,
            0f,
            this.size.width,
            this.size.height,
            cornersRadius.toPx(),
            cornersRadius.toPx(),
            paint
        )
    }
}