package com.example.recylceview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recylceview.adapter.MyAdapter
import com.example.recylceview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    lateinit var staggered: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup what it looks like
        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 4, LinearLayoutManager.VERTICAL, false)
        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        //recyclerView.layoutManager = gridLayoutManager
        recyclerView.layoutManager = staggered
        recyclerView.setHasFixedSize(true)

        //all about data
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.crustlesspizza,"Crustless Pizza"))
        items.add(MyModel(R.drawable.deepcheese,"Deep Dish Cheese Pizza"))
        items.add(MyModel(R.drawable.deepchicagoclassic,"Deep Dish Chicago Classic Specialty Pizza"))
        items.add(MyModel(R.drawable.deepitalianpizza,"Deep Dish Italian Beef LTO Pizza"))
        items.add(MyModel(R.drawable.deeppepperoni,"Deep Dish Pepperoni Pizza"))
        items.add(MyModel(R.drawable.deepsausage,"Deep Dish Sausage Pizza"))
        items.add(MyModel(R.drawable.deepspinach,"Deep Dish Spinach Pizza"))
        items.add(MyModel(R.drawable.deepthelou,"Deep Dish The Lou Specialty Pizza"))
        items.add(MyModel(R.drawable.deepveggie,"Deep Dish Veggie Specialty Pizza"))
        items.add(MyModel(R.drawable.deepwhitepizza,"Deep Dish White LTO Pizza"))
        items.add(MyModel(R.drawable.frozendeepcheese,"Frozen Deep Dish Cheese Pizza"))
        items.add(MyModel(R.drawable.frozendeeppepperoni,"Frozen Deep Dish Pepperoni Pizza"))
        items.add(MyModel(R.drawable.frozendeepsausage,"Frozen Deep Dish Sausage Pizza"))
        items.add(MyModel(R.drawable.frozendeepspinach,"Frozen Deep Dish Spinach Pizza"))
        items.add(MyModel(R.drawable.frozenthincheese,"Frozen Thin Crust Cheese Pizza"))
        items.add(MyModel(R.drawable.frozenthinpepperoni,"Frozen Thin Crust Pepperoni Pizza"))
        items.add(MyModel(R.drawable.frozenthinsausage,"Frozen Thin Crust Sausage Pizza"))
        items.add(MyModel(R.drawable.glutenfreedeepcheese,"Gluten Free Deep Dish Pizza"))
        items.add(MyModel(R.drawable.glutenfreethincheese,"Gluten Free Thin Crust Pizza"))
        items.add(MyModel(R.drawable.thincheese,"Thin Crust Cheese Pizza"))
        items.add(MyModel(R.drawable.thinpepperoni,"Thin Crust Pepperoni Pizza"))
        items.add(MyModel(R.drawable.thinsausage,"Thin Crust Sausage Pizza"))
        items.add(MyModel(R.drawable.thinspinach,"Thin Crust Spinach Pizza"))
        items.add(MyModel(R.drawable.thinthelou,"Thin Crust The Lou Specialty Pizza"))
        items.add(MyModel(R.drawable.thinveggie,"Thin Crust Veggie Specialty Pizza"))

        return items
    }

}