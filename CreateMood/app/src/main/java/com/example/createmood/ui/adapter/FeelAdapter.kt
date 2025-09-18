package com.example.createmood.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.createmood.Feel
import com.example.createmood.R

class FeelAdapter(private var itemList: MutableList<Feel>): RecyclerView.Adapter<FeelViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FeelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feel, parent, false)
        return FeelViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: FeelViewHolder,
        position: Int
    ) {
        holder.caption.text = itemList[position].name_feel
        holder.image.setImageResource(itemList[position].image)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}