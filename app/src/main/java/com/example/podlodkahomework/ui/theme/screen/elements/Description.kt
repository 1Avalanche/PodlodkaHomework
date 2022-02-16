package com.example.podlodkahomework.ui.theme.screen.elements

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GameDescription(text: String) {
                Text(
                text = text,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary.copy(alpha = 0.7f),
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 1.dp)
            )
}