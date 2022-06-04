package com.szy.kt.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.szy.dailylearning.R
import com.szy.kt.activity.EventActivity

class MainRecyclerAdapter : RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {
    private var datas: List<String> = listOf()

    fun setData(datas: List<String>) {
        this.datas = datas
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.main_recycler_item_layout, null)
        return MainViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val content = datas[position]
        holder.tvBtn.text = content

        holder.tvBtn.setOnClickListener {
            val intent = Intent(holder.tvBtn.context, EventActivity::class.java)
            holder.tvBtn.context.startActivity(intent)
        }
    }


    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvBtn = itemView.findViewById<Button>(R.id.tv_content)
    }
}