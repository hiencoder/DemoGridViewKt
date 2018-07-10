package com.example.hiennv.demogridview.listview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.hiennv.demogridview.R
import com.squareup.picasso.Picasso

class RecipeAdapter(val context: Context, val listRecipe: ArrayList<Recipe>): BaseAdapter() {
    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        val view = inflater.inflate(R.layout.item_recipe,parent,false)
        val ivRecipe: ImageView = view.findViewById(R.id.iv_recipe)
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val tvDescription: TextView = view.findViewById(R.id.tv_description)
        val tvLabel: TextView = view.findViewById(R.id.tv_label)

        val recipe = getItem(position)
        Log.d("ImageUrl",recipe.imageUrl)
        //Picasso.with(context).load(recipe.imageUrl).into(ivRecipe)
        Glide.with(context).load(recipe.imageUrl).into(ivRecipe)
        tvTitle.text = recipe.titlte
        tvLabel.text = recipe.label
        tvDescription.text = recipe.description

        return view
    }

    override fun getItem(position: Int): Recipe {
        return listRecipe.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listRecipe.size
    }
}