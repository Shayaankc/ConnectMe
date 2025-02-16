package com.shayaankhalid.i220863

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val postList: ArrayList<homepageModel>, val context: Context): RecyclerView.Adapter<PostAdapter.PostViewHolder>()
{

    class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val dp: ImageView = itemView.findViewById(R.id.dp)
        val username1: TextView = itemView.findViewById(R.id.username1)
        val postImage: ImageView = itemView.findViewById(R.id.postImage)
        val username2: TextView = itemView.findViewById(R.id.username2)
        val caption: TextView = itemView.findViewById(R.id.caption)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.post, parent, false)
        return PostViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentItem = postList[position]
        holder.dp.setImageResource(currentItem.dp)
        holder.username1.text = currentItem.username1
        holder.postImage.setImageResource(currentItem.postImage)
        holder.username2.text = currentItem.username2
        holder.caption.text = currentItem.caption
    }


}