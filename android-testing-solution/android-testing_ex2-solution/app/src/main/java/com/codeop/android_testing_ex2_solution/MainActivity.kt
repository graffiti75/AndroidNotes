package com.codeop.android_testing_ex2_solution

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {

    companion object {
        private const val DATASET_COUNT = 50
    }

    private val dataSet: MutableList<String> = ArrayList(DATASET_COUNT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager

        initDataSet()

        val adapter = CustomAdapter(dataSet, applicationContext)
        recyclerView.adapter = adapter
    }

    private fun initDataSet() {
        for (i in 0 until DATASET_COUNT) {
            dataSet.add(getString(R.string.item_element_text) + i)
        }
    }
}