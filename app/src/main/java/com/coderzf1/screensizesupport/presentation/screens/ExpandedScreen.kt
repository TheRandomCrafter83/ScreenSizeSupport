package com.coderzf1.screensizesupport.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ExpandedScreen(modifier: Modifier = Modifier){
    var selectedText by rememberSaveable{ mutableStateOf("") }
    Row(modifier = modifier) {
        LazyColumn(
            modifier = Modifier
                .weight(.25f)
                .fillMaxHeight()
                .background(color = Color.Cyan)
        ){
            items(20){ index ->
                Text(
                    text ="Item ${index + 1}",
                    modifier = Modifier
                        .clickable {
                            selectedText = "The selected item is - Item ${index + 1}"
                        }
                )
            }
        }
        Text(
            text = selectedText,
            modifier = Modifier
                .fillMaxHeight()
                .background(color = Color.Yellow)
                .weight(.5f)
        )
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(.25f)
                .background(color = Color.Magenta)
        )
    }

}