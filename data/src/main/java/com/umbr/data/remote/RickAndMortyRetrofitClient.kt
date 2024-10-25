package com.umbr.data.remote

import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import retrofit2.converter.gson.GsonConverterFactory

object RickAndMortyRetrofitClient {

    private const val BASE_URL = "https://rickandmortyapi.com/api/"
    private const val TIME_OUT = 10000L

    private val okhttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .readTimeout(TIME_OUT, TimeUnit.MINUTES)
        .connectTimeout(TIME_OUT, TimeUnit.MINUTES)
        .writeTimeout(TIME_OUT, TimeUnit.MINUTES)
        .build()

    private val retrofitClient = Retrofit.Builder()
        .client(okhttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val charactersApiService = retrofitClient.create(CharactersApiService::class.java)
}