package com.example.dropdown_menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dropdown_menu.ui.theme.DropdownmenuTheme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DropdownmenuTheme {
//                create an instance of the view model
//                val model = ViewModel
//                creating navigation buttons that will stick at the bottom for all screens
//                var navController =

                Scaffold(bottomBar = {
                    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
                        Button({}) { Text("home") }
                        Button({}) { Text("details") }
                        Button({}) { Text("calculator") }
                    }
                },modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Menu(modifier = Modifier.padding(innerPadding))

//                    NavHost(){
//
//                    }

                }
            }
        }
    }
}

@Composable
fun Menu( modifier: Modifier = Modifier) {


   Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize().background(
       MaterialTheme.colorScheme.background)){



   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}