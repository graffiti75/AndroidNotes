package com.codeop.android_app_architecture_persistence_ex1_solution

class DataSource {

    private var timestamps = mutableListOf<Long>()

    fun addTimestamp(millis: Long) {
        timestamps.add(millis)
    }

    fun getAllTimestamps(): List<Long> {
        return timestamps
    }
}