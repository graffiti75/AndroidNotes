package com.codeop.android_persisting_data_advanced_concept_ex1_solution

import android.content.Context

class DataSource(val context: Context) {

    fun addTimestamp(datetime: Datetime) {
        addToDatetimeList(context, datetime)
    }

    fun getAllTimestamps(): List<Datetime>? {
        val list = loadDatetimeList(context)
        list?.let {
            return it
        }
        return mutableListOf()
    }
}