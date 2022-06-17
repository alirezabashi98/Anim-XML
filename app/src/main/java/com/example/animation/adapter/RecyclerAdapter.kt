package com.example.animation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animation.databinding.RecyclerItemViewBinding

class RecyclerAdapter(val data: List<String>) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(val item: RecyclerItemViewBinding) :
        RecyclerView.ViewHolder(item.root) {
        fun setData(text: String) {
            item.txtTst.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder =
        RecyclerViewHolder(
            RecyclerItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) =
        holder.setData(data[position])

    override fun getItemCount(): Int = data.size
}