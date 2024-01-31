package com.example.bottomnavigation

import androidx.annotation.DrawableRes

sealed class Screen( val title : String , val route : String){

    sealed class NavigationScreen(dtitle : String , droute : String , @DrawableRes val icon : Int) : Screen(dtitle, droute){
        object Home : NavigationScreen("Home" , "home" , R.drawable.ic_home)
        object Settings : NavigationScreen("Settings" , "settings" , R.drawable.ic_settings)
        object Notification : NavigationScreen("Notification" , "notification" , R.drawable.ic_notification)
        object Account : NavigationScreen("Account" , "account" , R.drawable.ic_account)
    }




}


val BottomList = listOf(
    Screen.NavigationScreen.Account,
        Screen.NavigationScreen.Notification,
        Screen.NavigationScreen.Settings,
    Screen.NavigationScreen.Home

)