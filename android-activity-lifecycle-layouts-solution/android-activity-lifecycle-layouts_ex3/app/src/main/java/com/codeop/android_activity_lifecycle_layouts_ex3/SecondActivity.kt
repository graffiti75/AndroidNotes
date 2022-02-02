package com.codeop.android_activity_lifecycle_layouts_ex3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codeop.android_activity_lifecycle_layouts_ex3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idButtonScreen2.setOnClickListener { setActivityResult() }
        getExtrasFromParentActivity()
    }

    private fun getExtrasFromParentActivity() {
        val extras = intent.extras
        if (extras != null) {
            val previousScreenValue = extras.getString(FirstActivity.EXTRA)
            binding.idTextViewScreen2.text = previousScreenValue
        }
    }

    private fun setActivityResult() {
        val intent = Intent()
        setResult(CODE, intent)
        finish()
    }

    companion object {
        const val CODE = 2
    }
}