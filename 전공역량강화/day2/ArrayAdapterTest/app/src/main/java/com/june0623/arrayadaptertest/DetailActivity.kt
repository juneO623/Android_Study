package com.june0623.arrayadaptertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageId = intent.getIntExtra("image", 0)
        val name = intent.getStringExtra("name")

        val imageView:ImageView = findViewById(R.id.pretty_img)
        var txtName:TextView = findViewById(R.id.name_text)

        imageView.setImageResource(imageId)
        txtName.text = name

    }
}