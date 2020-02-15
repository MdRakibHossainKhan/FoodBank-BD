package com.rakib.foodbankbd.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rakib.foodbankbd.R

class AreaRecyclerViewHolder(itemView: View) : ViewHolder(itemView) {
    var areaImage: ImageView = itemView.findViewById(R.id.imageViewArea)
    var areaName: TextView = itemView.findViewById(R.id.textViewArea)
}
