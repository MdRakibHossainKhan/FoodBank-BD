package com.rakib.foodbankbd.entities

class OfferObject(val offerName: String,
                  val offerImage: Int,
                  val offerDescription: String,
                  val offerPrice: Double,
                  val offerDuration: String,
                  val offerLocation: String,
                  val offerItem: String) {

    override fun toString(): String {
        return "Offer Name: $offerName"
    }
}
