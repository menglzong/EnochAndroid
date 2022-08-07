package com.example.myapplication

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView

class TextViewActivity : AppCompatActivity() {

    var mtv: TextView? = null
    var mtv2: TextView? = null
    var mtv3: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)
        mtv = findViewById(R.id.textview_1)
        mtv?.paint?.flags = Paint.STRIKE_THRU_TEXT_FLAG
        mtv?.paint?.isAntiAlias = true

        mtv2 = findViewById(R.id.textview_2)
        mtv2?.paint?.flags = Paint.UNDERLINE_TEXT_FLAG
        mtv2?.paint?.isAntiAlias = true

        mtv3 = findViewById(R.id.textview_3)
        mtv3?.text = Html.fromHtml("<u>hahahhahha</u>")
    }
}