package com.coderzf1.screensizesupport

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.coderzf1.screensizesupport.presentation.screens.CompactScreen
import com.coderzf1.screensizesupport.presentation.screens.ExpandedScreen
import com.coderzf1.screensizesupport.presentation.screens.MediumScreen
import com.coderzf1.screensizesupport.presentation.utils.ScreenSizeScaffold
import com.coderzf1.screensizesupport.ui.theme.ScreenSizeSupportTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenSizeSupportTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenSizeScaffold(
                        compactScreen = {
                            CompactScreen(
                                modifier = Modifier.fillMaxSize()
                            )
                        },
                        mediumScreen = {
                            MediumScreen(
                                modifier = Modifier.fillMaxSize()
                            )
                        },
                        expandedScreen = {
                            ExpandedScreen(
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    )
                }
            }
        }
    }
}

