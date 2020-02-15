package com.rakib.foodbankbd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.rakib.foodbankbd.adapters.AreaRecyclerViewAdapter
import com.rakib.foodbankbd.entities.AreaObject
import com.rakib.foodbankbd.helpers.SpacesItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridLayoutManager = GridLayoutManager(this@MainActivity, 2)
        recyclerViewArea.layoutManager = gridLayoutManager
        recyclerViewArea.setHasFixedSize(true)
        recyclerViewArea.addItemDecoration(SpacesItemDecoration(2, 24, true))
        val areaRecyclerViewAdapter = AreaRecyclerViewAdapter(this@MainActivity, allArea)
        recyclerViewArea.adapter = areaRecyclerViewAdapter
    }

    private val allArea: List<AreaObject>
        get() {
            val areas: MutableList<AreaObject> = ArrayList()
            areas.add(AreaObject("Shyamoli", R.drawable.shyamoli))
            areas.add(AreaObject("Dhanmondi", R.drawable.dhanmondi))
            areas.add(AreaObject("Banani", R.drawable.banani))
            areas.add(AreaObject("Mirpur", R.drawable.mirpur))
            areas.add(AreaObject("Wari", R.drawable.wari))
            return areas
        }
}
