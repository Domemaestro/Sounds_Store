package com.example.soundsstore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            val mContext = LocalContext.current
            Box(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = {
                    mContext.startActivity(Intent(mContext,FrontPage::class.java))
                }, modifier = Modifier
                    .padding(start = 20.dp, top = 30.dp)
                    .size(60.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFffdde1)),
                shape = CircleShape,
                contentPadding = PaddingValues(0.dp), elevation = ButtonDefaults.buttonElevation(15.dp)
                ) {
                    val image = painterResource(id = R.drawable.back_btn)
                    Image(painter = image, contentDescription = "next Activity")
                }
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp), contentAlignment = Alignment.Center) {
                val image = painterResource(id = R.drawable.airpodspro2nd)
                Image(painter = image, contentDescription = null, modifier = Modifier
                    .width(200.dp)
                    .height(200.dp))
            }
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(top = 400.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                colors = CardDefaults.cardColors(Color(0xFFffdde1)),
            elevation = CardDefaults.cardElevation(20.dp)) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp)) {
                    Text(text = buildString {
                        append("Apple\n")
                        append("\n")
                        append("AirPods Pro")
                    }, fontSize = 30.sp,
                    fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 40.dp))

                    Text(text = "AirPods Pro take the listening experience to a new level of individuality. Personalized Spatial Audio with dynamic head tracking works with all your devices to immerse you deeper in all-around-you sound.",
                    modifier = Modifier.padding(top = 20.dp, bottom = 40.dp, start = 40.dp, end = 40.dp), textAlign = TextAlign.Justify)

                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Button(onClick = { }, colors = ButtonDefaults.buttonColors(Color(0xFFEB98A1)),
                        elevation = ButtonDefaults.buttonElevation(20.dp)
                        ) {
                            Text(text = "₹19,900", color = Color.Black, modifier = Modifier.padding(10.dp),
                            fontSize = 18.sp)
                        }
                        Button(onClick = { },colors = ButtonDefaults.buttonColors(Color.Black),
                            elevation = ButtonDefaults.buttonElevation(20.dp)) {
                            Text(text = "Add to cart", color = Color.White,modifier = Modifier.padding(10.dp),
                            fontSize = 18.sp)
                        }
                        
                    }
                }

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