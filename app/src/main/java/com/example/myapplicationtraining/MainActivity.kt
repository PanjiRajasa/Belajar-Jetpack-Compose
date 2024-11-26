package com.example.myapplicationtraining

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationtraining.ui.theme.MyApplicationTrainingTheme
import com.example.myapplicationtraining.ui.theme.Typography

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTrainingTheme {
                Scaffold {
                    TextColumn()
                }
            }
        }
    }
}

@Composable
fun TextColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
    {
        Greeting("Panjiee")
        Greeting("Panjiee")
        FirstText("Jetpcak Compose")
        TextFromParam("I am excited to code with Kotlin Jetpack Compose")
    }

}

@Composable
fun FirstText(paramCustom: String) {
    Text(
        text = "This is my first $paramCustom Application!"
    )
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TextFromParam(text: String) {
    Column {
        Text(
            text = text,
            style = Typography.titleSmall
        )
        Text(
            text = "Second text",
            fontWeight = FontWeight.W700
        )
        Text(
            text = "Third text",
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTrainingTheme {
        Greeting("Android")
    }
}