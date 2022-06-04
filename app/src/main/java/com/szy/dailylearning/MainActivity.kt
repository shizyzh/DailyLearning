package com.szy.dailylearning

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.szy.kt.adapter.MainRecyclerAdapter

class MainActivity : Activity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MainRecyclerAdapter
    private val datas = listOf("事件分发")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.recycler_view)
        val layoutManger = LinearLayoutManager(this)
        layoutManger.orientation = RecyclerView.HORIZONTAL
        recyclerView.layoutManager = layoutManger
        adapter = MainRecyclerAdapter()
        adapter.setData(datas)
        recyclerView.adapter = adapter
    }

}