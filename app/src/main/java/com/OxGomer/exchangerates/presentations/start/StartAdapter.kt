package com.OxGomer.exchangerates.presentations.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.OxGomer.exchangerates.R
import com.OxGomer.exchangerates.data.remote.models.rates.RateItem
import com.OxGomer.exchangerates.data.remote.models.rates.Rates

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<RateItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view){
        var cc:TextView = itemView.findViewById(R.id.item_cc)
        var buy:TextView = itemView.findViewById(R.id.item_buy)
        var name:TextView = itemView.findViewById(R.id.item_name)
        var date:TextView = itemView.findViewById(R.id.item_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rates_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.cc.text = listStart[position].cc
        holder.buy.text = listStart[position].rate.toString()
        holder.name.text = listStart[position].txt
        holder.date.text = listStart[position].exchangedate
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: Rates){
        listStart = list
        notifyDataSetChanged()
    }
}