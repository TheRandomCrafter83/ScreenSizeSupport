package com.coderzf1.screensizesupport.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CompactScreen(modifier: Modifier = Modifier){
    LazyColumn(modifier = modifier){
        items(20){ index ->
            Text("Item $index")
        }
    }
}