package com.rakib.foodbankbd.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rakib.foodbankbd.OffersActivity
import com.rakib.foodbankbd.R
import com.rakib.foodbankbd.entities.AreaObject

class AreaRecyclerViewAdapter(private val context: Context, private val allAreas: List<AreaObject>) : RecyclerView.Adapter<AreaRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AreaRecyclerViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.layout_area, parent, false)
        return AreaRecyclerViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: AreaRecyclerViewHolder, position: Int) {
        val singleArea = allAreas[position]
        holder.areaName.text = singleArea.areaName
        holder.areaImage.setImageResource(singleArea.areaImage)

        holder.areaImage.setOnClickListener {
            val areaIntent = Intent(context, OffersActivity::class.java)
            areaIntent.putExtra("AREA_CODE", position)
            context.startActivity(areaIntent)
        }
    }

    override fun getItemCount(): Int {
        return allAreas.size
    }
}
