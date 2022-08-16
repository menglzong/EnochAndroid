package com.example.myapplication.http

import android.util.Log
import okhttp3.*
import java.io.IOException

object HiOkHttp {
    private val BASE_URL = "http://123.56.232.18:8080/serverdemo"
    private val client = OkHttpClient.Builder().build()
    fun get(url: String) {
//        thread {
//            //构造请求体
//            val request = Request.Builder().url(BASE_URL + url).build()
//            //构造请求对象
//            val call = client.newCall(request)
//            //同步执行
//            val response = call.execute()
//            println(response)
//        }.start()
        Thread(Runnable {
            //构造请求体
            val request = Request.Builder().url(BASE_URL + url).build()
            //构造请求对象
            val call = client.newCall(request)
            //同步执行
            val response = call.execute()
            var body: String? = response.body?.string()
            body?.let { Log.e("OkHttp", it) }
        }).start()
    }

    fun getAsync(url: String) {
        //构造请求体
        val request = Request.Builder().url(BASE_URL + url).build()
        //构造请求对象
        val call = client.newCall(request)
        //同步执行
        val response = call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e("OkHttp", e.toString())
            }

            override fun onResponse(call: Call, response: Response) {
                var body: String? = response.body?.string()
                body?.let { Log.e("OkHttp", it) }
            }
        })
    }
}