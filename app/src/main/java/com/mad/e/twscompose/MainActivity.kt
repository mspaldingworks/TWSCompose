package com.mad.e.twscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.mad.e.twscompose.ui.theme.TWSComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TWSComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                }
            }
        }
    }
}

