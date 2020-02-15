package com.rakib.foodbankbd.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rakib.foodbankbd.R

class OfferRecyclerViewHolder(itemView: View) : ViewHolder(itemView) {
    var offerImage: ImageView = itemView.findViewById(R.id.imageViewArea)
    var offerName: TextView = itemView.findViewById(R.id.textViewArea)
}
