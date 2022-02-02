package com.codeop.android_fragment_lifecycles_ex3_solution

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.codeop.android_fragment_lifecycles_ex3_solution.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        binding.btnFragment.setOnClickListener {
            callFragmentExample()
        }
    }

    private fun callFragmentExample() {
        val bundleWithObject = bundleOf(
            KEY_PERSON to Person("Marie Curie", 30)
        )

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentExample>(R.id.fragment_container_view, args = bundleWithObject)
        }
    }

    companion object {
        const val KEY_PERSON = "PERSON"
    }
}