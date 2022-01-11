package com.example.uidproject.chat

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.uidproject.R

class ChatListAdapter(private val context: Context
, private val arrayList: ArrayList<Chat>) : BaseAdapter() {
    private lateinit var sender : TextView
    private lateinit var message : TextView

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.chat, parent, false)
        sender = convertView.findViewById(R.id.chatSenderName)
        message = convertView.findViewById(R.id.chatMessage)

        sender.text = arrayList[position].sender
        message.text = arrayList[position].message
        return convertView
    }
}