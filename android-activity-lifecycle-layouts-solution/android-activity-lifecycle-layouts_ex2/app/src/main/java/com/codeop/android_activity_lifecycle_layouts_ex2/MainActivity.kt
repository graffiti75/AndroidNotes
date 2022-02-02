package com.codeop.android_activity_lifecycle_layouts_ex2

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codeop.android_activity_lifecycle_layouts_ex2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
    }

    private fun initLayout() {
        with(binding.idButton) {
            setOnClickListener {
                initViewAnimation()
                val content = binding.idEditText.text.toString()
                if (content != "") {
                    // Updates TextView value.
                    showHiddenViews(content = content)
                } else {
                    // Shows the alert message on the screen.
                    Toast.makeText(this.context, getString(R.string.null_edit_text), Toast.LENGTH_SHORT).show()
                    showHiddenViews(show = false)
                }
            }
        }
    }

    private fun showHiddenViews(show: Boolean = true, content: String = "") {
        if (show) {
            binding.idTextView.text = content
            binding.idLinearLayout.visibility = View.VISIBLE
        } else {
            binding.idTextView.text = ""
            binding.idLinearLayout.visibility = View.GONE
        }
    }
}