package com.k7.retrofit


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class retrofit {


     object RetrofitModule {


        private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://www.cbr-xml-daily.ru/")   //
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val iRetrofit: iRetrofit = retrofit.create()
    }
}