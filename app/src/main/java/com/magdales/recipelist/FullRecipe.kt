package com.magdales.recipelist

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.support.v7.widget.Toolbar

class FullRecipe : AppCompatActivity() {

    companion object {
        val key = "123"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_recipe)

        if (intent != null) {
            val recipe = intent.getParcelableExtra<Recipe>(key)

            val recipeName = findViewById<TextView>(R.id.nameLbl)
            recipeName!!.text = recipe.name

            val recipeImage = findViewById<ImageView>(R.id.imageView)
            val drawable: Drawable? = resources.getDrawable(recipe.image)
            recipeImage!!.setImageDrawable(drawable)

            val recipeIngredients = findViewById<TextView>(R.id.ingredients)
            recipeIngredients!!.text = recipe.ingredients

            val recipeProcedures = findViewById<TextView>(R.id.procedures)
            recipeProcedures!!.text = recipe.procedures
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)
        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}
