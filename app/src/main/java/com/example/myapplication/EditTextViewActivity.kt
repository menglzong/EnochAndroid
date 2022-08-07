package com.example.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class EditTextViewActivity : AppCompatActivity() {

    var nameInput: EditText? = null
    var pwdInput: EditText? = null
    var loginBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_view)

        nameInput = findViewById(R.id.et_name)
        pwdInput = findViewById(R.id.et_pwd)
        loginBtn = findViewById(R.id.et_btn)
        loginBtn?.setOnClickListener {
            val name = nameInput?.text
            val pwd = pwdInput?.text
            Toast.makeText(this, "用户：$name，密码：$pwd", Toast.LENGTH_SHORT).show()
        }
    }
}