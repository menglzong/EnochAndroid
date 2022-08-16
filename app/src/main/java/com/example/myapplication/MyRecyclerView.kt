package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerView : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        recyclerView = findViewById(R.id.recycler)
        recyclerView?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView?.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
        recyclerView?.adapter = MyAdapter()
    }

    class MyAdapter: RecyclerView.Adapter<MyViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_item, parent, false)
            return MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            var titleView = holder.itemView.findViewById<TextView>(R.id.title)
            titleView.text = "这是标题$position"

            var msgView = holder.itemView.findViewById<TextView>(R.id.text)
            msgView.text = "这是描述这是描述$position"

        }

        override fun getItemCount(): Int {
            return 20
        }

    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}