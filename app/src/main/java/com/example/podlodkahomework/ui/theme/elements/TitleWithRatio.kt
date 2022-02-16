package com.example.podlodkahomework.ui.theme.elements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.podlodkahomework.Greeting
import com.example.podlodkahomework.R
import com.example.podlodkahomework.ui.theme.PodlodkaHomeworkTheme

@Composable
fun TitleWithRatio(name: String, ratio: Int, reviewCounter: Int,
                   iconPainterId: Int, iconDescription: String
) {
    Row(modifier = Modifier.height(88.dp)) {

        Card(shape = RoundedCornerShape(12.dp),
            border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.surface),
            backgroundColor = Color.Black,
            modifier = Modifier.size(88.dp)) {
            Image(painter = painterResource(id = iconPainterId), contentDescription = iconDescription, modifier = Modifier.padding(15.dp))
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxHeight().padding(start = 12.dp)) {

            Text(text = name, style = MaterialTheme.typography.h2, color = MaterialTheme.colors.onSurface)

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(28.dp)) {
                for (i in 0 until ratio) {
                    Image(painter = painterResource(id = R.drawable.icon_star),
                        contentDescription = "Ratio star",
                        modifier = Modifier.padding(end = 4.dp).size(16.dp))
                }
                    Text("$reviewCounter" + "M",
                        style = MaterialTheme.typography.subtitle1,
                        color = MaterialTheme.colors.onBackground,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PodlodkaHomeworkTheme {
        TitleWithRatio("Android", 5, 70, R.drawable.icon_dota, "")
    }
}