package com.example.soundsstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.soundsstore.ui.theme.ui.theme.SoundsStoreTheme

class BuyingPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoundsStoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    BuyPage()
                }
            }
        }
    }
}

@Composable
fun BuyPage(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = {  }) {

                }
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                val image = painterResource(id = R.drawable.airpods)
                Image(painter = image, contentDescription = null, modifier = Modifier
                    .width(200.dp)
                    .height(200.dp))
            }
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(top = 400.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
            elevation = CardDefaults.cardElevation(15.dp)) {
                
            }
        }
        
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    SoundsStoreTheme {
//        Greeting("Android")
        BuyPage()
    }
}