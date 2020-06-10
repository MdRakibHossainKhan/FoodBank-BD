package com.rakib.foodbankbd.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.layout_area.view.*

class OfferRecyclerViewHolder(itemView: View) : ViewHolder(itemView) {
    var offerImage: ImageView = itemView.imageViewArea
    var offerName: TextView = itemView.textViewArea
}
