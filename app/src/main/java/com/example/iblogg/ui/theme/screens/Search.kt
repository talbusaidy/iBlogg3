package com.example.iblogg.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.iblogg.navigation.ROUTE_HOME
import com.example.iblogg.navigation.ROUTE_Notification
import com.example.iblogg.navigation.ROUTE_PROFILE
import com.example.iblogg.navigation.ROUTE_SEARCH
import com.example.iblogg.ui.theme.Green

@Composable
fun Searchscreen(navController: NavController){
    Scaffold (
        bottomBar = {
            BottomAppBar (
                actions = {
                    IconButton(onClick = { navController.navigate(ROUTE_HOME) }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription ="Home Icon" )
                    }
                    IconButton(onClick = { navController.navigate(ROUTE_Notification) }) {
                        Icon(
                            Icons.Filled.Notifications,
                            contentDescription = "Notification Icon")
                    }
                    IconButton(onClick = {navController.navigate(ROUTE_SEARCH)}) {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = "Search Icon")
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { navController.navigate(ROUTE_PROFILE) },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()) {
                        Icon(
                            Icons.Filled.AccountCircle,
                            contentDescription ="Profile Icon" )
                    }
                }
            )




        }
    ){innerPadding -> Column( modifier = Modifier
        .padding(innerPadding)
        .verticalScroll(rememberScrollState())
        .padding(10.dp)
        .fillMaxWidth()) {

    }}


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchscreenPrev(){
    Searchscreen(rememberNavController())
}