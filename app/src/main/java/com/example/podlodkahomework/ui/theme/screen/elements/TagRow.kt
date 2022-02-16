package com.example.podlodkahomework.ui.theme.screen.elements

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TagRow(listTags: List<String>) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(24.dp)) {
        listTags.forEach {
            Card(shape = CircleShape,
                backgroundColor = MaterialTheme.colors.primaryVariant.copy(alpha = 0.24f),
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(end = 10.dp)
            ) {
                Text(text = it,
                    style = MaterialTheme.typography.subtitle2,
                    color = MaterialTheme.colors.primaryVariant,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp))
            }
        }

    }
}