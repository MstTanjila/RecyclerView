package com.bogo.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bogo.recyclerview.databinding.ListitemBinding

class FlowerAdapter(  private val flowerlist:ArrayList<Flower>):RecyclerView.Adapter<FlowerAdapter.MyViewHolder>() {
    var onClick:((Flower)->Unit)?=null
    class MyViewHolder( val binding: ListitemBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(ListitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return flowerlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val flower=flowerlist[position]
        holder.binding.apply {
            profilename.text=flower.flowername
            profiledetails.text=flower.flowerdetails
            profileImage.setImageResource(flower.flowerimage)
        }
        holder.itemView.setOnClickListener{
            onClick?.invoke(flower)
        }

    }
}