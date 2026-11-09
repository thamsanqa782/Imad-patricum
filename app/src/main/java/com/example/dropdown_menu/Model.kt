package com.example.dropdown_menu

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class Model: ViewModel() {

//    declared four arays for storing data
    var yearList = mutableListOf<String>("2026", "2026")
    private set
    var monthList = mutableListOf<String>("09", "09")
        private set
    var dayList = mutableListOf<String>("02", "03")
        private set

    var Daily_Budget_List = mutableListOf<String>("2400", "100")
        private set

    var Daily_Spent_List =mutableListOf<String>("400", "70")
    private set

    var Comment_List = mutableListOf<String>("data", "kota")
    private set
//    declare all input data from te user
    var year =  mutableStateOf("")
//    all calculations and functions
}