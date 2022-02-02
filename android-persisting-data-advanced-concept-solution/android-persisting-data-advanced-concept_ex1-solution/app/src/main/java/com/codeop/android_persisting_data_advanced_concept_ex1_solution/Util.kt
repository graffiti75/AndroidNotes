package com.codeop.android_persisting_data_advanced_concept_ex1_solution

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*

const val PREFERENCE_KEY = "SharedPreferences"
const val DATETIME_LIST_KEY = "datetime_list"
const val STRING_LENGTH = 10;

fun loadDatetimeList(context: Context): MutableList<Datetime>? {
    val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFERENCE_KEY, MODE_PRIVATE)
    val gson = Gson()
    val json = sharedPreferences.getString(DATETIME_LIST_KEY, null)
    val type: Type = object : TypeToken<ArrayList<Datetime>?>() {}.type
    return gson.fromJson<ArrayList<Datetime>>(json, type)
}

fun addToDatetimeList(context: Context, item: Datetime) {
    var list: MutableList<Datetime>? = loadDatetimeList(context)
    if (list == null) list = mutableListOf()
    list.add(item)

    val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFERENCE_KEY, MODE_PRIVATE)
    val editor = sharedPreferences.edit()
    val gson = Gson()

    val json: String = gson.toJson(list)
    editor.putString(DATETIME_LIST_KEY, json)
    editor.apply()
}

fun generateRandomId(): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..STRING_LENGTH)
        .map { allowedChars.random() }
        .joinToString("")
}