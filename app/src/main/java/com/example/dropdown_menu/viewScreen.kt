package com.example.dropdown_menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun ViewScreen(model: Model , modifier: Modifier = Modifier) {


    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize().background(
        MaterialTheme.colorScheme.primary)){

        Card(modifier = Modifier.fillMaxWidth()
            .padding(20.dp).height(70.dp)) {
            Row( verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.3f)) {
                Text("Date of spnding")
            }

            Row( verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.3f)) {
                Text("Budget")
                Text("spent")
            }

            Row( verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.3f)) {
                Text("comment")
            }

        }

    }
}