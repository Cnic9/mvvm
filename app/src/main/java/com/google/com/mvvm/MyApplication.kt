package com.google.com.mvvm

import android.app.Application
import com.facebook.stetho.Stetho
import com.google.com.mvvm.di.AppComponent
import com.google.com.mvvm.di.ApplicationModule
import com.google.com.mvvm.di.DaggerAppComponent

class MyApplication : Application() {

    private lateinit var component : AppComponent

    override fun onCreate(){
        super.onCreate()
        createComponent()
        initialise()
    }

    private fun initialise() {
        Stetho.initializeWithDefaults(this)
    }

    private fun createComponent() {
        component = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    fun getComponent() : AppComponent = component
}