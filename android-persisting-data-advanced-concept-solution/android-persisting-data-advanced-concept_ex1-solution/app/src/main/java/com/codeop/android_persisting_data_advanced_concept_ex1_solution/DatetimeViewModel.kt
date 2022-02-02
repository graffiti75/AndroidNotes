package com.codeop.android_persisting_data_advanced_concept_ex1_solution

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class DatetimeViewModel(val dataSource: DataSource) : ViewModel() {

    private val _timestamps = MutableLiveData<List<Datetime>>()
    val timestamps: LiveData<List<Datetime>>
        get() = _timestamps

    val timestampVisible = Transformations.map(timestamps) {
        it?.isNotEmpty()
    }

    init {
        _timestamps.value = dataSource.getAllTimestamps()
    }

    fun onButtonClicked() {
        val millis = System.currentTimeMillis()
        dataSource.addTimestamp(Datetime(generateRandomId(), millis))
        _timestamps.value = dataSource.getAllTimestamps()
    }
}
