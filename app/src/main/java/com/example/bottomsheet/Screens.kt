package com.example.bottomsheet

import androidx.annotation.DrawableRes

sealed class Screens (val title : String , val route : String) {

    sealed class SheetContent(val dtitle : String  , val droute : String  ,  @DrawableRes val icon : Int ) : Screens(dtitle,droute) {
        object Account : SheetContent("First","first" , R.drawable.ic_account)
        object Settings : SheetContent("Second","second" , R.drawable.ic_settings)
        object Logout : SheetContent("Third","third" , R.drawable.ic_logout)
    }


}

val SheetList = listOf(
    Screens.SheetContent.Account,
    Screens.SheetContent.Settings,
    Screens.SheetContent.Logout
)

