package com.example.bottomnavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigation.screens.Screen

@Composable
fun Navigation(navController: NavHostController  ,


               pd: PaddingValues

               ){
    NavHost(navController = navController, startDestination = Screen.NavigationScreen.Home.route  , modifier = Modifier.padding(pd)){
        composable(Screen.NavigationScreen.Home.route){
            Screen(text ="Home" )
        }

        composable(Screen.NavigationScreen.Settings.route){
            Screen(text ="Settings" )

        }



        composable(Screen.NavigationScreen.Account.route){
            Screen(text = "Account" )

        }


        composable(Screen.NavigationScreen.Notification.route){
            Screen(text ="Notification" )

        }


    }
}