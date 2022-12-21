package com.june0623.qatar2022

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val country = intent.getSerializableExtra("country") as Nation

        val detailFlagImageView:ImageView = findViewById(R.id.detail_flag)
        val detailName:TextView = findViewById(R.id.detail_name)

        detailFlagImageView.setImageResource(country.flag)
        detailName.text = country.name

    }
}