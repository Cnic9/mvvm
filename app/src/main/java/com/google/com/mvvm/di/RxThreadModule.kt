package com.google.com.mvvm.di

import com.google.com.mvvm.di.RxThreadModule.Companion.mainThread
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton

@Module
class RxThreadModule {

    @Singleton
    @Provides
    @Named(mainThread)
    fun provideAndroidSchedulers(): Scheduler = AndroidSchedulers.mainThread()

    @Provides
    @Singleton
    @Named(ioThread)
    fun provideSchedulersIO(): Scheduler = Schedulers.io()


    companion object {
        const val mainThread = "mainThread"
        const val ioThread = "ioThread"
    }
}