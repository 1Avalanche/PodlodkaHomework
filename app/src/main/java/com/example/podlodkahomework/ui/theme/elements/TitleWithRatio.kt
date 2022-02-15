package com.example.podlodkahomework.ui.theme.elements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.podlodkahomework.R

@Composable
fun TitleWithRatio(name: String, ratio: Int, reviewCounter: Int,
                   iconPainterId: Int, iconDescription: String
) {
    Row(modifier = Modifier.height(88.dp)) {

        Card(shape = RoundedCornerShape(12.dp),
            border = BorderStroke(width = 3.dp, color = Color.White),
            backgroundColor = Color.White.copy(alpha = 0.2f),
            modifier = Modifier.size(88.dp)) {
            Image(painter = painterResource(id = iconPainterId), contentDescription = iconDescription, modifier = Modifier.padding(15.dp))
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.padding(start = 12.dp).fillMaxHeight()) {
            Text(text = name)
            Row(modifier = Modifier.height(14.dp)) {
                for (i in 0 until ratio) {
                    Image(painter = painterResource(id = R.drawable.icon_star),
                        contentDescription = "Ratio star",
                        modifier = Modifier.padding(horizontal = 4.dp).size(16.dp))
                }
                    Text("$reviewCounter" + "M",
                    modifier = Modifier.padding(start = 10.dp))
            }
        }
    }
}