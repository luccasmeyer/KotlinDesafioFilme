package com.example.appfilmes.Retrofit


import com.example.appfilmes.Service.Service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(
            GsonConverterFactory.create())
        .build()

    val notaService = retrofit.create(Service::class.java)
}