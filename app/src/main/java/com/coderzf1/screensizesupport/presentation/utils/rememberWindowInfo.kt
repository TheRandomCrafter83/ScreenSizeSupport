package com.coderzf1.screensizesupport.presentation.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun rememberWindowInfo():WindowInfo{
    val configuration = LocalConfiguration.current
    return WindowInfo(
        screenWidthType = when {
            configuration.screenWidthDp < 600 -> WindowInfo.WindowType.Compact
            configuration.screenWidthDp < 840 -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },
        screenHeightType = when {
            configuration.screenHeightDp < 480 -> WindowInfo.WindowType.Compact
            configuration.screenHeightDp < 900 -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },
        screenWidthDP = configuration.screenWidthDp.dp,
        screenHeightDp = configuration.screenHeightDp.dp
    )
}

data class WindowInfo(
    val screenWidthType:WindowType,
    val screenHeightType:WindowType,
    val screenWidthDP: Dp,
    val screenHeightDp: Dp
){
    sealed class WindowType{
        object Compact:WindowType()
        object Medium:WindowType()
        object Expanded:WindowType()
    }
}