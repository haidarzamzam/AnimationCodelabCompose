package com.example.animationcodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.animationcodelab.ui.theme.AnimationCodelabTheme
import com.example.animationcodelab.ui.theme.home.Home

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationCodelabTheme {
                Home()
            }
        }
    }
}
