package com.hgm.memoryleak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.hgm.memoryleak.ui.theme.MemoryLeakTheme

class SecondActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                  MemoryLeakTheme {
                        Box(
                              modifier = Modifier.fillMaxSize(),
                              contentAlignment = Alignment.Center
                        ) {
                              Text(text = "SecondActivity")
                        }
                  }
            }

            MainActivity.context = this
      }
}