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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.soundsstore.DataModel.DataUse
import com.example.soundsstore.DataSource.DataSource
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
            .padding(top = 80.dp, start = 25.dp, bottom = 16.dp)) {
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

        Box(modifier = Modifier.padding(top = 8.dp)) {
            //Cardview set up in Grid (LazyGrid)
            LazyGrids(dataList = DataSource().loadFunction())

        }


    }
}

@Composable
fun DisplayCards(dataSource:DataUse){
    Card(modifier = Modifier
        .width(220.dp)
        .height(220.dp)
        .padding(start = 20.dp, end = 20.dp, bottom = 20.dp), elevation = CardDefaults.cardElevation(20.dp), shape = RoundedCornerShape(30.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(130.dp), contentAlignment = Alignment.TopCenter) {
                val image = painterResource(id = dataSource.ImageResourceId)
                Image(painter = image, contentDescription = null, contentScale = ContentScale.Fit,
                    modifier = Modifier.padding(top = 10.dp))
            }
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = stringResource(id = dataSource.TitleResourceId), color = Color.Black,
                        fontSize = 20.sp
                    )
                    Text(text = stringResource(id = dataSource.PriceResourceId))
                }
            }
        }

    }
}

//Implementation of lazyGrid
@Composable
private fun LazyGrids(dataList:List<DataUse>) {
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 190.dp)) {
        items(dataList){
            dataHolder -> DisplayCards(dataSource = dataHolder)
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