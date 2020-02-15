package com.rakib.foodbankbd

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.rakib.foodbankbd.entities.OfferObject

class OfferActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var offerImage: ImageView
    private lateinit var offerName: TextView
    private lateinit var offerLocation: TextView
    private lateinit var offerPrice: TextView
    private lateinit var offerDuration: TextView
    private lateinit var offerItem: TextView
    private lateinit var offerDescription: TextView
    private lateinit var gson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        offerImage = findViewById(R.id.imageViewOfferImage)
        offerName = findViewById(R.id.textViewOfferName)
        offerLocation = findViewById(R.id.textViewOfferLocation)
        offerPrice = findViewById(R.id.textViewOfferPrice)
        offerDuration = findViewById(R.id.textViewOfferDuration)
        offerItem = findViewById(R.id.textViewOfferItem)
        offerDescription = findViewById(R.id.textViewOfferDescription)
        findViewById<View>(R.id.buttonMap).setOnClickListener(this)

        val gsonBuilder = GsonBuilder()
        gson = gsonBuilder.create()
        val offerInStringFormat = intent.extras.getString("OFFER_CODE")
        val singleOffer = gson.fromJson(offerInStringFormat, OfferObject::class.java)

        if (singleOffer != null) {
            offerImage.setImageResource(singleOffer.offerImage)
            offerName.append(singleOffer.offerName)
            offerLocation.append(singleOffer.offerLocation)
            offerPrice.append(java.lang.Double.toString(singleOffer.offerPrice))
            offerDuration.append(singleOffer.offerDuration)
            offerItem.append(singleOffer.offerItem)
            offerDescription.append(singleOffer.offerDescription)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonMap -> Toast.makeText(this@OfferActivity, "This feature is coming soon!", Toast.LENGTH_LONG).show()
        }
    }
}
