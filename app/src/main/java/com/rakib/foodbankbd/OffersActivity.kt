package com.rakib.foodbankbd

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rakib.foodbankbd.adapters.OfferRecyclerViewAdapter
import com.rakib.foodbankbd.entities.OfferObject
import com.rakib.foodbankbd.helpers.SpacesItemDecoration
import java.util.*

class OffersActivity : AppCompatActivity() {
    var offersTitle: TextView? = null
    var areaCode = 0
    private lateinit var offerRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offers)

        offersTitle = findViewById(R.id.textViewOffersTitle)
        areaCode = intent.extras.getInt("AREA_CODE")
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        offerRecyclerView = findViewById(R.id.recyclerViewOffer)
        val gridLayoutManager = GridLayoutManager(this@OffersActivity, 2)
        offerRecyclerView.layoutManager = gridLayoutManager
        offerRecyclerView.setHasFixedSize(true)
        offerRecyclerView.addItemDecoration(SpacesItemDecoration(2, 24, true))
        areaWiseOfferShower()
    }

    private fun areaWiseOfferShower() {
        when (areaCode) {
            0 -> {
                offerRecyclerView.adapter = OfferRecyclerViewAdapter(this@OffersActivity, allOffersFromShyamoli)
                offersTitle!!.text = "Offers in Shyamoli"
            }
            1 -> {
                offerRecyclerView.adapter = OfferRecyclerViewAdapter(this@OffersActivity, allOffersFromDhanmondi)
                offersTitle!!.text = "Offers in Dhanmondi"
            }
            2 -> {
                offerRecyclerView.adapter = OfferRecyclerViewAdapter(this@OffersActivity, allOffersFromBanani)
                offersTitle!!.text = "Offers in Banani"
            }
            3 -> {
                offerRecyclerView.adapter = OfferRecyclerViewAdapter(this@OffersActivity, allOffersFromMirpur)
                offersTitle!!.text = "Offers in Mirpur"
            }
            4 -> {
                offerRecyclerView.adapter = OfferRecyclerViewAdapter(this@OffersActivity, allOffersFromWari)
                offersTitle!!.text = "Offers in Wari"
            }
        }
    }

    private val allOffersFromShyamoli: List<OfferObject>
        private get() {
            val offers: MutableList<OfferObject> = ArrayList()
            offers.add(OfferObject(
                    "Couple Offer",
                    R.drawable.best_couple_offer_hakka_square_shyamoli,
                    "For two person. Price is inclusive VAT. Food tastes ok.",
                    349.0,
                    "Undefined",
                    "Hakka Square (Shyamoli Square)",
                    "* Set Menu\n* Cold Drinks"))
            return offers
        }

    private val allOffersFromDhanmondi: List<OfferObject>
        private get() {
            val offers: MutableList<OfferObject> = ArrayList()
            offers.add(OfferObject(
                    "Matha Noshto Offer",
                    R.drawable.matha_noshto_offer_the_bitcoin_cafe_panthapath,
                    "Price is inclusive VAT. Food is delicious but service is so so. You can try this with your friends and family.",
                    220.0,
                    "Undefined",
                    "The Bitcoin Cafe (Panthapath)",
                    "* Tower Nachos\n* 4 Piece BBQ Wings"))
            offers.add(OfferObject(
                    "Black Bun Charcoal Burger (Mini)",
                    R.drawable.black_bun_charcoal_burger_mini_burger_queen_dhanmondi,
                    "Price is inclusive VAT. Food is so so. You can try this with your friends and family.",
                    95.0,
                    "Undefined",
                    "Burger Queen (Dhanmondi)",
                    "* Black Bun Charcoal Burger (Mini)"))
            offers.add(OfferObject(
                    "Ramen",
                    R.drawable.ramen_cheese_lab_panthapath,
                    "Food is good. You can try this with your friends and family.",
                    250.0,
                    "Undefined",
                    "Cheese Lab (Panthapath)",
                    "* Ramen"))
            offers.add(OfferObject(
                    "Chicken Cheese Burger",
                    R.drawable.chicken_cheese_burger_melt_town_dhanmondi,
                    "Food is delicious. Try this with your friends and family.",
                    99.0,
                    "Undefined",
                    "Melt Town (Dhanmondi)",
                    "* Chicken Cheese Burger"))
            offers.add(OfferObject(
                    "Pasta",
                    R.drawable.pasta_melt_town_dhanmondi,
                    "Food is delicious. Try this with your friends and family.",
                    99.0,
                    "Undefined",
                    "Melt Town (Dhanmondi)",
                    "* Pasta"))
            return offers
        }

    private val allOffersFromBanani: List<OfferObject>
        private get() {
            val offers: MutableList<OfferObject> = ArrayList()
            offers.add(OfferObject(
                    "Ultimate Chocolate Cake",
                    R.drawable.ultimate_chocolate_cake_tabaq_coffee_gulshan,
                    "Price is inclusive VAT. Very delicious dessert. You must try this with your friends and family.",
                    380.0,
                    "Undefined",
                    "Tabaq Coffee (Gulshan)",
                    "* Chocolate Cake"))
            return offers
        }

    private val allOffersFromMirpur: List<OfferObject>
        private get() {
            val offers: MutableList<OfferObject> = ArrayList()
            offers.add(OfferObject(
                    "BBQ Feast",
                    R.drawable.bbq_feast_peri_pasta_mirpur,
                    "Very delicious food. Try this with your friends and family.",
                    205.0,
                    "Undefined",
                    "Peri Pasta (Mirpur)",
                    "* Fried Rice\n* 2 Piece Chicken Drum\n* Chinese Vegetable\n* Garnish Salad"))
            offers.add(OfferObject(
                    "Naga Wave Pasta",
                    R.drawable.naga_wave_pasta_cheese_factory_mirpur,
                    "Very delicious pasta. Try this with your friends and family. Price is inclusive VAT.",
                    225.0,
                    "Undefined",
                    "Cheese Lab (Mirpur)",
                    "* Naga Pasta"))
            offers.add(OfferObject(
                    "Cheese and BBQ Chicken Pizza",
                    R.drawable.cheese_and_bbq_chicken_pizza_cheese_factory_mirpur,
                    "Very delicious pizza. Try this with your friends and family. Price is inclusive VAT.",
                    395.0,
                    "Undefined",
                    "Cheese Lab (Mirpur)",
                    "* Large Pizza"))
            offers.add(OfferObject(
                    "Mango Milkshake",
                    R.drawable.mango_milkshake_burger_queen_mirpur,
                    "Price is inclusive VAT. Food is so so. You can try this with your friends and family.",
                    70.0,
                    "Undefined",
                    "Burger Queen (Mirpur)",
                    "* Mango Milkshake"))
            offers.add(OfferObject(
                    "Vengaboys Burger Mini",
                    R.drawable.vengaboys_burger_mini_burger_queen_mirpur,
                    "Price is inclusive VAT. Food is so so. You can try this with your friends and family.",
                    70.0,
                    "Undefined",
                    "Burger Queen (Mirpur)",
                    "* Mini Burger"))
            return offers
        }

    private val allOffersFromWari: List<OfferObject>
        private get() {
            val offers: MutableList<OfferObject> = ArrayList()
            offers.add(OfferObject(
                    "SP: 02",
                    R.drawable.sp_02_grand_haveli_wari,
                    "Very delicious food. You must try this with your friends and family. Decoration is nice.",
                    250.0,
                    "Undefined",
                    "Grand Haveli (Wari)",
                    "* Set Menu"))
            return offers
        }
}
