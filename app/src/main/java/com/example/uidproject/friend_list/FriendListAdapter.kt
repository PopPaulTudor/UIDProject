package com.example.uidproject.friend_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.uidproject.R

class FriendListAdapter(private val context: Context,
                        private val arrayList: ArrayList<Friend>) : BaseAdapter() {
    private lateinit var friendName: TextView

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
        convertView = LayoutInflater.from(context).inflate(R.layout.friend, parent, false)
        friendName = convertView.findViewById(R.id.friendName)

        friendName.text = arrayList[position].name
        return convertView
    }
}