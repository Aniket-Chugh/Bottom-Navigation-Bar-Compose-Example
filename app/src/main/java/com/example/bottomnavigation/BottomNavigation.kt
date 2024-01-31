package com.example.bottomnavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavigation(
    selected: Boolean,
    item: Screen.NavigationScreen,
    onItemClicked: () -> Unit,
    modifier: Modifier
) {




        Column(
            modifier = modifier
                .clickable { onItemClicked() }.padding(1.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally


            ) {
            Icon(
                painter = painterResource(id = item.icon),
                modifier = Modifier.size(29.dp),
                contentDescription = null,
                tint = if (selected) Color.Blue else Color.Black
            )
            Text(
                text = item.title,

                fontFamily = FontFamily.Serif,
                fontSize = 10.sp,
                // Adjusted padding here
            )
        }


}
