package com.rakib.foodbankbd.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.rakib.foodbankbd.OfferActivity
import com.rakib.foodbankbd.R
import com.rakib.foodbankbd.entities.OfferObject

class OfferRecyclerViewAdapter(private val context: Context, private val allOffers: List<OfferObject>) : RecyclerView.Adapter<OfferRecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferRecyclerViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.layout_area, parent, false)
        return OfferRecyclerViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: OfferRecyclerViewHolder, position: Int) {
        val singleOffer = allOffers[position]
        holder.offerName.text = singleOffer.offerName
        holder.offerImage.setImageResource(singleOffer.offerImage)

        holder.offerImage.setOnClickListener {
            val offerIntent = Intent(context, OfferActivity::class.java)
            val gsonBuilder = GsonBuilder()
            val gson = gsonBuilder.create()
            val stringObjectRepresentation = gson.toJson(singleOffer)
            offerIntent.putExtra("OFFER_CODE", stringObjectRepresentation)
            context.startActivity(offerIntent)
        }
    }

    override fun getItemCount(): Int {
        return allOffers.size
    }
}
