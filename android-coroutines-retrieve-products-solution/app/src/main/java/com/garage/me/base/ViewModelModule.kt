package com.garage.me.base

import androidx.lifecycle.ViewModel
import com.garage.me.home.GarageMeListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(GarageMeListViewModel::class)
    internal abstract fun bindGarageMeListViewModel(viewModel: GarageMeListViewModel): ViewModel
}