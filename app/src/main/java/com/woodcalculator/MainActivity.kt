package com.woodcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Text
import com.woodcalculator.ui.theme.WoodCalculatorTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val data = listOf("☕️", "🙂", "🥛", "🎉", "📐", "🎯", "🧩", "😄", "🥑")
    WoodCalculatorTheme {
        Column {
            Text(text = "shri")
            Text(text = "shri2")
        }
    }
}
