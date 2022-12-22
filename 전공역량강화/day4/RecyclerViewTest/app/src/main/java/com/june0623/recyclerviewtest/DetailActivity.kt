package com.june0623.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val member = intent.getSerializableExtra("member") as Twice

        val imageView = findViewById<ImageView>(R.id.detail_image)
        imageView.setImageResource(member.imageId)
    }
}