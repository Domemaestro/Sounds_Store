package com.example.soundsstore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.soundsstore.ui.theme.SoundsStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoundsStoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IntroPage()
                }
            }
        }
    }
}

@Composable
fun IntroPage(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFEFB8C8))) {

        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                val logoImg = painterResource(id = R.drawable.logoimg)
                Image(painter = logoImg, contentDescription = "HeadPhone", modifier = Modifier
                    .padding(top = 200.dp)
                    .width(300.dp))

                Text(text = "Sound Store", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                
            }
        }
        //background inside Box
        Box(contentAlignment = Alignment.BottomStart, modifier = Modifier.fillMaxSize()) {
            //context (This activity)
            val mContext = LocalContext.current

            //button inside
            Button(onClick = {
                mContext.startActivity(Intent(mContext,FrontPage::class.java))
            },
                shape = CircleShape,
            modifier = Modifier
                .padding(start = 50.dp, bottom = 50.dp)
                .size(60.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFCCC2DC)),
                elevation = ButtonDefaults.buttonElevation(15.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                val image = painterResource(id = R.drawable.next_arrow)
                Image(painter = image, contentDescription = "next Activity")

            }
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SoundsStoreTheme {
        IntroPage()
    }
}