package com.example.appfilmes.ListaFilmesAdapter

import android.content.Context
import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appfilmes.ObjetosFilmes.Filme
import com.example.appfilmes.databinding.ActivityMainBinding

class ListaFilmeAdapter (private val filmes: List<Filme>, private val context: Context) :
Adapter<ListaFilmeAdapter.ViewHolder>() {

    class ViewHolder(
        view: View,
        private val binding: ListaFilmeItemBinding
    ): RecyclerView.ViewHolder(view)
    fun vincula(filme: Filme){
        Glide.with(Filme).this()
    }
}