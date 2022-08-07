package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var mBtnLinear: Button? = null
    var mBtnReal: Button? = null
    var mBtnTextView: Button? = null
    var mBtnButton: Button? = null
    var mEditTextViewBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnLinear = findViewById(R.id.btn_linear)
        mBtnLinear?.setOnClickListener {
            val inter = Intent(this, LinearLayoutActivity::class.java)
            startActivity(inter)
        }

        mBtnReal = findViewById(R.id.btn_rela)
        mBtnReal?.setOnClickListener {
            val inter = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(inter)
        }

        mBtnTextView = findViewById(R.id.btn_tv)
        mBtnTextView?.setOnClickListener(View.OnClickListener {
            val inter = Intent(this, TextViewActivity::class.java)
            startActivity(inter)
        })

        mBtnButton = findViewById(R.id.btn_btn)
        mBtnButton?.setOnClickListener {
            val inter = Intent(this, ButtonActivity::class.java)
            startActivity(inter)
        }

        mEditTextViewBtn = findViewById(R.id.btn_etv)
        mEditTextViewBtn?.setOnClickListener {
            val inter = Intent(this, EditTextViewActivity::class.java)
            startActivity(inter)
        }
    }

}