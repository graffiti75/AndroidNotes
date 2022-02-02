package com.codeop.android_styles_themes_ex3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.codeop.android_styles_themes_ex3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val count = ObservableInt(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.count = count

        binding.addButton.setOnClickListener {
            count.set(count.get() + 1)
        }

        binding.subtractButton.setOnClickListener {
            count.set(count.get() - 1)
        }
    }
}