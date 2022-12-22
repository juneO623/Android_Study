package com.june0623.webviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView:WebView = findViewById(R.id.webView)
        val settings = webView.settings
        settings.javaScriptEnabled = true

        webView.loadUrl("https://www.google.com")

        val btnNaver:Button = findViewById(R.id.button)
        btnNaver.setOnClickListener {
            webView.loadUrl("https://www.naver.com")
        }
        val btnGoogle:Button = findViewById(R.id.button2)
        btnGoogle.setOnClickListener {
            webView.loadUrl("https://www.google.com")
        }
        val btnKakao:Button = findViewById(R.id.button3)
        btnKakao.setOnClickListener {
            webView.loadUrl("https://www.kakao.com")
        }
    }
}