package com.garage.me.base

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Provider
import javax.inject.Singleton

@Module
open class AppModule {

    @Provides
    fun provideContext(application: Application) : Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    @Suppress("UNCHECKED_CAST")
    fun provideViewModelFactory(
        providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
    ) = object : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return requireNotNull(providers[modelClass as Class<out ViewModel>]).get() as T
        }
    }
}