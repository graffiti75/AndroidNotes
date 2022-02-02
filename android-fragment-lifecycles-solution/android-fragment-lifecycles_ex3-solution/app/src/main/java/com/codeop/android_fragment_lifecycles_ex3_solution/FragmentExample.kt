package com.codeop.android_fragment_lifecycles_ex3_solution

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.codeop.android_fragment_lifecycles_ex3_solution.MainActivity.Companion.KEY_PERSON
import com.codeop.android_fragment_lifecycles_ex3_solution.databinding.FragmentExampleBinding

class FragmentExample : Fragment(R.layout.fragment_example) {

    companion object {
        const val KEY_TEXT_CONTENT = "parcelable"
    }

    private lateinit var binding: FragmentExampleBinding
    private var textContent = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentExampleBinding.bind(view)

        textContent = if (savedInstanceState == null) {
            val person = requireArguments().getParcelable<Person>(KEY_PERSON)
            person.toString()
        } else {
            savedInstanceState.getString(KEY_TEXT_CONTENT).toString()
        }
        binding.textView.text = textContent
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_TEXT_CONTENT, textContent)
    }
}