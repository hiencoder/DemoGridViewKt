package com.example.hiennv.demogridview.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.hiennv.demogridview.R

class RecipeListActivity : AppCompatActivity() {
    @BindView(R.id.lv_recipe)
    lateinit var lvRecipe: ListView
    lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)
        ButterKnife.bind(this)

        recipeAdapter = RecipeAdapter(this,Recipe.parseJsonFromAsset("recipes.json",this))
        lvRecipe.adapter = recipeAdapter
    }
}
