package com.example.appfilmes.Service

import com.example.appfilmes.ObjetosFilmes.FilmeResposta
import retrofit2.Call
import retrofit2.http.GET


interface Service {
    @GET("movie/popular")
    suspend fun buscaTodas(): Call<FilmeResposta>
}