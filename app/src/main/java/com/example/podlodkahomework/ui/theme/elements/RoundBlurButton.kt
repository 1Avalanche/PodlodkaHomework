package com.example.podlodkahomework.ui.theme.elements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.podlodkahomework.R
import java.util.*

@Composable
fun RoundBlurButton(icon: Painter, description: String) {
    Card(shape = CircleShape,
        border = BorderStroke(width = 0.5.dp, color = Color.White),
        backgroundColor = Color.White.copy(alpha = 0.5f),
    modifier = Modifier.size(56.dp)) {
        Box(contentAlignment = Alignment.Center) {
            Icon(painter = icon,
            contentDescription = description,
            tint = Color.White)
        }
    }
}

