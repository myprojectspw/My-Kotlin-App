package com.example.myktolinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class Products : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Warzywko", "Owoc", "Koktajl", "Laseczka cukrowa"
        )
        var mListView = findViewById<ListView>(R.id.myListView)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
    }
