package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

private lateinit var webview: WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview = findViewById<WebView>(R.id.wb_webView)
        webview.settings.setJavaScriptEnabled(true)

        webview.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean{
                view?.loadUrl(url)
                return true
            }
        }
        webview.loadUrl("https://www.google.com/")
    }
}