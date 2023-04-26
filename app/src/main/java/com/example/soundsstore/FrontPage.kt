package com.example.soundsstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.soundsstore.ui.theme.SoundsStoreTheme

class FrontPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoundsStoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage(){
    //For Gradient Background
    val gradBack = Brush.verticalGradient(listOf(Color.White, Color(0xFFffdde1), Color(0xFFEFB8C8)))

    Column(modifier = Modifier
        .fillMaxSize()
        .background(gradBack)) {
        //Main Section container of all
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 25.dp, bottom = 16.dp)) {
            //top section
            Text(text = buildString {
                append("New\n")
                append("\n")
                append("arrivals")
            }, fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold,
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            Button(onClick = {}, modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFffdde1)),
            elevation = ButtonDefaults.buttonElevation(15.dp)) {
                Text(text = "All", color = Color.Black)
            }

            Button(onClick = {}, elevation = ButtonDefaults.buttonElevation(15.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFffdde1))) {
                Text(text = "Headphones", color = Color.Black)
            }

            Button(onClick = {}, modifier = Modifier.padding(start = 20.dp),
                elevation = ButtonDefaults.buttonElevation(15.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFffdde1))) {
                Text(text = "Earphones", color = Color.Black)
            }
            
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    SoundsStoreTheme {
        MainPage()
    }
}