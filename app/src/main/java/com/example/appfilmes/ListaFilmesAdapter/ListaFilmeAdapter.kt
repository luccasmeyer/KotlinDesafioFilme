package com.example.appfilmes.ListaFilmesAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appfilmes.ObjetosFilmes.Filme
import com.example.appfilmes.databinding.FilmeItemBinding

class ListaFilmeAdapter: RecyclerView.Adapter<ListaFilmeAdapter.ViewHolder>(){

//root pega o "item pai"

    val listaFilmeAdapter: ArrayList<Filme> = arrayListOf()

    inner class ViewHolder(private val binding: FilmeItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(banana: Filme){
            binding.notaItemTitulo.text = banana.titulo
            binding.dataDeLancamento.text = banana.dataLancamento
            binding.linguagem.text = banana.linguagem

            val imageurl = "https://image.tmdb.org/t/p/w500${banana.imagemVertical}"
            Glide.with(binding.root).load(imageurl).into(binding.filmeImagem)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(FilmeItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listaFilmeAdapter[position])//atualiza a posição do adapter
    }

    override fun getItemCount(): Int {
        return listaFilmeAdapter.size
    }

    fun populaAdapter(listaFilme: List<Filme>){
        val oldrangeitens = listaFilmeAdapter.size
        val newrangeitens = listaFilme.size
        notifyItemRangeInserted(oldrangeitens, newrangeitens)
        //chama sempre novos 20 itens
    }
}