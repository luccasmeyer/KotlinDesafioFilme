package com.example.appfilmes

import retrofit2.Call
import retrofit2.http.GET


interface Service {
    @GET("movie/popular")
    suspend fun buscaTodas(): Call<FilmeResposta>
}