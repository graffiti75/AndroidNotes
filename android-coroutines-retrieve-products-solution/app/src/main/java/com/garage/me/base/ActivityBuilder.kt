package com.garage.me.base

import com.garage.me.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun provideMainActivity() : MainActivity
}