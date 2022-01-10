package com.example.uidproject.join_route

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.uidproject.R

class BuddyListAdapter(private val context: Context, private val arrayList: java.util.ArrayList<Buddy>) : BaseAdapter() {
    private lateinit var name: TextView
    private lateinit var rating: TextView

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
        convertView = LayoutInflater.from(context).inflate(R.layout.buddy_row, parent, false)
        name = convertView.findViewById(R.id.buddyName)
        rating = convertView.findViewById(R.id.buddyRating)

        name.text = arrayList[position].name
        rating.text = arrayList[position].rating
        return convertView
    }
}