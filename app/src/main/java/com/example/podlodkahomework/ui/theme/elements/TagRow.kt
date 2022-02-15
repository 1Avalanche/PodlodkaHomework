package com.example.podlodkahomework.ui.theme.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TagRow(listTags: List<String>) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.Black)
        .padding(24.dp)) {
        listTags.forEach {
            Card(shape = CircleShape,
                backgroundColor = Color.Green,
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(end = 10.dp)
            ) {
                Text(text = it,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp))
            }
        }

    }
}