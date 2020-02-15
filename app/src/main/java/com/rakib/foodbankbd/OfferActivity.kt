package com.rakib.foodbankbd

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.rakib.foodbankbd.entities.OfferObject
import kotlinx.android.synthetic.main.activity_offer.*

class OfferActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var gson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        val gsonBuilder = GsonBuilder()
        gson = gsonBuilder.create()
        val offerInStringFormat = intent.extras?.getString("OFFER_CODE")
        val singleOffer = gson.fromJson(offerInStringFormat, OfferObject::class.java)

        if (singleOffer != null) {
            imageViewOfferImage.setImageResource(singleOffer.offerImage)
            textViewOfferName.append(singleOffer.offerName)
            textViewOfferLocation.append(singleOffer.offerLocation)
            textViewOfferPrice.append(java.lang.Double.toString(singleOffer.offerPrice))
            textViewOfferDuration.append(singleOffer.offerDuration)
            textViewOfferItem.append(singleOffer.offerItem)
            textViewOfferDescription.append(singleOffer.offerDescription)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.textViewOfferLocation -> Toast.makeText(this@OfferActivity, "This feature is coming soon!", Toast.LENGTH_LONG).show()
        }
    }
}
