package com.k7.retrofit



import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.http.GET
import retrofit2.http.Path


interface iRetrofit {

    @GET("daily_json.js")
    suspend fun getinfo(): DataAPI



}