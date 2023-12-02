package com.coderzf1.screensizesupport.presentation.utils

import androidx.compose.runtime.Composable

@Composable
fun ScreenSizeScaffold(
    compactScreen:@Composable () -> Unit = {},
    mediumScreen:@Composable () -> Unit = {},
    expandedScreen:@Composable () -> Unit = {}
){
    val windowInfo = rememberWindowInfo()
    when (windowInfo.screenWidthType){
        is WindowInfo.WindowType.Compact -> compactScreen()
        is WindowInfo.WindowType.Expanded -> expandedScreen()
        is WindowInfo.WindowType.Medium -> mediumScreen()
    }
}
