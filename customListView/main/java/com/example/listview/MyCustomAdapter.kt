package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter (var ctx: Context, var ourResource: Int,
                       var Items: ArrayList<Model>): ArrayAdapter<Model>(ctx, ourResource, Items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        val name = view.findViewById<TextView>(R.id.name)
        val extra = view.findViewById<TextView>(R.id.extraText)
        val img = view.findViewById<ImageView>(R.id.img1)

        name.text = Items[position].Name
        extra.text = Items[position].extraText
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))

        return view
    }

                       }