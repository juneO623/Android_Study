package com.june0623.customadaptertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

//        val imageId = intent.getIntExtra("image", 0)
//        val name = intent.getStringExtra("name")

        val member = intent.getSerializableExtra("member") as Twice

        val detailImageView = findViewById<ImageView>(R.id.image_detail)
        val detailTextView = findViewById<TextView>(R.id.text_detail)

        detailImageView.setImageResource(member.imageId)
        detailTextView.text = member.name
    }
}