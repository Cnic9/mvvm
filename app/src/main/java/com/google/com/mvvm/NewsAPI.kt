package com.google.com.mvvm

import com.google.com.mvvm.models.topNewsResponse.TopNewsResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET(TOP_HEADLINES)
    fun getTopStories(@Query("apiKey") key : String = API_KEY
                      ,@Query("language") lang : String = DEFAULT_LANGUAGE): Observable<TopNewsResponse>

}
