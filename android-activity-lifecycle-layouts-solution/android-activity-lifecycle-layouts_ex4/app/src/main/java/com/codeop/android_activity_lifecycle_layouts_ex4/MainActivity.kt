package com.codeop.android_activity_lifecycle_layouts_ex4

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codeop.android_activity_lifecycle_layouts_ex4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY_TEXT_CONTENT = "parcelable"
    }

    private lateinit var binding: ActivityMainBinding
    private var textContent = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_TEXT_CONTENT, textContent)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textContent = savedInstanceState.getString(KEY_TEXT_CONTENT).toString()
        showHiddenViews(content = textContent)
    }

    private fun initLayout() {
        with(binding.idButton) {
            setOnClickListener {
                initViewAnimation()
                textContent = binding.idEditText.text.toString()
                if (textContent != "") {
                    showHiddenViews(content = textContent)
                } else {
                    Toast.makeText(this.context, getString(R.string.empty_edit_text), Toast.LENGTH_SHORT).show()
                    showHiddenViews(show = false, content = "")
                }
            }
        }
    }

    private fun showHiddenViews(show: Boolean = true, content: String = "") {
        if (show) {
            with(binding.idTextView) {
                text = content
                visibility = View.VISIBLE
            }
        } else {
            with(binding.idTextView) {
                text = ""
                visibility = View.GONE
            }
        }
    }
}