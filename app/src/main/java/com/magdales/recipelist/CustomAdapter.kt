package com.magdales.recipelist

import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Lai on 12/8/2017.
 */
class CustomAdapter(val recipeList: ArrayList<Recipe>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    companion object {
        val key = "123"
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val recipe: Recipe = recipeList[position]
        holder?.txtName?.text = recipeList[position].name
        holder?.txtTitle?.text = recipeList[position].description

        holder?.cardView?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(v.context, FullRecipe::class.java)
                intent.putExtra(key, recipe)
                v.context.startActivity(intent)
            }
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtName = itemView.findViewById<TextView>(R.id.txtName)
        val txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        val cardView = itemView.findViewById<CardView>(R.id.cardView)
    }


}