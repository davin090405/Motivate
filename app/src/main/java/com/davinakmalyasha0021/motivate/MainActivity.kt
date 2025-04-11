package com.davinakmalyasha0021.motivate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.davinakmalyasha0021.motivate.navigation.SetupNavGraph
import com.davinakmalyasha0021.motivate.ui.theme.MotivateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MotivateTheme  {
                SetupNavGraph()
            }
        }
    }
}
