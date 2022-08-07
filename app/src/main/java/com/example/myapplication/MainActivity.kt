package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var mBtnTextView: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnTextView = findViewById(R.id.btn_tv)
        mBtnTextView?.setOnClickListener(View.OnClickListener { v ->
            val inter = Intent(this, TextViewActivity::class.java)
            startActivity(inter)
        })
    }
}