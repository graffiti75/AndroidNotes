package com.codeop.android_persisting_data_advanced_concept_ex1

import java.text.SimpleDateFormat
import java.util.*

fun List<Long>.formatTime(): List<Datetime> {
    val formattedList = mutableListOf<Datetime>()
    for ((id, current) in this.withIndex()) {
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        val date = formatter.format(current)
        formattedList.add(Datetime(id, date))
    }
    return formattedList
}