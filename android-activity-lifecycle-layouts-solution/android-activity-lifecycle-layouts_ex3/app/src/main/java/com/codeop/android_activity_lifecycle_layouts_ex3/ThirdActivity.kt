package com.codeop.android_activity_lifecycle_layouts_ex3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codeop.android_activity_lifecycle_layouts_ex3.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idButtonScreen3.setOnClickListener { setActivityResult() }
        getExtrasFromParentActivity()
    }

    private fun getExtrasFromParentActivity() {
        val extras = intent.extras
        if (extras != null) {
            val previousScreenValue = extras.getString(FirstActivity.EXTRA)
            binding.idTextViewScreen3.text = previousScreenValue
        }
    }

    private fun setActivityResult() {
        val intent = Intent()
        setResult(CODE, intent)
        finish()
    }

    companion object {
        const val CODE = 3
    }
}