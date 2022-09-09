package com.example.appfilmes.ObjetosFilmes

import com.google.gson.annotations.SerializedName

data class Filme (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val titulo: String,
    @SerializedName("release_date") val dataLancamento: String,
    @SerializedName("original_language") val linguagem: String,
    @SerializedName("poster_path") val imagemVertical: String,
)
