package com.codeop.android_activity_lifecycle_layouts_ex3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codeop.android_activity_lifecycle_layouts_ex3.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
    }

    override fun onActivityResult(code: Int, result: Int, intent: Intent?) {
        super.onActivityResult(code, result, intent)
        if (result == SecondActivity.CODE) {
            Toast.makeText(this, getString(R.string.screen2_returned), Toast.LENGTH_SHORT).show()
        } else if (result == ThirdActivity.CODE) {
            Toast.makeText(this, getString(R.string.screen3_returned), Toast.LENGTH_SHORT).show()
        }
    }

    private fun initLayout() {
        with(binding) {
            idButtonScreen1OpenScreen2.setOnClickListener(this@FirstActivity)
            idButtonScreen1OpenScreen3.setOnClickListener(this@FirstActivity)
        }
    }

    override fun onClick(v: View) {
        var intent: Intent? = null
        val extras = Bundle()
        if (v.id == R.id.id_button_screen1_open_screen2) {
            intent = Intent(this, SecondActivity::class.java)
            extras.putString(EXTRA, "Apples and oranges")
        } else if (v.id == R.id.id_button_screen1_open_screen3) {
            intent = Intent(this, ThirdActivity::class.java)
            extras.putString(EXTRA, "Pineapples and strawberries")
        }
        intent!!.putExtras(extras)
        startActivityForResult(intent, CODE)
    }

    companion object {
        const val CODE = 1
        const val EXTRA = "intent_extra"
    }
}