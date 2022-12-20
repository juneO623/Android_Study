package com.june0623.listenertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {  // , View.OnClickListener
    var txtView:TextView? = null
    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val txtView:TextView = findViewById(R.id.text_view)
        txtView = findViewById<TextView>(R.id.text_view)
        txtView?.text = "Hello Android"

//        val mainBtn = findViewById<Button>(R.id.main_button)
//        //1
////        val listener = OnClickListener()
////        mainBtn.setOnClickListener(this)
//        //2
////        mainBtn.setOnClickListener({
////            clickCount++
////            txtView?.text = "$clickCount 번 눌러짐"
////        })
//        //3
//        mainBtn.setOnClickListener {
//            clickCount++
//            txtView?.text = "$clickCount 번 눌러짐"
//        }

        // 버튼 눌렀을 때 왼쪽 오른쪽 판별해서 텍스트 뷰에 띄워주기
//        val leftBtn:Button = findViewById(R.id.left_button)
//        val rightBtn:Button = findViewById(R.id.right_button)
//        leftBtn.text = "왼쪽"
//        rightBtn.text = "오른쪽"
////
////        leftBtn.setOnClickListener {
////            txtView?.text = "왼쪽"
////        }
////        rightBtn.setOnClickListener {
////            txtView?.text = "오른쪽"
////        }
//        leftBtn.setOnClickListener(this)
//        rightBtn.setOnClickListener(this)

        val btn1:Button = findViewById(R.id.button_1)
        val btn2:Button = findViewById(R.id.button_2)
        val btn3:Button = findViewById(R.id.button_3)
        val btn4:Button = findViewById(R.id.button_4)
        val btn5:Button = findViewById(R.id.button_5)

        btn1.text = "One"
        btn2.text = "Two"
        btn3.text = "Three"
        btn4.text = "Four"
        btn5.text = "Five"

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)


        // in linearLayout
        val b1:Button = findViewById(R.id.btn1)
        val b2:Button = findViewById(R.id.btn2)
        val b3:Button = findViewById(R.id.btn3)
        val b4:Button = findViewById(R.id.btn4)
        val b5:Button = findViewById(R.id.btn5)

        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        b5.setOnClickListener(this)



    }

    override fun onClick(p0: View?) {
        val result = when (p0?.id){
            R.id.button_1 -> "1번"
            R.id.button_2 -> "2번"
            R.id.button_3 -> "3번"
            R.id.button_4 -> "4번"
            R.id.button_5 -> "5번"
            else -> ""
        }
        txtView?.text = result
    }

//    // 버튼 눌렀을 때 왼쪽 오른쪽 판별해서 텍스트 뷰에 띄워주기
//    override fun onClick(v: View?) {
//        val result = when(v?.id){
//            R.id.left_button -> "left"
//            R.id.right_button -> "right"
//            else -> ""
//        }
//        txtView?.text = result
//    }


//
//    override fun onClick(p0: View?) {
//        clickCount++
//        txtView?.text = clickCount.toString() + " Button Clicked"
//
//    }
//
////    class OnClickListener : View.OnClickListener{
////        override fun onClick(p0: View?) {
////            println("Button Clicked")
////        }
////    }
}