package com.devdroid.contacts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class MyAdaptyer(private val mydata: List<MyData>): RecyclerView.Adapter<MyAdaptyer.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imgCont = itemView.findViewById<ImageView>(R.id.imgCont)
        val txtName = itemView.findViewById<TextView>(R.id.txtName)
        val Number =itemView.findViewById<TextView>(R.id.txtNum)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mydata.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = mydata[position]
        holder.imgCont.setImageResource(currentItem.imgCont)
        holder.txtName.text = currentItem.Name
        holder.Number.text = currentItem.Num

    }
}