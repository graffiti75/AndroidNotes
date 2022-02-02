package com.codeop.android_persisting_data_advanced_concept_ex1

class DataSource {

    private var timestamps = mutableListOf<Long>()

    fun addTimestamp(millis: Long) {
        timestamps.add(millis)
    }

    fun getAllTimestamps(): List<Long> {
        return timestamps
    }
}