package com.codeop.android_app_architecture_persistence_ex1_solution

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.codeop.android_app_architecture_persistence_ex1_solution.databinding.FragmentMainBinding

class MyFragment : Fragment(R.layout.fragment_main) {

    private lateinit var viewModel: MyViewModel
    private lateinit var viewModelFactory: MyViewModelFactory
    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainBinding.bind(view)

        viewModelFactory = MyViewModelFactory(DataSource())
        viewModel = ViewModelProvider(this, viewModelFactory)[MyViewModel::class.java]
        binding.myViewModel = viewModel

        viewModel.timeFormatted.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.textView.text = it
            }
        })
        binding.lifecycleOwner = this
    }
}
