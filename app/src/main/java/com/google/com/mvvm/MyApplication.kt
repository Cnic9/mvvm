package com.google.com.mvvm

import android.app.Application
import com.google.com.mvvm.di.AppComponent
import com.google.com.mvvm.di.ApplicationModule
import com.google.com.mvvm.di.DaggerAppComponent

class MyApplication : Application() {

    lateinit var component : AppComponent

    override fun onCreate(){
        super.onCreate()
        createComponent()
    }

    private fun createComponent() {
        component = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}