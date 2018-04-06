package com.droidsmith.redditlog.repository.remote

import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


interface RedditService {




    companion object {
        private const val BASE_URL = "https://www.reddit.com/api/v1/"
        private val CLIENT_ID = "YOUR CLIENT_ID"

        fun create() : RedditService{

            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build();

             val retrofit = Retrofit.Builder()
                     .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                     .addConverterFactory(GsonConverterFactory.create())
                     .client(client)
                     .baseUrl(BASE_URL)
                     .build()

            return retrofit.create(RedditService::class.java)
        }
    }

}