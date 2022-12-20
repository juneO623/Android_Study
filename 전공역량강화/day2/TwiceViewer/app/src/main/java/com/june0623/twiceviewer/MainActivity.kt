package com.june0623.twiceviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val images = intArrayOf(R.drawable.twice1,R.drawable.twice2,
        R.drawable.twice3,R.drawable.twice4,
        R.drawable.twice5,R.drawable.twice6,
        R.drawable.twice7,R.drawable.twice8,R.drawable.twice9)
    var index = 0

    val names:Array<String> = arrayOf("사나", "나연", "쯔위", "미나",
        "지효", "채영", "다현", "정연", "모모")

    var imageView: ImageView? = null

    var btn1:Button? = null
    var btn2:Button? = null
    var idxText:TextView? = null
    var nameText:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView =findViewById(R.id.imageView)
        imageView?.setImageResource(R.drawable.twice1)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener(this)
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener(this)

        idxText = findViewById(R.id.idx_text)
        nameText = findViewById(R.id.name_text)

//        btn1.setOnClickListener {imageView.setImageResource(R.drawable.twice1)}
//        btn2.setOnClickListener {imageView.setImageResource(R.drawable.twice2)}

    }

    override fun onClick(p0: View?) {
//        btn1?.isEnabled = true
//        btn2?.isEnabled = true
//        var result = if (p0?.id == R.id.btn1 && index != 0){
//            index--
//            images[index]
//        } else if (p0?.id == R.id.btn2 && index != images.size - 1) {
//            index++
//            images[index]
//        } else {
//            p0?.isEnabled = index > 0
//            p0?.isEnabled = index < images.size - 1
//            images[index]
//        }
//        imageView?.setImageResource(result)
        btn1?.isEnabled = true
        btn2?.isEnabled = true
        if (p0?.id == R.id.btn1){
            index--
            p0?.isEnabled = index > 0
            setDisplay()
        } else {
            index++
            p0?.isEnabled = index < images.size - 1
            setDisplay()
        }
    }

    private fun setDisplay() {
        idxText?.text = "${index + 1} / ${images.size}"
        nameText?.text = names[index]
        imageView?.setImageResource(images[index])
    }
}