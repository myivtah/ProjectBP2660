package com.example.projectbp2660

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterResponsi(private val listPerpustakaan: List<PerpustakaanModel>):
RecyclerView.Adapter<AdapterResponsi.ViewHolder>(){

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image: ImageView = itemView.findViewById(R.id.imageViewBook1)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResponsi.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AdapterResponsi.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}