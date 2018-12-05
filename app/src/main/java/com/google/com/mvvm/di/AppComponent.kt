package com.google.com.mvvm.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class,NetworkModule::class))
interface AppComponent {

}