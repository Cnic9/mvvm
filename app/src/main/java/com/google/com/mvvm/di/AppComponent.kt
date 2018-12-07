package com.google.com.mvvm.di

import com.google.com.mvvm.HomeActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class,NetworkModule::class,RxThreadModule::class))
interface AppComponent {

    fun inject(homeActivity: HomeActivity)

}