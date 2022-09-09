package com.example.appfilmes

import com.google.gson.annotations.SerializedName

data class FilmeResposta (
    @SerializedName("results") val resultado: List<Filme>,
    @SerializedName("total_pages") val totalPaginas: Int,
    @SerializedName("total_results") val totalResultado: Int,
//    @SerializedName("page") val page: Int, USADO PARA PAGINAÇÃO
)

