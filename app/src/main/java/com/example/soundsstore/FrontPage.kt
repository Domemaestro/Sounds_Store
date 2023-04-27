package com.example.soundsstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
            .padding(top = 60.dp, start = 25.dp, bottom = 16.dp)) {
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

            //using mutableStateOf to change button color on click


            Button(onClick = {}, modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
            elevation = ButtonDefaults.buttonElevation(15.dp)) {
                Text(text = "All", color = Color.White)
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

        Box(modifier = Modifier.padding(top = 20.dp)) {
            //Cardview set up in Grid (LazyGrid)
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .padding(start = 20.dp, end = 20.dp), elevation = CardDefaults.cardElevation(20.dp), shape = RoundedCornerShape(30.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize().background(Color.White)) {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp), contentAlignment = Alignment.TopCenter) {
                        val image = painterResource(id = R.drawable.airpodspro3rd)
                        Image(painter = image, contentDescription = null, contentScale = ContentScale.Fit,
                            modifier = Modifier.padding(top = 10.dp))


                    }
                }

            }

        }


    }
}

@Composable
fun DisplayCards(){
    Card(modifier = Modifier
        .width(150.dp)
        .height(200.dp), elevation = CardDefaults.cardElevation(20.dp),
        ) {

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    SoundsStoreTheme {
        MainPage()
    }
}