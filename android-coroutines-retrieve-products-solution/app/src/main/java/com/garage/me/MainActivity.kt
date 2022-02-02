package com.garage.me

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.garage.me.base.BaseActivity
import com.garage.me.data.UiProducts
import com.garage.me.home.GarageMeListViewModel
import javax.inject.Inject

class MainActivity : BaseActivity() {

    private lateinit var viewModel: GarageMeListViewModel

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = withViewModel(viewModelFactory) {
            observe(getUiModel(), ::render)
            fetchProductsWithCallback()
        }
        setContentView(R.layout.activity_main)
    }

    private fun render(uiModel: UiProducts) {
        when (uiModel) {
            is UiProducts.Void -> Toast.makeText(this, "No products", Toast.LENGTH_SHORT).show()
            is UiProducts.Data -> {
                val sb = StringBuilder()
                uiModel.data.map { sb.append(it.id).append("\n") }
                Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
