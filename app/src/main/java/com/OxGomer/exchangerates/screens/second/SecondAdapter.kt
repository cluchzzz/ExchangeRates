package com.OxGomer.exchangerates.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.OxGomer.exchangerates.R
import com.OxGomer.exchangerates.model.rates.RateItem
import com.OxGomer.exchangerates.model.rates.Rates
import com.OxGomer.exchangerates.model.reserve.Reserve
import com.OxGomer.exchangerates.model.reserve.ReserveItem

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.StartViewHolder>() {

    var listStart = emptyList<ReserveItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view){
        var txt:TextView = itemView.findViewById(R.id.item_txt)
        var txten:TextView = itemView.findViewById(R.id.item_txten)
        var value:TextView = itemView.findViewById(R.id.item_value)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reserve_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.txt.text = listStart[position].txt
        holder.txten.text = listStart[position].txten
        holder.value.text = listStart[position].value.toString()
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: Reserve){
        listStart = list
        notifyDataSetChanged()
    }
}