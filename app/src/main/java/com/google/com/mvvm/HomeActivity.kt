package com.google.com.mvvm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.com.mvvm.models.topNewsResponse.TopNewsResponse
import com.google.com.mvvm.rx.RxThread
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {


    @Inject
    internal lateinit var api: NewsAPI

    @Inject
    internal lateinit var rxThread: RxThread

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        (application as MyApplication).getComponent().inject(this)
    }

    override fun onResume() {
        super.onResume()
        getNews()
    }

    private fun getNews() {
        CompositeDisposable().add(api.getTopStories()
            .compose(rxThread.applyAsync())
            .onErrorReturnItem(TopNewsResponse())
            .subscribe({}, {})
        )
    }
}
