package com.garage.me.base

import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class GarageMeApp : DaggerApplication() {
        override fun onCreate() {
            super.onCreate()
            AndroidThreeTen.init(this)
        }
        override fun applicationInjector(): AndroidInjector<GarageMeApp> {
            return DaggerAppComponent.factory()
                .create(this)
        }
}