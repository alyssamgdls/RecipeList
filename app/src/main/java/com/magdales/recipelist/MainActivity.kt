package com.magdales.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView1)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<Recipe>()
        users.add(Recipe("Paul", "Mr"))
        users.add(Recipe("Jane", "Miss"))
        users.add(Recipe("John", "Dr"))
        users.add(Recipe("Amy", "Mrs"))

        var adapter = CustomAdapter(users)
        rv.adapter = adapter
    }
}